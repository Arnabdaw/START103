package OOPS2.MULTITHREADING;

class Ass implements Runnable
{
    @Override
    public void run()
    {
        try
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println("Arnab");
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("Exception handled..!");
        }
    }
}
public class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        Ass obj=new Ass();
        Thread t=new Thread(obj);
        t.start();
        for(int i=1;i<=5;i++)
        {
            System.out.println("Dipra");
            Thread.sleep(1000);
        }
    }
}

