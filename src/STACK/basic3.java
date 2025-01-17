package STACK;

import java.util.Scanner;
import java.util.Stack;

public class basic3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Stack<Integer>st=new Stack<>();
        st.push(13);
        st.push(29);
        st.push(7);
        st.push(9);
        st.push(11);
        System.out.println("current stack: "+st);
//        System.out.println("enter any element :");
        int ele=69;
//        System.out.println("enter the position");
        int idx=5;
        if(idx>st.size() ||idx<0)
        {
            System.out.println("invalid index!!");
            return;
        }
        Stack<Integer>rt=new Stack<>();
        while(st.size()>idx)
        {
            rt.push(st.pop());
        }
        st.push(ele);
        while(rt.size()>0)
        {
            st.push(rt.pop());
        }
        System.out.println("updated stack: "+st);
    }
}