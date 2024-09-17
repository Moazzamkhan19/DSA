public class Stack
{
    int maxsize;
    int top;
    int[] stack;
    public Stack(int size)
    {
        top=-1;
        maxsize=size;
        stack=new int[maxsize];
    }
    public void push(int value)
    {
        if(isfull())
        {
            System.out.println("Full");
        }
        else {
            top++;
            stack[top]=value;
        }
    }
    public int pop(){
        if (isempty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        else
        {
            return stack[top--];
        }
    }
    public int peek()
    {
        return (stack[top]);
    }

    public boolean isfull(){
        return (top==maxsize-1);
    }
    public boolean isempty(){
        return (top==-1);
    }
}
