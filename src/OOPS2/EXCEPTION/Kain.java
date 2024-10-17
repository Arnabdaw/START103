package OOPS2.EXCEPTION;

public class Kain
{
    void div(int a,int b) throws ArithmeticException
    {
        if(b==0)
        {
            throw new ArithmeticException();
        }
        else
        {
            int c=a/b;
            System.out.println(c);
        }
    }

    public static void main(String[] args)
    {
        Kain obj=new Kain();
        try
        {
            obj.div(20,0 );
        }
        catch (Exception e)
        {
            System.out.println("division by zero is not possible");
        }
    }
}

