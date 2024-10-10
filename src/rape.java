import java.util.Scanner;

public class rape
{
    static int fuck(int arr[])
    {
        int ans=-1;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                   ans=arr[i];
                    return ans;
                }
            }
        }
        return ans;
    }
}
