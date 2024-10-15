import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        Node root = null;
        Scanner scanner = new Scanner(System.in);
        Node leftchild = null;
        Node rightchild = null;
        while (true) {
            System.out.println("Binary Tree Operations");
            System.out.println("1. Insert Node");
            System.out.println("2. Left Node");
            System.out.println("3. Right Node");
            System.out.println("4. Has Left");
            System.out.println("5. Has Right");
            System.out.println("6. Has Parent");
            System.out.println("7. Sibling");
            System.out.println("8. Recursive Post Order");
            System.out.println("9. Recursive Pre Order");
            System.out.println("10. Recursive In Order");
            System.out.println("11. Display");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter key to insert: ");
                    int key = scanner.nextInt();
                    root = bt.insert(root, key);
                    break;
                case 2:
                    if (root == null) {
                        System.out.println("Tree is empty");
                    } else {
                        leftchild = bt.Left(root);
                        if (leftchild != null) {
                            System.out.println("Left node: " + leftchild.key);
                        } else {
                            System.out.println("No left node");
                        }
                    }
                    break;
                case 3:
                    if (root == null) {
                        System.out.println("Tree is empty");
                    } else {
                        rightchild = bt.Right(root);
                        if (rightchild != null) {
                            System.out.println("Right node: " + rightchild.key);
                        } else {
                            System.out.println("No right node");
                        }
                    }
                    break;
                case 4:
                    if (leftchild == null) {
                        System.out.println("Left child node is null");
                    } else {
                        boolean hasleft = bt.hasLeft(leftchild);
                        System.out.println("Node " + leftchild.key + " has left child: " + hasleft);
                    }
                    break;
                case 5:
                    if (rightchild == null) {
                        System.out.println("Right child node is null");
                    } else {
                        boolean hasright = bt.hasRight(rightchild);
                        System.out.println("Node " + rightchild.key + " has right child: " + hasright);
                    }
                    break;
                case 6:
                    if (leftchild == null) {
                        System.out.println("Left child node is null");
                    } else {
                        Node hasparent = bt.hasParent(leftchild, root);
                        if (hasparent != null) {
                            System.out.println("Parent of " + leftchild.key + " is: " + hasparent.key);
                        } else {
                            System.out.println("No parent node");
                        }
                    }
                    break;
                case 7:
                    if (leftchild == null) {
                        System.out.println("Left child node is null");
                    } else {
                        Node sibling = bt.sibling(leftchild, root);
                        if (sibling != null) {
                            System.out.println("Sibling of " + leftchild.key + " is: " + sibling.key);
                        } else {
                            System.out.println("No sibling node");
                        }
                    }
                    break;
                case 8:
                    if (root == null) {
                        System.out.println("Tree is empty");
                    } else {
                        bt.RecursivePostOrder(root);
                    }
                    break;
                case 9:
                    if (root == null) {
                        System.out.println("Tree is empty");
                    } else {
                        bt.RecursivePreOrder(root);
                    }
                    break;
                case 10:
                    if (root == null) {
                        System.out.println("Tree is empty");
                    } else {
                        bt.RecursiveInOrder(root);
                    }
                    break;
                case 11:
                    if (root == null) {
                        System.out.println("Tree is empty");
                    } else {
                        Display(root);
                        System.out.println();
                    }
                    break;
                case 0:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void Display(Node node) {
        if (node == null) return;
        System.out.print(" " + node.key);
        if (node.left != null) {
            Display(node.left);
        }
        if (node.right != null) {
            Display(node.right);
        }
    }
}
