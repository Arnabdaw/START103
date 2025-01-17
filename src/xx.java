import java.util.Arrays;

public class xx
{
    public static void main(String[] args)
    {
//        int a=2353;
//        String s=Integer.toString(a);
//        System.out.println(s);
//
//
//        String str="I love you";
//        char[] arr=str.toCharArray();
//        System.out.println(Arrays.toString(arr));
//
//        String st="123";
//
//        int total=Integer.valueOf(st)+100;
//        System.out.println(total);
//
//        char[] ch={'a','b','c','d','e'};
//        String s1=String.valueOf(ch);
//
//        System.out.println(s1);
//        String s2=new String(ch);
//        System.out.println(s2);


        char ch[]={'c','b','a','e','b','a','b','a','c','d'};
        String ans="";
        int k=3;
        for(int i=0;i<k;i++)
        {
            ans+=ch[i];
        }

        System.out.println(ans);
        System.out.println(ans.substring(0,2));
    }


}
