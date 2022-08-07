package alishevbasic;

public class Lesson29_Polymorphism {
    public static void main(String[] args) {
        Animals1 animals1 = new Animals1();
        Dogs dogs1 = new Dogs();
        Cat cat1 = new Cat();
        test(animals1);
        test(cat1);
        test(dogs1);

    }
    public  static void  test(Animals1 animals1) {
        animals1.eat();
    }
}

class Animals1 {
    public void eat() {
        System.out.println("I'm eating");
    }

}

class Dogs extends Animals1 {

    public void bark(){
        System.out.println("Dog is barking");
    }
    public void eat(){
        System.out.println("Dog is eating");
    }

}

class Cat extends Animals1{

}
