package OOPS2.MULTITHREADING;
class Tsc extends Thread
{
    @Override
    public  void run()
    {
        String n=Thread.currentThread().getName();
        for(int i=1;i<=3;i++)
        {
            System.out.println(n);
        }
    }
}
public class Gain
{
    public static void main(String[] args)
    {
        Tsc t1=new Tsc();
        Tsc t2=new Tsc();
        Tsc t3=new Tsc();

        t1.setName("thread 1");
        t2.setName("thread 2");
        t3.setName("thread 3");


        t2.start();
        try
        {
            t2.join();
        }
        catch(InterruptedException e)
        {

        }

        t1.start();
        t3.start();
        String n=Thread.currentThread().getName();
        for(int i=1;i<=3;i++)
        {
            System.out.println(n);

        }
    }
}
