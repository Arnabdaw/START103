package OOPS2.POLYMORPHISM;

abstract class Animal
{
    Animal()
    {
        System.out.println("All animals");
    }
    abstract void sound();
}
class Dog extends Animal
{

     void sound()
    {
        System.out.println("Dog is barking");
    }
//    Dog()
//    {
//        super();
//    }
}
class Lion extends Animal
{
     void sound()
    {
        System.out.println("Lion is Roaring");
    }
}
public class Test
{
    public static void main(String[] args)
    {
        Animal dog=new Dog();
        dog.sound();
        System.out.println();
        Animal lion=new Lion();
        lion.sound();
    }
}
