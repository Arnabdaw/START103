package OOPS2.EXCEPTION;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Eain
{
    public static void main(String[] args)
    {
        try
        {
            FileWriter f=new FileWriter("C:\\Users\\arnab\\Desktop\\andu");
            try
            {
                f.write("I am the best  java coder in this world");
            }
            finally
            {
                f.close();
            }
            System.out.println("successfully data written in file");

        }
        catch (IOException e)
        {
            System.out.println("exception handled: "+e);
        }

    }
}
