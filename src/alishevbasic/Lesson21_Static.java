package alishevbasic;

public class Lesson21_Static {
    public static void main(String[] args) {
        Human1.description = "Hello!";
        Human1 human1 = new Human1("Dan", 18);
        human1.getAllFields();
        human1.description = "Nice";
        Human1 human2 = new Human1("Tom", 18);
        human1.getAllFields();
        human2.getAllFields();
        Human1.printAllFields();
        System.out.println("Количество людей " + Human1.count);
        Human1 human3 = new Human1("Rob", 45);
        Human1.getCountHuman();
       //System.out.println(Math.pow(2, 3));
       //System.out.println(Math.PI);
    }
}

class Human1 {
    private String name;
    private int age;
    public static String description = "Good";

    public static int count;


    public Human1(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String toString(){
        return "Name" + " " + name + "; " + "Age" + " " + age + ";";
    }
    public void getAllFields(){
        System.out.println("Name" + " " + name + "; " + "Age" + " " + age + ";" + description);
    }
    public static void printAllFields() {
        System.out.println(description);
    }
    public static void getCountHuman(){
        System.out.println("Counts human is " + count);

    }
}
