package LINKEDLIST;

public class Main
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
    public static void main(String[] args)
    {
        Node a=new Node(10);
        System.out.println(a.next);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        a.next=b;
        System.out.println(a.next);
        System.out.println(b);

    }
}
