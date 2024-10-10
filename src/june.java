import java.util.Scanner;
public class june
{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the first number:");
        a=obj.nextInt();
        System.out.println("enter the second number:");
        b=obj.nextInt();
        System.out.println("AND ="+(a&b));
        System.out.println("OR ="+(a|b));
        System.out.println("XOR="+(a^b));
        System.out.println("COMPLEMENT="+(~a));
    }
}

