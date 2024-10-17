package OOPS2.MULTITHREADING;

class P extends Thread
{
    public void run()
    {
        String name=Thread.currentThread().getName();
        for(int i=1;i<=3;i++)
        {
            System.out.println(name);
            Thread.yield();
        }
    }
}


class Q extends Thread
{
    public void run()
    {
        String name=Thread.currentThread().getName();
        for(int i=1;i<=3;i++)
        {
            System.out.println(name);
        }
    }
}
public class Cain
{
    public static void main(String[] args)
    {
        P t1=new P();
        Q t2=new Q();

        t1.setName("Thread 100");
        t2.setName("Thread 500");

        t1.start();
        t2.start();
        t1.stop();

    }
}
