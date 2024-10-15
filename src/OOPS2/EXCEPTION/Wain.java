package OOPS2.EXCEPTION;

public class Wain
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("main started");
            System.out.println(10/0);
        }
        catch(Exception e1)
        {

            try
            {
                String str=null;
                System.out.println(str.toUpperCase());
            }
            catch (Exception e2)
            {
                System.out.println("null can't be converted");
            }
            System.out.println("division by zero is not possible");
        }
        System.out.println("main ended");

    }
}
