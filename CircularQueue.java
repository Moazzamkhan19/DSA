
import java.util.LinkedList;

public class CircularQueue {
    LinkedList<Integer>list=new LinkedList<>();
    Node front;
    Node rear;

    public CircularQueue()
    {
        front=null;
        rear=null;
    }
    public void Enqueue(int val)
    {
        Node newNode=new Node(val);
        if(front==null)
        {
            front=newNode;
            rear=newNode;
            rear.next=front;
        }
        else
        {
            rear.next=newNode;
            rear=newNode;
            rear.next=front;
        }

    }
    public void Dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;}
            if (front == rear) {
                front = null;
                rear = null;
            } else {
                front = front.next;
                rear.next = front;
            }
        }

    public void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        Node ptr = front;
        do {
            System.out.println(ptr.data);
            ptr = ptr.next;
        } while (ptr != front); 
    }
}
