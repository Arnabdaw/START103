package OOPS2.INTERFACE;

interface NewVer
{
    default void call()
    {
        add(300,120);
    }
//    void sub(int x,int y);
    private  void add(int x,int y)
    {
        System.out.println("Addition="+(x+y));
    }
    void sub(int a,int b);
}
class Fucking implements NewVer
{
    public void sub(int x,int y)
    {
        System.out.println("Subtraction="+(x-y));
    }
}

public class Demo
{
    public static void main(String[] args)
    {
        NewVer obj=new Fucking();
        obj.call();
//        obj.call();
        obj.sub(300,120);

    }
}
