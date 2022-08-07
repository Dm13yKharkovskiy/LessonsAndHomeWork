package alishevbasic;

public class Lesson20_Constructors {
    public static void main(String[] args) {
        Hum2 hum1 = new Hum2("Tob", 12);
        hum1.getInfo();
        Hum2 hum2 = new Hum2("Bob");
        hum2.getInfo();
        Hum2 hum3 = new Hum2();
        hum3.getInfo();
        System.out.println(hum3.getName());
    }

}

class Hum2 {
    private String name;
    private int age;

    public Hum2(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public Hum2(String name) {
        this.name = name;
    }
    public Hum2(){
        this.name = "Default name";
        this.age = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void getInfo() {
        System.out.println(name + " ," + age);
    }
}
