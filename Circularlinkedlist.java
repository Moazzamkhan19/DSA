public class Circularlinkedlist {
    Node head;
    Node tail;
    public Circularlinkedlist()
    {
        head=null;
        tail=null;
    }
    public void add(int val)
    {
        Node newNode = new Node(val);
        if (head == null)
        {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        }
        else
        {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }
    public void delete()
    {
        Node ptr=head;
        while(ptr.next!=tail)
        {
            ptr=ptr.next;
        }
        tail=null;
        ptr.next=head;
    }
    public void addmiddle(int val,int num)
    {
        Node newnode=new Node(val);
        Node ptr=head;
        Node prev=null;
        if(head==null)
        {
            head=newnode;
            ptr=newnode;
            newnode.next=head;
        }
        else
        {
            while(ptr.data!=num)
            {
                prev=ptr;
                ptr=ptr.next;
            }
            prev.next=newnode;
            newnode.next=ptr;
        }
    }
    public void addstart(int val)
    {
        Node newnode=new Node(val);
        if(head==null)
        {
           head=newnode;
           tail=newnode;
           newnode.next=head;
        }
        else
        {
            tail.next=newnode;
            newnode.next=head;
            head=newnode;
        }
    }
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(head)");
    }
}
