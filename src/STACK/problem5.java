package STACK;

import java.util.Stack;

public class problem5
{
    public static int[] fun(int[] arr)
    {
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        int nse[]=new int[n];
        for(int i=n-1;i>=0;i--)
        {
            while(st.size()>0 && arr[i]<st.peek())
            {

                st.pop();
            }
            if(st.size()==0)
            {
                nse[i]=-1;
            }
            else
            {
                nse[i]=st.peek();
            }
            st.push(arr[i]);
        }
        return nse;
    }
    public static void main(String[] args)
    {
        int arr[]={5,2,4,6,3,5};
        int res[]=fun(arr);
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
}
