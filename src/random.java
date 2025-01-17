class varar
{
    void add(int ...a)
    {
        int sum=0;
        for(int x:a)
        {
            sum+=x;
        }
        System.out.println("ans="+sum);
    }
}
public class random
{
    public static void main(String[] args)
    {
        varar obj=new varar();
        obj.add();
        obj.add(10);
        obj.add(10,20);
        obj.add(10,20,30);
    }
}

