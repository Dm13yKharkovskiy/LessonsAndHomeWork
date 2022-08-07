package alishevbasic;

public class Lesson14_ClassesAndObjects {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.name = "Вова";
        human1.age = 20;
        System.out.println("Привет! Меня зовут " + human1.name + "." +
                " Мне " + human1.age + " лет.");
        Human human2 = new Human();
        human1.name = "Игорь";
        human1.age = 30;
        System.out.println("Привет! Меня зовут " + human1.name + "." +
                " Мне " + human1.age + " лет.");

    }
}

class Human {
    String name;
    int age;

}
