package alishevbasic;

public class Lesson41_AbstractClasses {
    public static void main(String[] args) {
        Cat5 cat = new Cat5();
        Dog5 dog = new Dog5();
        cat.makeSound();
        dog.makeSound();
        cat.eat();


    }
}
abstract class Animal5{
    public void eat(){
        System.out.println("I'm eating...");
    }
    public abstract void makeSound();
}
class Cat5 extends Animal5{

    @Override
    public void makeSound() {
        System.out.println("Meow...");
    }
}
class Dog5 extends Animal5{

    @Override
    public void makeSound() {
        System.out.println("Bark...");
    }
}
