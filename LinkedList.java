public class LinkedList {
    Node head;
    public LinkedList()
    {
        head=null;
    }
    public void Add(int val)
    {
        Node newnode=new Node(val);
        if(head==null)
        {
            head=newnode;
        }
        else
        {
            Node ptr=head;
            while(ptr.next!=null)
            {
                ptr=ptr.next;
            }
            ptr.next=newnode;
        }
    }
    public void Delete()
    {
        Node ptr=head;
        if(head==null)
        {
            System.out.println("List is empty");
        }
        else
        {
            while(ptr.next.next!=null)
            {
                ptr=ptr.next;
            }
            ptr.next=null;
        }
        System.out.println("Node deleted");
    }
    public void Display()
    {
        Node ptr=head;
        while(ptr!=null)
        {
            System.out.println(ptr.data);
            ptr=ptr.next;
        }

    }
    public void addfront(int val)
    {
        Node newnode=new Node(val);
        if(head==null)
        {
            head=newnode;
        }
        else
        {
            newnode.next=head;
            head=newnode;
        }
    }
    public void addmiddle(int val,int num)//num is the position after Node will be inserted
    {
        Node newnode=new Node(val);
        if(head==null)
        {
            head=newnode;
        }
        else
        {
            Node curr =head;
            Node prev =null;
            while (curr.data!=num)
            {
                prev=curr;
                curr=curr.next;
            }
            prev.next=newnode;
            newnode.next=curr;
        }
    }

    public void deletemiddle(int num)//num is the position after Node will be inserted
    {
            Node curr =head;
            Node prev =null;
            while (curr.data!=num)
            {
                prev=curr;
                curr=curr.next;
            }
            prev.next=curr.next;
        }
        public void deletestar()
        {
            Node ptr=head;
            head=ptr.next;
            ptr=null;
        }
}
