package OOPS2.EXCEPTION;

public class Fain
{
    public static void m1()
    {
        m2();
    }
    public static void m2()
    {
        System.out.println(10/0);
    }

    public static void main(String[] args)
    {
        try
        {
            m1();
        }
        catch (ArithmeticException e)
        {
            System.out.println("Exception handled by main method ." +e);
        }
        System.out.println("main method ended");
    }
}
