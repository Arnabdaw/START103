package OOPS2.MULTITHREADING;

public class Bank extends Thread
{
    static int bal=5000;
     static int withdraw;

    public Bank(int withdraw)
    {
        this.withdraw = withdraw;
    }
    public static synchronized void fun()
    {
        String name=Thread.currentThread().getName();
        if(withdraw<=bal)
        {
            System.out.println(name+" withdrawn money");
            bal=bal-withdraw;
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
    }
    public void run()
    {
        fun();
    }
}
class custom
{
    public static void main(String[] args)
    {
        Bank obj1=new Bank(5000);
        Bank obj2=new Bank(5000);

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj1);

        Thread t3=new Thread(obj2);
        Thread t4=new Thread(obj2);


        t1.setName("Arnab");
        t2.setName("Bubu");

        t3.setName("Srijita");
        t4.setName("Dipra");


        t1.start();
        t2.start();

        t3.start();
        t4.start();

    }

}