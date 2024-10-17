package OOPS2.EXCEPTION;

import java.io.File;

public class RenameFile
{
    public static void main(String[] args)
    {
        File f=new File("C:\\Users\\arnab\\Desktop\\adu");
        File r=new File("C:\\Users\\arnab\\Desktop\\Tintin");

        if(f.exists())
        {
            System.out.println(f.renameTo(r));
        }
        else
        {
            System.out.println("file doesn't exist");
        }
    }
}
