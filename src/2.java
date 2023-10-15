/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class B
{
    public static void main (String[] args) throws java.lang.Exception
    {
        int i,t,x,y,n;
        Scanner obj=new Scanner(System.in);
        t=obj.nextInt();
        for(i=1;i<=t;i++)
        {
            x=obj.nextInt();
            y=obj.nextInt();
            n=x/y;
            if(n>20)
            {
                System.out.println(20);
            }
            else
            {
                System.out.println(n);
            }
        }
    }
}
