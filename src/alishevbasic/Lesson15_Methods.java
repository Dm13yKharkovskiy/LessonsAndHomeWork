package alishevbasic;

public class Lesson15_Methods {
    public static void main(String[] args) {
        Humans humans1 = new Humans();
        humans1.name = "Dan";
        humans1.age = 18;
        Humans humans2 = new Humans();
        humans2.name = "Bob";
        humans2.age = 50;
        humans1.speak();
        humans2.sayHello();

    }
}
class Humans {
    String name;
    int age;

    void speak() {
        for (int i = 0; i < 1; i++){
            System.out.println("Привет! Меня зовут " + name + "." + " Мне " + age + " лет.");
        }
    }
    void sayHello () {
        System.out.println("Hello! My name is " + name + ". I'm " + age + " old.");
    }

}
