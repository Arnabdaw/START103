/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner obj=new Scanner(System.in);
        int x;
        x=obj.nextInt();
        if(x<3)
        {
            System.out.println("GOLD");
        }
        if(x>=3 && x<6)
        {
            System.out.println("SILVER");
        }
        if(x>=6)
        {
            System.out.println("BRONZE");
        }
    }
}
