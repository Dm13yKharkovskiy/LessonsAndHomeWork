package alishevbasic;

public class Lesson18_SetterAndGetter {
    public static void main(String[] args) {
        Man man1 = new Man();
        man1.setName("");
        man1.setAge(0);
        man1.sayHello();


    }
}

class Man {
    private String login;
    private int age1;

    public void setName(String userName) {
        if(userName.isEmpty()) {
            System.out.println("Ты ввел пустое имя");
        }else{
            login = userName;
        }
    }

    public String getName() {
        return login;
    }

    public void setAge(int userAge) {
        if (userAge > 0) {
            age1 = userAge;
        }else {
            System.out.println("Возраст не может быть <= 0");
        }
    }

    public int getAge() {
        return age1;
    }


    int CalculateYearsToRetirement() {
        int years = 65 - age1;
        return years;

    }

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Привет! Меня зовут " + login + "." + " Мне " + age1 + " лет.");
        }
    }

    void sayHello() {
        System.out.println("Hello! My name is " + login + ". I'm " + age1 + " old.");
    }
}
