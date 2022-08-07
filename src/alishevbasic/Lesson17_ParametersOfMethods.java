package alishevbasic;

public class Lesson17_ParametersOfMethods {
    public static void main(String[] args) {
        People people1 = new People();
        people1.name = "Dan";
        people1.age = 18;
        People people2 = new People();
        people2.name = "Bob";
        people2.age = 50;
        people1.speak();
        people2.sayHello();
        System.out.println("Количество лет до пенсии " + people1.CalculateYearsToRetirement());
        int year2 = people2.CalculateYearsToRetirement();
        System.out.println("Количество лет до пенсии " + year2);
        People people3 = new People();
        people3.setNameAndAge("Jack", 45);
        people3.speak();


    }
}

class People {
    String name;
    int age;

    void setNameAndAge(String userName, int userAge) {
        name = userName;
        age = userAge;
    }

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


