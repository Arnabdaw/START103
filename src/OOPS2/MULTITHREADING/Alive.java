package OOPS2.MULTITHREADING;

class R extends Thread
{
    public void run()
    {
        System.out.println("IsAlive method program");
    }
}
public class Alive
{
    public static void main(String[] args)
    {
        R t1=new R();
        R t2=new R();

        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());

        t1.start();
        System.out.println();

        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());

        t2.start();
        System.out.println();


        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());

    }
}
