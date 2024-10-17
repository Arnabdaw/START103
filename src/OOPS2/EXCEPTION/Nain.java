package OOPS2.EXCEPTION;

import java.io.File;
//import java.io.IOException;

public class Nain
{
    public static void main(String[] args)
    {
        File obj=new File("C:\\Users\\arnab\\Desktop\\gandu");
        try
        {
            if(obj.createNewFile())
            {
                System.out.println("File successfully created...!");
            }
            else
            {
                System.out.println("File already exist");
            }
        }
        catch(Exception e)
        {
            System.out.println("exception handled nicely");
        }
        System.out.println("main method ended");
    }
}
