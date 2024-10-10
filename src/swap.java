import java.util.Scanner;

public class swap
{
    static void sp(int a,int b)
    {
        System.out.println("original values before swap:");
        System.out.println("a="+a);
        System.out.println("b="+b);

        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("values after swap:");
        System.out.println("a="+a);
        System.out.println("b="+b);
    }

    public static void main(String[] args)
    {
        int x,y;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter 2 number:");
        x=obj.nextInt();
        y=obj.nextInt();
        swap object=new swap();
        object.sp(x,y);
    }
}
