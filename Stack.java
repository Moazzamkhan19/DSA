import java.util.Stack;

public class Main {
    public static void main(String[] args)
    {
        //--------------------------------------stack------------------------------//
        Stack<Integer>Stack=new Stack<>();
        Stack.push(1);
        Stack.push(2);
        Stack.push(3);
        Stack.push(4); //1 is at bottom and 4 is at the top it is called LIFO last in first out

        System.out.println("top value before poping"+Stack.peek());
        System.out.println("Stack status "+Stack.empty());

        Stack.pop();
        System.out.println("top value after poping"+Stack.peek());

    }
}