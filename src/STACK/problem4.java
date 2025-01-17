package STACK;
import java.util.Stack;

public class problem4
{
    public static int[] fun(int[] arr)
    {
        int n=arr.length;
        Stack<Integer>st=new Stack<>();
        int ans[]=new int[n];
        st.push(0);
        for(int i=1;i<n;i++)
        {
            while(!st.isEmpty() && arr[i]>arr[st.peek()])
            {
                ans[st.peek()]=arr[i];
                st.pop();
            }
            st.push(i);
        }
        while(!st.isEmpty())
        {
            ans[st.peek()]=-1;
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int arr[]={1,5,3,2,1,6,3,4};
        int res[]=fun(arr);
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
}
