import java.util.Scanner;
public class rot
{
    static int[] rev(int[] arr,int k)
    {
        int j=0;
        int n =arr.length;
        k=k%n;
        int ans[]=new int[n];
        for(int i=n-k;i<n;i++)
        {
            ans[j++]=arr[i];
        }
        for(int i=0;i<n-k;i++)
        {
            ans[j++]=arr[i];
        }
        return ans;
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
        System.out.println("enter the value of k:");
        int k=obj.nextInt();
        rotation ob=new rotation();
        int array[] =ob.rev(a,k);
        System.out.println("after "+k+" rotation:");
        ob.pnt(array);
    }
}
