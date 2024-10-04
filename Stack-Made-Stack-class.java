public class Stack
{
    int[] stackarray;
    int top;
    int maxsize;

    public Stack(int size) {
        maxsize = size;
        stackarray = new int[maxsize];
        top = -1;
    }

    public void push(int value)
    {
        if(isFull())
        {
            System.out.println("Stack is full");
        }
        else
        {
            top++;
            stackarray[top]=value;
            System.out.println("Value "+value+" pushed to Stack");
        }
    }
    public void pop()
    {
        if(isempty())
        {
            System.out.println("Stack is empty cannot remove any value");
        }
        else
        {
            int removedvalue=stackarray[top];
            top--;
            System.out.println("value poped "+removedvalue);

        }    }
    public void peek()
    {
        if(isempty())
        {
            System.out.println("Stack empty");
        }
        else
        {
            System.out.println(stackarray[top]);

        }    }
    public boolean isFull()
    {
        return (top==maxsize-1);
    }
    public boolean isempty()
    {
        return (top==-1);
    }
}
