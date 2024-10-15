package CodingInterview.JAVA;

public class CastingUpDown {

    public static void main(String[] args) {
        // Upcasting
        Animal animal = new Dog();

        animal.sound();
        // animal.bark()  we can not call subclass method in superclass reference type

        //Downcasting
        Dog dog = (Dog) animal;
        dog.sound();
        dog.bark();
        // here we can call subclass method by giving subclass reference to superclass reference.
        // it will throw class castexcption
        Dog dog1 = new Dog();
        dog1.sound();
        dog1.bark();
        // here also we can call both method but this is not downcasting

    }
}
class Animal{

    void sound(){
        System.out.println("Make sound");
    }
}

class Dog extends Animal{
    void  bark(){
        System.out.println("bbbbbbbbboooooooooowwwwwwwwwww");
    }

}
