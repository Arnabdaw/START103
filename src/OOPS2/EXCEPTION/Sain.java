package OOPS2.EXCEPTION;

public class Sain
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("main method started");
            String str=null;
            System.out.println(str.toUpperCase());
        }
        catch (Exception e1)
        {
            System.out.println("null can't be converted");
        }
        finally
        {
            try
            {
                System.out.println(10/0);
            }
            catch (Exception e2)
            {
                System.out.println(e2);
            }
            finally
            {
                System.out.println("I am in nested finally block");
            }
        }
        System.out.println("main method ended");
    }
}
