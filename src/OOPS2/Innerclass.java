package OOPS2;

public class Innerclass
{
     static class Test
    {
        String name;

        public Test(String name)
        {
            this.name = name;
        }
    }


    public static void main(String[] args)
    {

        Test ob1=new Test("Arnab");
        Test ob2=new Test("Dishari");

        System.out.println(ob1.name);
        System.out.println(ob2.name);

    }
}

