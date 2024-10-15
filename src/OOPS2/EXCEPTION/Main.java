package OOPS2.EXCEPTION;

public class Main
{
    public static void main(String[] args)
    {
//        System.out.println("main method started");
//        int a=10,b=0,c;
//        try
//        {
//            c=a/b;
//            System.out.println(c);
//        }
//        catch (Exception e)
//        {
//            System.out.println(e);
//            System.out.println("division by zero is not possible");
//        }
//        System.out.println("main method ended");

        String str="-123";
        int a;
        try
        {
            a=Integer.parseInt(str);
            System.out.println(a);
        }
        catch (NumberFormatException e)
        {
            System.out.println("String "+str+" can't be converted to integer");
        }
        System.out.println("main method ended");
//        int a=Integer.parseInt(str);
//        System.out.println(str);
//        try
//        {
//            System.out.println(str.toUpperCase());
//        }
//        catch (NullPointerException k)
//        {
//            System.out.println(k);
//            System.out.println("null can't be casted");
//        }
    }
}
