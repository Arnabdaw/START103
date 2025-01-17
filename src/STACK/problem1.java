package STACK;

import java.util.Scanner;
import java.util.Stack;

public class problem1
{
    public static boolean fun(String str)
    {
        Stack<Character>st=new Stack<>();
        int n=str.length();
        for(int i=0;i<n;i++)
        {
            char ch=str.charAt(i);
            if(ch=='(')
                st.push(ch);
            else
            {
                if(st.size()==0)
                    return false;
                if(st.peek()=='(')
                    st.pop();
            }
        }
        if(st.isEmpty())
            return true;
        return false;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a character string:");
        String str=sc.nextLine();
        System.out.println(fun(str));
    }
}
