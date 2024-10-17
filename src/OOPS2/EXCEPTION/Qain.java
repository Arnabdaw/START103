package OOPS2.EXCEPTION;

import java.io.File;

public class Qain
{
    public static void main(String[] args)
    {
        File obj=new File("C:\\Users\\arnab\\Desktop\\gandu");
        if(obj.exists())
        {
            System.out.println("File Name: "+obj.getName());
            System.out.println("File Location: "+obj.getAbsolutePath());
            System.out.println("File Writable: "+obj.canWrite());
            System.out.println("File Readable: "+obj.canRead());
            System.out.println("File Size: "+obj.length());
            System.out.println("File Removed: "+obj.delete());
            System.out.println();
        }
        else
        {
            System.out.println("File doesn't exist");
        }
    }
}
