package alishevbasic.lesson47_serialization_part3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) throws IOException {
        Person[] people = {new Person(1, "Victor", 34),
                new Person(2, "Ivan", 18), new Person(3, "Roman", 32)};
        FileOutputStream fio = new FileOutputStream("peoples.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fio);
        oos.writeInt(people.length);
        for (Person person : people) {
            oos.writeObject(person);
        }
        oos.close();


    }
}
