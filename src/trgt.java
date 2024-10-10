import java.util.Scanner;
public class trgt
{
    static int target(int[] arr,int x)
    {
        int count=0;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if((arr[i]+arr[j])==x)
                {
                    count++;
                }
            }
        }
        return count;
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
        System.out.println("enter the target sum:");
        int sum=obj.nextInt();
        trgt object=new trgt();
        int ans=object.target(a,sum);
        System.out.println("the total number of pairs which has the target sum of "+sum+" is "+ans );
    }
}
