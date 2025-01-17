package ArrayList;

import java.util.Stack;

public class basics3
{
    static void fun()
    {
        Stack<Integer>l=new Stack<>();
        System.out.println(l);
        System.out.println(l.isEmpty());
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l.peek());
        l.push(4);
        l.push(5);
        System.out.println(l);
        System.out.println(l.remove(2));
        System.out.println(l);
        System.out.println(l.size());
    }
    public static void main(String[] args)
    {
        fun();
    }
}
