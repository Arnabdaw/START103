package OOPS2.INTERFACE;
class A
{
    A show()
    {
        System.out.println("super class");
        System.out.println(new A());
        return new A();
    }
}
class B extends A
{
    @Override
    B show()
    {
        super.show();
        System.out.println("sub class");
        System.out.println(this);
        return this;
    }
}
public class Hope
{
    public static void main(String[] args)
    {
        B obj=new B();
        obj.show();

    }
}
