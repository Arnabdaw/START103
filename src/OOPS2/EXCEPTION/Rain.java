package OOPS2.EXCEPTION;

class InvalidAgeException extends Exception
{
    InvalidAgeException(String msg)
    {
        System.out.println(msg);
    }
}
public class Rain
{

    public static void vote(int age) throws InvalidAgeException
    {
        if(age<18)
        {
            throw new InvalidAgeException("Not eligible to vote");
        }
        else
        {
            System.out.println("eligible for vote");
        }
    }

    public static void main(String[] args)
    {
        try
        {
            vote(5);
        }
        catch(Exception e)
        {
            System.out.println("Exception handled: "+e);
        }
        System.out.println("main method ended");
    }
}
