package OOPS2.EXCEPTION;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream r=new FileInputStream("C:\\Users\\arnab\\Desktop\\Dishari");
        FileOutputStream w=new FileOutputStream("C:\\Users\\arnab\\Desktop\\Dipra");

        int i;
        while((i=r.read())!=-1)
        {
            w.write((char)i);
        }
        System.out.println("Data copied successfully..");
    }
}
