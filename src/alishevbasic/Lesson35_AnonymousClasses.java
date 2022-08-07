package alishevbasic;

public class Lesson35_AnonymousClasses {
    public static void main(String[] args) {
        Animal3 animal = new Animal3();
        animal.eat();
        Animal3 anima2 = new Animal3(){
            public void eat(){
                System.out.println("Other animal is eating");
            }
        };

        anima2.eat();

    }
}

class Animal3{
    public void eat(){
        System.out.println("I'm eating");
    }
}

