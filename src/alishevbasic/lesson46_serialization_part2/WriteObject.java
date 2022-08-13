package alishevbasic.lesson46_serialization_part2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) throws IOException {
        Person[] people = {new Person(22, "Bob"), new Person(33, "Tom")};

        FileOutputStream fos = new FileOutputStream("peoples.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeInt(people.length);
        for (Person person : people){
            oos.writeObject(person);
        }
        fos.close();
    }
}
