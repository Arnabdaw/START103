package STACK;

import java.util.Scanner;
import java.util.Stack;

public class basic4
{
    public static void displayreverserec(Stack<Integer>s)
    {
        if(s.size()==0)
        {
            return;
        }
        int top=s.pop();
        System.out.print(top+"   ");
        displayreverserec(s);
        s.push(top);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(13);
        st.push(29);
        st.push(7);
        st.push(9);
        st.push(11);
        System.out.println("current stack: " + st);
        displayreverserec(st);
        System.out.println("\nupdated stack: " +st);

    }
}
