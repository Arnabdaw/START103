package OOPS2.INHERITANCE;

public class Lain
{
    public static void main(String[] args)
    {
//        Box obj=new Box();
//        System.out.println(obj.l+"  "+ obj.h+"  "+ obj.w);
//        System.out.println();
//
//        Box obj1=new Box(5);
//        System.out.println(obj1.l);
//        System.out.println(obj1.l);
//        System.out.println(obj1.l);
//        System.out.println();

//        Box obj2=new Box(5,8,10);
//        System.out.println(obj2.l);
//        System.out.println(obj2.h);
//        System.out.println(obj2.w);
//        System.out.println();

//        Box obj3=new Box(obj);
//        System.out.println(obj3.l);
//        System.out.println(obj3.h);
//        System.out.println(obj3.w);
//        System.out.println();
//
//        Boxweight box=new Boxweight();
//        System.out.println(box.l+"  "+box.h+"  "+box.w+"  "+box.weight);
//        System.out.println();
//
//        Boxweight box1=new Boxweight(10,20,30,40);
//        System.out.println(box1.l+"  "+box1.h+"  "+box1.w+"  "+ box1.weight);
//        System.out.println();
//
//        Box ob=new Boxweight(100,90,80,70);
//        System.out.println(ob.l+"  "+ ob.h+"  "+ob.w+" "+ob.weight);

        Boxprice obj=new Boxprice();
        System.out.println(obj.l+"  "+obj.h+"  "+obj.w+"  " +obj.weight+"  "+obj.cost);


        System.out.println();
        System.out.println();


        Boxprice obj1=new Boxprice(3,7,10,200,5600);
        System.out.println(obj1.l+"  "+obj1.h+"  "+obj1.w+"  "+obj1.weight+"  "+obj1.cost);

        System.out.println();
        System.out.println();


        Boxprice obj2=new Boxprice(5,8,4000);
        System.out.println(obj2.l+"  "+obj2.h+"  "+obj2.w+"  "+obj2.weight+"  "+obj2.cost);

        Boxprice obj3=new Boxprice(obj);
//        System.out.println(obj.l+"  "+obj.h+"  "+obj.w+"  "+obj.weight+"  "+obj.cost);

        System.out.println(obj1.l+"  "+obj1.h+"  "+obj1.w+"  "+obj1.weight+"  "+obj1.cost);

//        System.out.println(obj2.l+"  "+obj2.h+"  "+obj2.w+"  "+obj2.weight+"  "+obj2.cost);

    }
}
