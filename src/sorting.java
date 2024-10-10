import java.util.Scanner;

public class sorting
{
    static boolean cnt(int arr[])
    {
        boolean check = true;
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] < arr[i-1])
            {
                check=false;
                break;
            }
        }
        return check;
    }

    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int size;
        System.out.println("enter the size of the array:");
        size=obj.nextInt();
        int a[]=new int[size];
        System.out.println("enter the array elements:");
        for(int i=0;i<size;i++)
        {
            a[i]=obj.nextInt();
        }
        sorting ob=new sorting();
        boolean ans=ob.cnt(a);
        System.out.println("ARRAY IS SORTED:"+ans);
    }
}

