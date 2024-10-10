import java.util.Scanner;
class recfact
{
    int fact(int b)
    {
        if(b>0)
        {
            return (b*fact(b-1));
        }
        else
        {
            return 1;
        }
    }

    public static void main(String[] args)
    {
        int ans,a;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter any number:");
        a=obj.nextInt();
        recfact ob=new recfact();
        ans=ob.fact(a);
        System.out.println("the factorial of "+a+"is "+ans);
    }
}
