package alishevbasic;

public class Lesson16_TypeReturnMethod {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Dan";
        person1.age = 18;
        Person person2 = new Person();
        person2.name = "Bob";
        person2.age = 50;
        person1.speak();
        person2.sayHello();
        System.out.println("Количество лет до пенсии " + person1.CalculateYearsToRetirement());
        int year2 = person2.CalculateYearsToRetirement();
        System.out.println("Количество лет до пенсии " + year2);

    }
}

class Person {
    String name;
    int age;

    int CalculateYearsToRetirement() {
        int years = 65 - age;
        return years;

    }

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Привет! Меня зовут " + name + "." + " Мне " + age + " лет.");
        }
    }

    void sayHello() {
        System.out.println("Hello! My name is " + name + ". I'm " + age + " old.");
    }
}
