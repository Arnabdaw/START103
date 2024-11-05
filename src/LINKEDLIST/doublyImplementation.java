package LINKEDLIST;

public class doublyImplementation
{
    public static class Node
    {
        int val;
        Node prev;
        Node next;
        public Node(int val)
        {
            this.val = val;
        }
    }
    public static class doublyLL
    {
        int size=0;
        Node head=null;
        Node tail=null;
        void insertAtBeg(int value)
        {
            Node temp=new Node(value);
            if(head==null)
            {
                head=tail=temp;
            }
            else
            {
                temp.next=head;
                head.prev=temp;
                head=temp;
            }
            size++;
        }
        void insertAtEnd(int value)
        {
            Node temp=new Node(value);
            if(head==null)
            {
                head=temp;
            }
            else
            {
                tail.next=temp;
                temp.prev=tail;
            }
            tail=temp;
            size++;
        }

        void insertAtPos(int pos,int val)
        {
            if(pos<0 || pos>size)
            {
                System.out.println("invalid position!!");
                return ;
            }
            if(pos==0)
            {
                insertAtBeg(val);
                return;
            }
            if(pos==size)
            {
                insertAtEnd(val);
                return;
            }
            Node temp=new Node(val);
            Node ptr=head;
            for(int i=1;i<pos;i++)
            {
                ptr=ptr.next;
            }
            temp.next=ptr.next;
            ptr.next=temp;
            temp.prev=ptr;
            temp.next.prev=temp;
            size++;
        }

        void deleteAtPos(int pos)
        {
            if(pos<0 || pos>=size)
            {
                System.out.println("invalid position");
                return;
            }
            if(pos==0)
            {
                head=head.next;
                head.prev=null;
            }
            if(pos==size-1)
            {
                tail=tail.prev;
                tail.next=null;
            }
            Node temp=head;
            for(int i=1;i<pos;i++)
            {
                temp=temp.next;
            }
            temp.next.next.prev=temp;
            temp.next=temp.next.next;
            size--;
        }


        void display(Node head)
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.val+"    ");
                temp=temp.next;
            }
            System.out.println();
        }

    }

    public static void main(String[] args)
    {
        doublyLL ll=new doublyLL();
        ll.insertAtEnd(4);
        ll.insertAtEnd(10);
        ll.insertAtEnd(2);
        ll.insertAtEnd(99);
        ll.insertAtBeg(69);
        ll.insertAtEnd(13);
        ll.display(ll.head);

        ll.insertAtPos(8,69);
        ll.deleteAtPos(3);

        ll.display(ll.head);
        System.out.println(ll.size);
//        System.out.println(ll.size);
//        System.out.println(ll.head.val);
//        System.out.println(ll.head.prev);
//        System.out.println(ll.tail.val);
//        System.out.println(ll.tail.next);
//        System.out.println(ll.tail.prev.prev.prev.val);
    }
}
