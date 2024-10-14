package OOPS2.INTERFACE;

import java.util.Scanner;

interface Client
{
    void input();
    void output();
}
class Developer implements Client
{
    String name;
    double sal;
    public void input()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter username: ");
        name=obj.nextLine();
        System.out.println();
        System.out.println("enter salary: ");
        sal=obj.nextDouble();
    }
    public void output()
    {
        System.out.println(name+"   "+sal);
    }

    public static void main(String[] args)
    {
        Client ref=new Developer();
        ref.input();
        ref.output();
    }
}
