package STACK;

import java.util.Stack;

public class problem2
{
    public static int[] funn(int[] arr)
    {
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            if(st.isEmpty() || st.peek()!=arr[i])
            {
                st.push(arr[i]);
            }
            else if(st.peek()==arr[i])
            {
                if(i==arr.length-1 || arr[i]!=arr[i+1])
                {
                    st.pop();
                }
            }
        }
        int n=st.size();
        int x[]=new int[n];
        for(int i=n-1;i>=0;i--)
        {
            x[i]=st.pop();
        }
        return x;
    }
    public static void main(String[] args)
    {
        int arr[]={1,2,2,3,10,10,10,4,4,4,5,7,7,7};
        int res[]=funn(arr);
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
}
