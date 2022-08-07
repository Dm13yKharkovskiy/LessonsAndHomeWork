package alishevbasic;

public class Lesson26_Inheritance {
    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.eat();
        fish.sleep();
        fish.swim();
        fish.showName();

    }
}

class Pets {

    String name = "Some pets";

    public void eat() {
        System.out.println("I'm eating");
    }

    public void sleep() {
        System.out.println("I'm sleeping");
    }

}

class Fish extends Pets {

    public void swim() {
        System.out.println("I'm swimming");
    }

    public void eat() {
        System.out.println("Fish is eating");
    }

    public void showName() {
        System.out.println(name);
    }


}
