package OOPS2.EXCEPTION;

public class Lain
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("main method started");
            int a=10,b=0,c;
            c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("can't divide by zero");
        }
        finally
        {
            System.out.println("i am in finally block ");
        }
        System.out.println("main method ended");
    }
}
