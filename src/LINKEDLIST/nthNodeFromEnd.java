package LINKEDLIST;

public class nthNodeFromEnd
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
//    public static Node fun(Node head,int n)
//    {
//        int size=0;
//        Node temp=head;
//        while(temp!=null)
//        {
//            size++;
//            temp=temp.next;
//        }
//        int m=size-n+1;
//        temp=head;
//        for(int i=1;i<m;i++)
//        {
//            temp=temp.next;
//        }
//        return temp;
//    }
    public static Node gun(Node head,int n)
    {
        Node slow=head;
        Node fast=head;
        for(int i=1;i<=n;i++)
        {
            fast=fast.next;
        }
        while(fast!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }


    public static void main(String[] args)
    {
        Node a=new Node(100);
        Node b=new Node(13);
        Node c=new Node(4);
        Node d=new Node(5);
        Node e=new Node(10);
        Node f=new Node(43);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        Node ans=gun(a,2);
        System.out.println(ans.data);

    }
}