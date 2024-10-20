package LINKEDLIST;

public class Main
{
    public static  int length(Node head)
    {
        int count=0;
        while(head!=null)
        {
            count++;
            head=head.next;
        }
        return count;
    }
    public static void display(Node head)
    {
//        while(head!=null)
//        {
//            System.out.print(head.data);
//            System.out.print("-->");
//            head=head.next;
//        }
//        System.out.println("\b\b\b");

        if(head==null)
        {
            return ;
        }
        System.out.print(head.data+"  ");
        display(head.next);
    }

    public static class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
        }

    }

    public static void main(String[] args)
    {
        Node a=new Node(10);

        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;


        display(a);
        System.out.println();
        int l=length(a);
        System.out.println(l);
//        Node temp=a;
//        while(temp!=null)
//        {
//            System.out.print(temp.data);
//            System.out.print("-->");
//            temp=temp.next;
//        }
//        System.out.println("\b\b\b");

    }
}
