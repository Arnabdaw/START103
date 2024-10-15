package OOPS2.EXCEPTION;

public class Chain
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("main method started");
            int a=10,b=0,c;
            c=a/b;
            System.out.println(c);

            int arr[]={10,20,30,40};
            System.out.println(arr[5]);

            String str=null;
            System.out.println(str.toUpperCase());
        }
        catch(ArrayIndexOutOfBoundsException e1)
        {
            System.out.println("Array exception");
        }
        catch(ArithmeticException e2)
        {
            System.out.println("Arithmetic Exception");
        }
        catch (Exception e3)
        {
            System.out.println("All type of exceptions are handled");
        }
        System.out.println("main method ended");
    }
}
