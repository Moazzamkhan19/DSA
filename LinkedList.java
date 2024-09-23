public class LinkedList extends Node {
    Node head;
    Node ptr;

    public LinkedList() {
    }

    public void add(int val)
    {
        Node newNode=new Node(val);
        if(head==null)
        {
            head=newNode;
        }
        else
        {
            ptr=head;
            while (ptr.next!=null)
            {
                ptr=ptr.next;
            }
            ptr.next=newNode;
        }

    }
    public void addatfront(int val)
    {
        Node newNode=new Node(val);
        if(head==null)
        {
            head=newNode;
        }
        else
        {
            newNode.next=head;
            head=newNode;
        }
    }

    public void addmiddle(int val,int num)//num is the number before which we will place number
                                            //val is the value that will be placed
    {
        Node newNode=new Node(val);
        if(head==null)
        {
            head=newNode;
        }
        else
        {
            Node prev = null; //head one
            Node curr; // head two
            curr=head;
            while(curr!=null && curr.data!=num)
            {
                prev=curr;
                curr=curr.next;
            }
            if (curr != null) {
                newNode.next = curr;
                if (prev != null) {
                    prev.next = newNode;
                } else {
                    head = newNode;
                }
            }
        }
    }

    public void delete()
    {
        if(head!=null)
        {
            head=head.next;
        }
    }
    public void deleteend()
    {
        if (head == null) {
            return;
        }
       Node prev=null;
        Node curr=head;
        while(curr.next!=null)
        {
            prev=curr;
            curr=curr.next;
        }
        prev.next=null;

    }

    public void deletemiddle(int num)
    {
        Node prev=null;
        Node curr=head;
        while(curr.data!=num)
        {
            prev=curr;
            curr=curr.next;
        }
        if (curr != null)
        {
            prev.next = curr.next;
        }
    }

    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
