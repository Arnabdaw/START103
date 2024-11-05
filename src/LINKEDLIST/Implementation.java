package LINKEDLIST;


public class Implementation
{
    public static class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
        }
    }
    public static class linkedList
    {
        int size=0;
        Node head=null;
        Node tail=null;

        void insertAtEnd(int val)
        {
            Node temp=new Node(val);
             if(head==null)
             {
                 head=temp;
             }
             else
             {
                 tail.next=temp;
             }
             tail=temp;
             size++;
        }

        void insertAtBeg(int val)
        {

            Node temp=new Node(val);
            if(head==null)
            {
                head=tail=temp;
            }
            else
            {
                temp.next=head;
                head=temp;
            }
            size++;
        }

        void insertAtPos(int pos,int val)
        {
            Node temp=new Node(val);
            Node ptr=head;
            if(pos<0 || pos>size)
            {
                System.out.println("Wrong position");
                return;
            }
            if(pos==0)
            {
                insertAtBeg(val);
                return ;
            }
            if(pos==size)
            {

                insertAtEnd(val);
                return ;
            }
            else
            {
                for(int i=1;i<pos;i++)
                {
                    ptr=ptr.next;
                }
                temp.next=ptr.next;
                ptr.next=temp;
            }
            size++;
        }
        int getAt(int pos)
        {
            if(pos<0 || pos>=size)
            {
                System.out.println("Wrong position");
                return -1;
            }
            Node temp=head;
            for(int i=0;i<pos;i++)
            {
                temp=temp.next;
            }
            return temp.data;
        }
        void deleteAt(int pos)
        {
            if(pos<0 || pos>=size)
            {
                System.out.println("Deletion not possible at this position");
                return ;
            }
            Node temp=head;
            if(pos==0)
            {
                head=head.next;
                size--;
                return;
            }
            if(pos==size-1)
            {
                for(int i=1;i<pos;i++)
                {
                    temp=temp.next;
                }
                temp.next=null;
                tail=temp;
            }
            else
            {
                for(int i=1;i<pos;i++)
                {
                    temp=temp.next;
                }
                temp.next=temp.next.next;
            }
            size--;
        }

        public  void display()
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+"  ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        linkedList ll=new linkedList();
        ll.insertAtEnd(10);
        ll.insertAtEnd(20);
        ll.insertAtEnd(30);
        ll.insertAtEnd(40);
        ll.insertAtEnd(50);
        ll.insertAtBeg(60);
        ll.insertAtBeg(70);

        ll.display();
        System.out.println("head="+ll.head.data);
        System.out.println("tail="+ll.tail.data);
        System.out.println("size="+ll.size);

        System.out.println();
        ll.insertAtPos(2,1000  );


        ll.display();


        System.out.println("head="+ll.head.data);
        System.out.println("tail="+ll.tail.data);

        System.out.println("size="+ll.size);
        System.out.println("data at 5th position="+ll.getAt(5));
        System.out.println();

        ll.deleteAt(6);
        ll.display();

        ll.deleteAt(7);

        System.out.println(ll.head.data);
        System.out.println(ll.tail.data);
        System.out.println("size="+ll.size);

    }

}
