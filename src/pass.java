import java.io.*;
public class pass
{
    public static void main(String[] args)
    {
        String str;
        char ch[];
        Console obj=System.console();
        System.out.println("enter username: ");
        str=obj.readLine();
        System.out.println("enter password: ");
        ch=obj.readPassword();
        String a=String.valueOf(ch);
        System.out.println("Username: "+str);
        System.out.println("Password: "+a);
    }
}
