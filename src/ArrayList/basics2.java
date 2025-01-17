
package ArrayList;

import java.util.LinkedList;

public class basics2
{
    static void fun()
    {
        LinkedList<Integer> l=new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.addFirst(10);
        l.addLast(100);
        System.out.println(l);
        System.out.println(l.get(4));
        l.set(0,69);
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
