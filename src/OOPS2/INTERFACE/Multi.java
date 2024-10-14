package OOPS2.INTERFACE;

interface Gazi
{
    void add();
}
interface Sohail extends Gazi
{
//    void add();
    void sub();
}
public class Multi implements Sohail
{
    public void add()
    {
        int a=10;
        int b=20;
        int c=a+b;
        System.out.println("Addition="+c);
    }


    public void sub()
    {
        int a=80;
        int b=69;
        int c=a-b;
        System.out.println("subtraction="+c);
    }

    public static void main(String[] args)
    {
        Sohail obj=new Multi();
        obj.add();
        obj.sub();
    }
}
