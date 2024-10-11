package OOPS2;

public class Human
{
     int age;
    String name;
    int salary;
    boolean married;
    static long population;

    static void message()
    {
        Human ob=new Human(121,"assas",21332,true);
        System.out.println("Hello World");
        System.out.println(ob.age);
    }

    public Human(int age, String name, int salary, boolean married)
    {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        this.population++;
    }

    public static void main(String[] args)
    {
        message();

    }
}
