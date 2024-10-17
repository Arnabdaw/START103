package OOPS2.MULTITHREADING;


class S extends Thread
{
    public void run()
    {
        try
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println("t1 thread running");
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("t1 thread terminated");
        }
    }
}
public class Tain
{
    public static void main(String[] args)
    {
        S t1=new S();

        t1.start();
        t1.interrupt();
    }
}
