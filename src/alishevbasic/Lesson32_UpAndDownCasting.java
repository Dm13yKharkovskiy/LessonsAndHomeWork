package alishevbasic;

public class Lesson32_UpAndDownCasting {
    public static void main(String[] args) {
        Animal2 animal2 =  new Animal2();
        Dog2 dog2 = (Dog2) animal2;
        dog2.bark();
    }
}

class Animal2 {

    public void eat() {
        System.out.println("Animal is eating");
    }

    public void sleep() {
        System.out.println("Animal is sleeping");
    }

}

class Dog2 extends Animal2 {
    public void bark() {
        System.out.println("Dog is barking");
    }
}
