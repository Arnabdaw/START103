package STACK;
import java.util.Stack;

public class problem6
{
    public static int[] fun(int[] arr)
    {
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        int pse[]=new int[n];
        for(int i=0;i<n;i++)
        {
            while(st.size()>0 && arr[i]<st.peek())
            {
                st.pop();
            }
            if(st.size()==0)
            {
                pse[i]=-1;
            }
            else
            {
                pse[i]=st.peek();
            }
            st.push(arr[i]);
        }
        return pse;
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
