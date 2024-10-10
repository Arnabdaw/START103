import java.util.Scanner;
public class trisum
{
    static int target(int[] arr,int x)
    {
        int count=0;
        for(int i=0;i<arr.length-2;i++)
        {
            for(int j=i+1;j<arr.length-1;j++)
            {
                for(int k=j+1;k<arr.length;k++)
                {
                    if((arr[i]+arr[j]+arr[k])==x)
                    {
                        count++;
                    }
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
        trisum object=new trisum();
        int ans=object.target(a,sum);
        System.out.println("the total number of triplets which has the target sum of "+sum+" is "+ans );
    }
}
