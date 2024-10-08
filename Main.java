//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        CircularQueue cq=new CircularQueue();
        cq.Enqueue(1);
        cq.Enqueue(2);
        cq.Enqueue(3);
        cq.display();
        cq.Dequeue();
        cq.display();
        }
    }
