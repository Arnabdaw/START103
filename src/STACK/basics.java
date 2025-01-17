package STACK;

import javax.swing.*;
import java.util.LinkedList;
import java.util.Stack;

public class basics
{
    public static void main(String[] args)
    {
        Stack<Integer> st=new Stack<>();
        System.out.println("size="+st.size());
        System.out.println(st.isEmpty());
        st.push(2);
        st.push(10);
        st.push(23);
        st.push(49);
        st.push(5);
        System.out.println(st);
        System.out.println(st.isEmpty());
        System.out.println("size="+st.size());
        System.out.println(st.peek());
        st.pop();
        st.pop();
        System.out.println(st);
        System.out.println("size="+st.size());
        
    }
}
