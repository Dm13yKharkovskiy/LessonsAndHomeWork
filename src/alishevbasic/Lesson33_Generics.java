package alishevbasic;

import java.util.ArrayList;
import java.util.List;

public class Lesson33_Generics {
    public static void main(String[] args) {
        // java 5
        List animals = new ArrayList();
        Animal ourAnimal = new Animal();
        animals.add("Cat");
        animals.add("AlishevBasic.Dog");
        animals.add("Frog");
        animals.add(ourAnimal);

        String animal = (String) animals.get(3);
        System.out.println(animal);

        //generics
        List<String> animals2 = new ArrayList<String>();
        animals2.add("Cat");
        animals2.add("AlishevBasic.Dog");
        animals2.add("Frog");

        String animal2 = animals2.get(1);
        System.out.println(animal2);

        ///java 7
        List<String> animal3 = new ArrayList<>();
    }
}
class Animal {

}
