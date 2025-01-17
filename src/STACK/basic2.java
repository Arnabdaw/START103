package STACK;


import java.util.Scanner;
import java.util.Stack;

public class basic2
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int size;
        Stack<Integer> st=new Stack<>();
        System.out.println("enter the number of elements u want to insert :");
        size=obj.nextInt();
        System.out.println("enter the elements:");
        for(int i=1;i<=size;i++)
        {
            int x=obj.nextInt();
            st.push(x);
        }
        System.out.println(st);
        Stack<Integer>gt=new Stack<>();
        while(st.size()>0)
        {
            gt.push(st.pop());
        }
        System.out.println(gt);//reverse of st

        Stack<Integer> rt=new Stack<>();
        while(gt.size()>0)
        {
            rt.push(gt.pop());
        }
        System.out.println(rt);

    }
}
