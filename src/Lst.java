import java.util.Scanner;
public class Lst
{
        static int cnt(int arr[], int x)
        {
            int count = -1;
            for (int i = 0; i < arr.length; i++)
            {
                if (arr[i] == x)
                {
                    count=i;
                }
            }
            return count;
        }

        public static void main(String[] args)
        {
            Scanner obj=new Scanner(System.in);
            int size,y;
            System.out.println("enter the size of the array:");
            size=obj.nextInt();
            int a[]=new int[size];
            System.out.println("enter the array elements:");
            for(int i=0;i<size;i++)
            {
                a[i]=obj.nextInt();
            }
            System.out.println("enter the element u want to search:");
            y=obj.nextInt();
            Lst ob=new Lst();
            int ans=ob.cnt(a,y);
            System.out.println("index of last occurrence of "+y+ " is "+ans);
        }
}


