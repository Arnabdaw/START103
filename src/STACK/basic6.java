package STACK;
    import java.util.Scanner;
    import java.util.Stack;

public class basic6
{
    public static void fun(Stack<Integer> s)
    {
        if(s.size()==0)
        {
            return;
        }
        int top=s.pop();
        fun(s);
        System.out.print(top+"   ");
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
        fun(st);
        System.out.println("\nupdated stack: " +st);

    }
}
