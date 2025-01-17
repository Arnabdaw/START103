package ArrayList;

import java.util.Scanner;
import java.util.Stack;

public class basic5
{
    public static void rematbot(Stack<Integer> st,int idx)
    {
        Stack<Integer>rt=new Stack<>();
        while(st.size()>idx+1)
        {
            rt.push(st.pop());
        }
        st.pop();
        while(rt.size()>0)
        {
            st.push(rt.pop());
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        st.push(13);
        st.push(29);
        st.push(7);
        st.push(9);
        st.push(12);
        System.out.println(st);
        rematbot(st,2);
        System.out.println(st);
    }
}
