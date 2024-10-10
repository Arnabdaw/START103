package Access_Modifier;

public class exp
{
    public static int gcd(int a,int b)
    {
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
    public static Fraction add(Fraction p1,Fraction p2)
    {

        int dn=p1.den *p2.den;
        int nm=(p1.num*p2.den)+(p2.num*p1.den);
        Fraction p3=new Fraction(nm,dn);
        return (p3);
    }


    public static class Fraction
    {
        int num;
        int den;
        public Fraction(int num,int den)
        {
            this.num=num;
            this.den=den;
            simplify();
        }

        public void simplify()
        {
            int x=gcd(num,den);
            num=num/x;
            den=den/x;
        }
    }



    public static void main(String[] args)
    {
        Fraction f1=new Fraction(4,24);
//        f1.simplify();
        System.out.println(f1.num+"/"+f1.den);
        Fraction f2=new Fraction(12,54);
//        f2.simplify();
        System.out.println(f2.num+"/"+f2.den);
        Fraction f3=add(f1,f2);
        System.out.println("ADDITION= "+ f3.num+"/"+f3.den);
    }
}
