import java.util.Scanner;
public class rotate
{
    static  void swap(int[] arr,int a,int b)
    {
        int temp=a;
        a=b;
        b=temp;
    }
    static void reverse(int[] arr,int i,int j)
    {
        while(i<j)
        {
            swap(arr,i,j);
            i++;
        }
    }
}
