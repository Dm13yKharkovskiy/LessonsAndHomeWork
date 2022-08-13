package alishevbasic.lesson47_serialization_part3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("peoples.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        int countPeople = ois.readInt();
        Person[] people = new Person[countPeople];
        for(int i = 0; i < countPeople; i++){
            people[i] = (Person) ois.readObject();
        }
        ois.close();
        System.out.println(Arrays.toString(people));


    }
}
