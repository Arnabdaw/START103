package LINKEDLIST;

import java.util.Collections;
import java.util.LinkedList;

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
//                temp.next=head;
//                head=temp;
                insertAtBeg(val);
                return ;
            }
            if(pos==size)
            {
//                tail.next=temp;
//                tail=temp;
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
    public static void main(String[] args) throws NullPointerException
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
        System.out.println(ll.tail.data);
        System.out.println(ll.head.data);
        System.out.println("size="+ll.size);

        System.out.println();
        ll.insertAtPos(8,2  );


        ll.display();

        System.out.println(ll.tail.data);
        System.out.println(ll.head.data);

        System.out.println("size="+ll.size);

    }

}
