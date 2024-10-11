package OOPS2;

public class SB
{
    static int a=4;
    static int b;
    static
    {
        System.out.println("I am in static block");
        b=a*5;
    }

    public static void main(String[] args)
    {
        SB obj=new SB();
        System.out.println(a+"  "+b);
        b+=3;
        SB ob=new SB();
        System.out.println(a+"  "+b);

    }
}
