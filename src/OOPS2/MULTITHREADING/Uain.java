package OOPS2.MULTITHREADING;

class msg
{
    public void show(String name)
    {
        //;;;;;;;;//100 LOC
        synchronized (this)
        {

            for(int i=1;i<=3;i++)
            {
                System.out.println(" Name: "+ name);
            }
        }
        //;;;;;//100 LOC
    }

}
class thread extends Thread
{
    msg m;
    String name;

    public thread(msg m, String name)
    {
        this.m = m;
        this.name = name;
    }
    public void run()
    {
        m.show(name);
    }
}
public class Uain
{
    public static void main(String[] args)
    {
        msg obj=new msg();

        thread t1=new thread(obj,"Arnab");
        thread t2=new thread(obj,"Bubu");

        t1.start();
        t2.start();
    }
}
