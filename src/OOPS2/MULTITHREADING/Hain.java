package OOPS2.MULTITHREADING;

class Table
{
    public synchronized void  printTable(int n) //t1 & t2 will both come at same time  but  only 1 thread can enter into the method
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+" * "+i+" ="+(n*i));
        }
        System.out.println();
    }
}
class thread1 extends Thread
{
    Table t;

    public thread1(Table t)
    {
        this.t = t;
    }
    public void run()
    {
        t.printTable(5);
    }
}
class thread2 extends Thread
{
    Table t;

    public thread2(Table t)
    {
        this.t = t;
    }
    public void run()
    {
        t.printTable(7);
    }
}
public class Hain
{
    public static void main(String[] args)
    {
        Table obj=new Table();

        thread1 t1=new thread1(obj);
        thread2 t2=new thread2(obj);

        t1.start();
        t2.start();

    }

}
