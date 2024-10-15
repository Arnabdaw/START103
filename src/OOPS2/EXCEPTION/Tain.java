package OOPS2.EXCEPTION;


public class Tain
{
    public static void checkAge(int age)
    {
        if (age < 18)
        {
            throw new ArithmeticException("Not eligible to vote");
        }
        else
        {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args)
    {
        checkAge(16);  // This will throw an exception
    }
}
