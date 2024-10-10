import java.util.Scanner;
class july1
{
    int sum(int x,int y)
    {
        int z;
        z=x+y;
        return z;
    }
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the first number:");
        int a,b,c ;
        a=obj.nextInt();
        System.out.println("enter the first number:");
        b=obj.nextInt();
        july1 ob=new july1();
        c=ob.sum(a,b);
        System.out.println("sum="+c);
    }
}
