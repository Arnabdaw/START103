package OOPS2.EXCEPTION;

public class Jain
{
    public static void fun() throws InterruptedException
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }

    public static void main(String[] args)
    {
        try
        {
            fun();
            System.out.println(10/0);
        }
        catch(Exception e)
        {
            System.out.println("exception handled");
        }
        System.out.println("main method ended");
    }
}
