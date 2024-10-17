package OOPS2.EXCEPTION;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Raif
{
    public static void main(String[] args)
    {
        try
        {
            FileInputStream f=new FileInputStream("C:\\Users\\arnab\\Desktop\\andu");
            try
            {
                int i;
                while ((i=f.read())!=-1)
                {
                    System.out.print((char)i);
                }

            }
            finally
            {
                System.out.println();
                f.close();
                System.out.println("file closed");
            }
        }
        catch (IOException e)
        {
            System.out.println("exception handled...");
        }


    }
}
