package LINKEDLIST;

import java.lang.module.ResolutionException;

public class solution
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
    public static  class Diwali
    {
        Node head=null;
        Node tail=null;
        void insertAtEnd(int x)
        {
            Node temp=new Node(x);
            if(head==null)
            {
                head=temp;
            }
            else
            {
                tail.next=temp;
            }
            tail=temp;
        }

        public  Node fun(Node head)
        {
            Node slow=head;
            Node  fast=head;
            while(fast.next!=null && fast.next.next!=null)
            {
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;
        }

    }

    public static void main(String[] args)
    {

        Diwali l=new Diwali();
        l.insertAtEnd(100);
        l.insertAtEnd(13);
        l.insertAtEnd(4);
        l.insertAtEnd(5);
        l.insertAtEnd(12);
        l.insertAtEnd(10);

        Node ans=l.fun(l.head);
        System.out.println(ans.data);
    }
}
