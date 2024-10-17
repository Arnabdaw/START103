package OOPS2.MULTITHREADING;

import java.io.IOException;

class A extends Thread
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
        catch(InterruptedException e)
        {
            System.out.println("exception handled..!");
        }
    }
}
 class B
{
    public static void main(String[] args) throws InterruptedException
    {
        A obj=new A();
        obj.start();
        for(int i=1;i<=5;i++)
        {
            System.out.println("Dishari");
            Thread.sleep(1000);
        }
    }
}
