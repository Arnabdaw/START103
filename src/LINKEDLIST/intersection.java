package LINKEDLIST;

import java.util.Scanner;

public class intersection
{
    public static  class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
        }
    }
    public static class LandList
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
        void display(Node head)
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+"   ");
                temp=temp.next;
            }
        }
        public static Node fun(LandList l1, LandList l2)
        {
            int size1=0;
            Node temp1=l1.head;
            while(temp1!=null)
            {
                size1++;
                temp1=temp1.next;
            }
            int size2=0;
            Node temp2=l2.head;
            while(temp2!=null)
            {
                size2++;
                temp2=temp2.next;
            }


            temp1=l1.head;
            temp2=l2.head;

           if(size1>size2)
           {
               int diff=size1-size2;
               for(int i=1;i<=diff;i++)
               {
                   temp1=temp1.next;
               }
           }
           else
           {
               int diff=size2-size1;
               for(int i=1;i<=diff;i++)
               {
                   temp2=temp2.next;
               }
           }
            while(temp1!=temp2)
            {
                temp1=temp1.next;
                temp2=temp2.next;
            }
            return temp1;
        }

    }

    public static void main(String[] args)
    {
        LandList l1=new LandList();
        Scanner obj=new Scanner(System.in);
        int size1,size2;

        System.out.println("enter the size of first linked list");
        size1=obj.nextInt();

        System.out.println("enter the first linked list elements");
        for(int i=1;i<=size1;i++)
        {
            l1.insertAtEnd(obj.nextInt());
        }
        System.out.println();


        LandList l2=new LandList();
        System.out.println("enter the size of second linked list");
        size2=obj.nextInt();

        System.out.println("enter the second linked list elements");
        for(int i=1;i<=size2;i++)
        {
            l2.insertAtEnd(obj.nextInt());
        }
        System.out.println();

        l1.display(l1.head);
        System.out.println();
        l2.display(l2.head);
        System.out.println();
//        System.out.println(l1.head.data);
//        System.out.println(l1.tail.data);
//        System.out.println(l2.head.data);
//        System.out.println(l2.tail.data);
        Node ans=LandList.fun(l1,l2);
        System.out.println(ans);

    }

}
