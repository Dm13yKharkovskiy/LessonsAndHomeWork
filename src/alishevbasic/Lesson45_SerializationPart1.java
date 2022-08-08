package alishevbasic;

import java.io.*;

public class Lesson45_SerializationPart1 {
    public static void main(String[] args) {

    }
}

class Person1 implements Serializable {
    private int id;
    private String name;

    public Person1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return id + " : " + name;
    }
}

class WriteObject {
    public static void main(String[] args) throws IOException {
        Person1 person1 = new Person1(1, "Bob");
        Person1 person2 = new Person1(2, "Mike");

        FileOutputStream fos = new FileOutputStream("people.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(person1);
        oos.writeObject(person2);
        oos.close();
    }
}

class ReadObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("people.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Person1 person3 = (Person1) ois.readObject();
        Person1 person4 = (Person1) ois.readObject();
        ois.close();
        System.out.println(person3);
        System.out.println(person4);

    }
}
