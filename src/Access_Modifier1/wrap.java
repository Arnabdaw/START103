package Access_Modifier1;

//class fun
//{
//    public Integer value;
//
//    public fun(Integer value)
//    {
//        this.value = value;
//    }
//}
class Ass
{
    String name;
    public Ass(String name)
    {
        this.name=name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destroyed");
    }
}
public class wrap
{
    public static void main(String[] args)
    {
//        fun obj1=new fun(10);
//        fun obj2=new fun(20);
//        swap(obj1,obj2);
//        System.out.println(obj1.value+"  "+obj2.value);

        Ass obj;
        for(int i=0;i<999;i++)
        {
            obj=new Ass("random name");
        }
    }
}
//    public static void swap(fun x ,fun y)
//    {
//        Integer temp=x.value;
//        x.value=y.value;
//        y.value=temp;
//    }




