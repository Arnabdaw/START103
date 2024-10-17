package OOPS2.MULTITHREADING;

class Bus implements Runnable
{
    int available=2;
    int passenger;

    public Bus(int passenger)
    {
        this.passenger = passenger;
    }
    public  void run()
    {
        String name=Thread.currentThread().getName();
        if(available>=passenger)
        {
            System.out.println(name+" reserved seat ");
            available--;
        }
        else
        {
            System.out.println("Sorry!! seat not available");
        }
    }
}
public class Customer
{
    public static void main(String[] args)
    {
        Bus obj=new Bus(1);
        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj);
        Thread t3=new Thread(obj);

        t1.setName("Arnab");
        t2.setName("Dipra");
        t3.setName("Dishari");

        t1.start();
        t2.start();
        t3.start();
    }
}
