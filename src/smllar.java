import java.util.Arrays;
import java.util.Scanner;

public class smllar
{
     static int[] cnt(int arr[],int x)
    {
        Arrays.sort(arr);
        int[] ans={arr[0+x-1],arr[arr.length-x]};
        return ans;
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
        System.out.println("enter the value of k:");
        int k=obj.nextInt();
        smllar ob=new smllar();
        int[] result=ob.cnt(a,k);
        System.out.println(k+" nd smallest element is:"+result[0]);
        System.out.println(k+" nd largest element is:"+result[1]);
    }
}


