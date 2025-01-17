package ArrayList;

import java.util.ArrayList;

public class basics1
{
    static void fun()
    {
        ArrayList<Integer>l=new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l);
        System.out.println("index at 0th index="+l.get(0));
        l.set(0,10);
        System.out.println(l);
        System.out.println(l.contains(11));
        l.add(1,1);
        System.out.println(l);
        System.out.println(l.isEmpty());
        System.out.println(l.remove(0));
        System.out.println(l);
        System.out.println(l.size());

    }
    public static void main(String[] args)
    {
        fun();
    }
}
