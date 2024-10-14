package OOPS2.INTERFACE;

class Vararg
{
    void add(int...a)
    {
        int sum=0;
        for(int x:a)
        {
            sum=sum+x;
        }
        System.out.println("Addition="+sum);
    }
}
public class Mainn
{
    public static void main(String[] args)
    {
        Vararg obj=new Vararg();
        obj.add();
        obj.add(10);
        obj.add(10,20);
        obj.add(10,20,30);
        obj.add(10,20,30,40);
    }
}


