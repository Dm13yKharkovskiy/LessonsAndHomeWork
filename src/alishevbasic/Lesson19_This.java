package alishevbasic;

public class Lesson19_This {
    public static void main(String[] args) {
        Hum hum1 = new Hum();
        hum1.setAge(18);
        hum1.setName("Tom");
        hum1.getInfo();
        Hum hum2 = new Hum();
        hum2.setName("Rob");
        hum2.setAge(23);
        hum2.getInfo();
    }
}

class Hum {
    String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void getInfo() {
        System.out.println(name + ", " + age);
    }
}