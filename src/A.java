import java.util.Scanner;
class Algebra
{
    int add(int a,int b)
    {
        int ans=a+b;
        return ans;
    }
}
class A
{
    public static void main(String[] args)
    {
        Algebra obj=new Algebra();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two number:");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int S=obj.add(x,y);
        System.out.println("sum of input numbers is:"+S);
    }
}