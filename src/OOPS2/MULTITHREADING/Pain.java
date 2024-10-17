package OOPS2.MULTITHREADING;

class T extends Thread
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }
}
public class Pain
{
    public static void main(String[] args)
    {
        T t1=new T();
        T t2=new T();
        T t3=new T();

        t1.setName("thread->100");
        t2.setName("thread->200");
        t3.setName("thread->300");

        t1.setPriority(2);
        t2.setPriority(9);
        t3.setPriority(5);

        t1.start();
        t2.start();
        t3.start();

    }


}
