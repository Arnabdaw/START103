package OOPS2.EXCEPTION;

import java.io.*;

public class Yain
{
    public static void readFile(String fileName) throws IOException
    {
        FileReader file = new FileReader(fileName);  // May throw FileNotFoundException
        BufferedReader fileInput = new BufferedReader(file);

        throw new IOException("Custom IOException");
    }

    public static void main(String[] args)
    {
        try
        {
            readFile("test.txt");
        }
        catch (IOException e)
        {
            System.out.println("Caught exception: " + e);
        }
    }
}
