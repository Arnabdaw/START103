import java.util.Scanner;
public class unique
{
    static int target(int[] arr)
    {
        int count=0,i;
        for(i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if((arr[i]==arr[j]))
                {
                    arr[i]=arr[j]=-1;
                }
            }
        }
        int ans=-1;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
            {
                ans=arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args)
    {
        int size;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        size=obj.nextInt();
        int a[]=new int[size];
        System.out.println("enter the array elements:");
        for(int i=0;i<a.length;i++)
        {
            a[i]=obj.nextInt();
        }
        unique object=new unique();
        int ans=object.target(a);
        System.out.println("unique number is "+ans );
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}
