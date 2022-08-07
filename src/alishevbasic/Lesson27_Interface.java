package alishevbasic;

public class Lesson27_Interface {
    public static void main(String[] args) {
        Info info1 = new Animals(1);
        Info info2 = new Persons("Bob");
        info1.showInfo();

    }
}

class Animals implements Info {
    public int id;
    public Animals(int id){
        this.id = id;
    }

    public void sleep() {
        System.out.println("I'm sleeping");

    }
    public void showInfo(){
        System.out.println("Id is " + id);
    }
}

class Persons implements Info {
    public String name;

    public Persons(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello!");
    }
    public void showInfo(){
        System.out.println("Name is " + name);
    }
}
interface Info{
    void showInfo();
}
