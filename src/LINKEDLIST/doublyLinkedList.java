package LINKEDLIST;

public class doublyLinkedList
{
    public static class Node
    {
        int val;
        Node next;
        Node prev;

        public Node(int val)
        {
            this.val = val;
        }
    }

    public static void displayhead(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val+"   ");
            temp=temp.next;
        }
        System.out.println();;
    }

    public static void displaytail(Node tail)
    {
        Node temp=tail;
        if(temp==null)
        {
            return;
        }
        displaytail(tail.prev);
        System.out.print(tail.val+"   ");
    }

    public static void displayrev(Node tail)
    {
        Node temp=tail;
        while(temp!=null)
        {
            System.out.print(temp.val+"   ");
            temp=temp.prev;
        }
        System.out.println();
    }
    public static void displayrandom(Node random)
    {
        Node temp=random;
        while(temp.prev!=null)
        {
            temp=temp.prev;
        }
        while(temp!=null)
        {
            System.out.print(temp.val+"   ");
            temp=temp.next;
        }
        System.out.println();
    }



    public static void main(String[] args)
    {
        //4 10 2 99 13
        Node a=new Node(4);
        Node b=new Node(10);
        Node c=new Node(2);
        Node d=new Node(99);
        Node e=new Node(13);
        a.next=b;
        a.prev=null;
        b.next=c;
        b.prev=a;
        c.next=d;
        c.prev=b;
        d.next=e;
        d.prev=c;
        e.prev=d;
        e.next=null;
        displayhead(a);
        displaytail(e);
        System.out.println();
        displayrev(e);
        displayrandom(c);
    }
}
