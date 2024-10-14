package OOPS2.INTERFACE;

interface Animal {
    void sound();

    // Default method
    default void sleep() {
        System.out.println("Sleeping");
    }

    // Static method
    static void info()
    {
        System.out.println("This is an animal interface");
    }
}

class Dog implements Animal
{
    public void sound()
    {
        System.out.println("Barking");
    }
    @Override
    public void sleep()
    {
        System.out.println("default method can be overriden");
    }

    static void info()
    {
        System.out.println("I am trying to override static method");
    }
}

public class Test {
    public static void main(String[] args)
    {
        Dog  dog = new Dog();
        dog.sound();   // Output: Barking
        dog.sleep();   // Output: Sleeping

        dog.info();// Output: This is an Animal interface
        Animal.info();
    }
}
