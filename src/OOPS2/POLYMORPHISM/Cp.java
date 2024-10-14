package OOPS2.POLYMORPHISM;

public class Cp
{
    int add()
    {
        int a=10,b=20,c;
        c=a+b;
//        System.out.println(c);
        return c;
    }
    void add(int x,int y)
    {
        int c;
        c=x+y;
        System.out.println(c);
    }
    void add(int x,double y)
    {
        double c;
        c=x+y;
        System.out.println(c);
    }

    public static void main(String[] args)
    {
        Cp obj=new Cp();
        int sum=obj.add();
        System.out.println(sum);
        obj.add(100,200);
        obj.add(20,40.75);

    }
}
