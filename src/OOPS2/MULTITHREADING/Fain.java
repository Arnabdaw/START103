package OOPS2.MULTITHREADING;


class Susres extends Thread
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
public class Fain
{
    public static void main(String[] args)
    {
        Susres t1=new Susres();
        Susres t2=new Susres();
        Susres t3=new Susres();

        t1.setName("thread 1");
        t2.setName("thread 2");
        t3.setName("thread 3");




        t1.start();
        t2.start();
        t3.start();




    }
}
