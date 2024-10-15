package OOPS2.EXCEPTION;

public class Gain
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("main method started");
            try
            {
                int a[]={10,20,30};
                System.out.println(a[5]);
            }

            catch(ArrayIndexOutOfBoundsException e1)
            {
                System.out.println("Array exception");
            }
            System.out.println(10/0);
        }
        catch(Exception e2)
        {
            System.out.println("division by zero is not possible");
        }
        System.out.println("main method ended");
    }
}
