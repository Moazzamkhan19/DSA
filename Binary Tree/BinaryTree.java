public class BinaryTree {
    Node node;

    public BinaryTree() {
        node = null;
    }

    public Node insert(Node node, int key) {
        Node newnode = new Node(key);
        if (node == null) {
            node = newnode;
            return node; // return the root node
        } else if (key < node.key) {
            node.left = insert(node.left, key);
        } else if (key > node.key) {
            node.right = insert(node.right, key);
        }
        return node;
    }

    public Node Left(Node node) { //shows the left node of a parent node
        if (node == null) {
            return null;
        }
        return node.left;
    }

    public Node Right(Node node) {//shows the right node of a parent node
        if (node == null) {
            return null;
        }
        return node.right;
    }

    public boolean hasLeft(Node node) {
        if (node == null) {
            return false;
        }
        return node.left != null;
    }

    public boolean hasRight(Node node) {
        if (node == null) {
            return false;
        }
        return node.right != null;
    }

    public Node hasParent(Node node, Node root) {
        if (root == null) {
            return null;
        }
        if (root.left == node || root.right == node) {
            return root;
        }
        Node parent = hasParent(node, root.left);
        if (parent != null) {
            return parent;
        }
        return hasParent(node, root.right);
    }

    public Node sibling(Node node, Node root) {
        Node parent = hasParent(node, root);
        Node sibling = null;
        if (parent == null)
            return null;
        if (parent.left == node) {
            sibling = parent.right;
        }
        if (parent.right == node) {
            sibling = parent.left;
        }
        return sibling;
    }

    public Node RecursivePostOrder(Node node) {
        if (node != null) {
            RecursivePostOrder(node.left);
            RecursivePostOrder(node.right);

        }
        if (node != null) {
            System.out.print(node.key);

        }
        return node;
    }
    public Node RecursivePreOrder(Node node) {
        if (node != null) {
            System.out.print(node.key);

        }
        if (node != null) {
            RecursivePreOrder(node.left);
            RecursivePreOrder(node.right);

        }
        return node;
    }
    public Node RecursiveInOrder(Node node) {

        if (node != null) {
            RecursiveInOrder(node.left);
            System.out.print(node.key);
            RecursiveInOrder(node.right);

        }
        return node;
    }
       public Node isMax(Node node)
    {
       //check the minimum in right side of root only  OR max in left side
        if(node==null)
        {
            return null;
        }
        Node maxNode=node.left;
        while(maxNode.right!=null)
        {
            maxNode=maxNode.right;
        }
        return maxNode;
    }
    public Node Delete(Node root,int key)
    {
    if(root==null)
    {
        return null;
    }
    else if(key< root.key)
    {
        root.left=Delete(root.left,key);
    }
    else if(key>root.key)
    {
        root.right=Delete(root.right,key);
    }
    else
    {
        //CASE 1 . THE NODE IS LEAF NODE ( NO CHILD)
        if(!hasLeft(root) && !hasRight(root))
        {
            return null;
        }
        //CASE 2 . THE NODE HAS ONLY ONE CHILD
        else if(hasRight(root))
        {
           return root.right;
        }
        else if(hasLeft(root))
        {
           return root.left;
        }
        //CASE 3 . The NODE HAS 2 CHILDREN
        else
        {
            int temp=root.key;
            root=isMin(root.right);
            root.key=temp;
            root.right = Delete(root.right, root.key);
            return root.right;
        }
    }
    return root;
    }
}


