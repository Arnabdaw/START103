package OOPS2.POLYMORPHISM;

import com.sun.jdi.event.ThreadStartEvent;

public class This
{
    int a;
    This()
    {
//        System.out.println("I am in default constructor");
        this(100);

    }
    This(int a)
    {
//        this();
        System.out.println("I am in parametrized constructor");
        System.out.println(a);
    }

    public static void main(String[] args) {
        This obj=new This();
//        obj.show();
    }
}
