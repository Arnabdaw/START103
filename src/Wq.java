import java.util.Arrays;
import java.util.Scanner;

public class Wq
{
    static void display(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        int i,size;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        size=obj.nextInt();
        int[] a=new int[size];
        System.out.println("enter the array elements:");
        for(i=0;i<a.length;i++)
        {
            a[i]=obj.nextInt();
        }
        System.out.println("original array:");
        display(a);
        int[] a1= Arrays.copyOfRange(a,0,4);
        System.out.println("copied array:");
        display(a1);
        a1[0]=0;
        a1[1]=0;
        System.out.println("original array:");
        display(a);
        System.out.println("copied array:");
        display(a1);
    }
}
