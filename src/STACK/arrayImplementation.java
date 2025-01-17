package STACK;

public class arrayImplementation
{
    public static class myStack
    {
        private int[] arr=new int[5];
        private int idx=0;
        void push(int x)
        {
            if(isFull())
            {
                System.out.println("stack is full");
                return;
            }
            arr[idx]=x;
            idx++;
        }
        int peek()
        {
            if(idx==0)
            {
                System.out.println("stack is empty");
                return -1;
            }
            return arr[idx-1];
        }
        int pop()
        {
            if(idx==0)
            {
                System.out.println("stack is empty");
                return -1;
            }
            int top=arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }
        void display()
        {
            for(int i=0;i<=idx-1;i++)
            {
                System.out.print(arr[i]+"  ");
            }
            System.out.println();
        }
        int size()
        {
            return idx;
        }
        int capacity()
        {
            return arr.length;
        }
        boolean isEmpty()
        {
            if(idx==0)
                return true;
            return false;
        }
        boolean isFull()
        {
            if(idx==arr.length)
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
        System.out.println(st.capacity());
        System.out.println(st.size());
        System.out.println(st.peek());
    }
}
