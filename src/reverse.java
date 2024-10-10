import java.util.Scanner;

public class reverse
{
    static void rev(int[] arr)
    {
        System.out.println("the reverse array is:");
        int temp;
        int j=arr.length-1;
        for(int i=0;i<j;i++)
        {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
        }
    }
    static void pnt(int[] arr)
    {
        for(int k=0;k<arr.length;k++)
        {
            System.out.print(arr[k]+" ");
        }
    }
    public static void main(String[] args)
    {
        int size,i;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        size=obj.nextInt();
        System.out.println("enter the array elements:");
        int a[]=new int[size];
        for(i=0;i<size;i++)
        {
            a[i]=obj.nextInt();
        }
        reverse ob=new reverse();
        ob.rev(a);
        ob.pnt(a);
    }
}
