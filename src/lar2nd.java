import java.util.Scanner;

public class lar2nd
{
    static int lar(int[] arr)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
    static int seclar(int arr[])
    {
        int mx=lar(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==mx)
            {
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int secondmax=lar(arr);
        return secondmax;
    }
    public static void main(String[] args)
    {
        int size,j;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the size of the array :");
        size=obj.nextInt();
        int a[]=new int[size];
        System.out.println("enter "+size+" array elements:");
        for(int i=0;i<a.length;i++)
        {
            a[i]=obj.nextInt();
        }
        lar2nd ob=new lar2nd();
        int max=lar2nd.seclar(a);
        System.out.println("the second largest element in the array is:"+max);
    }
}
