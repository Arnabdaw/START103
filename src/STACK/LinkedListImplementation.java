package STACK;

public class LinkedListImplementation
{
    public static class Node
    {
        int val;
        Node next;
        public Node(int val)
        {
            this.val = val;
        }
    }
    public static class myStack
    {
        Node head=null;
        int size=0;
        void push(int x)
        {
            Node temp=new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }
        void disrec(Node head)
        {
            if(head==null)
            {
                return;
            }
            int top=head.val;
            disrec(head.next);
            System.out.print(top+"  ");
        }
        void display()
        {
            disrec(head);
            System.out.println();
        }
        int size()
        {
            return size;
        }
        int pop()
        {
            if(head==null)
            {
                System.out.println("stack is empty");
                return -1;
            }
            Node temp=head;
            int top=head.val;
            head=head.next;
            size--;
            return top;
        }
        int peek()
        {
            if(head==null)
            {
                System.out.println("stack is empty");
                return -1;
            }
            return head.val;
        }
        boolean isEmpty()
        {
            if(size==0)
                return true;
            return false;
        }

    }

    public static void main(String[] args)
    {
        myStack st=new myStack();
        st.push(4);
        st.push(5);
        st.push(34);
        st.push(23);
        st.push(51);

        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        st.push(23);
        st.display();
        st.push(12);
        st.display();
//        System.out.println(st.capacity());
        System.out.println(st.size());
        System.out.println(st.peek());
    }
}
