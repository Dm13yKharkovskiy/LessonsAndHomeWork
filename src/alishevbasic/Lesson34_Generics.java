package alishevbasic;

import java.util.ArrayList;
import java.util.List;

public class Lesson34_Generics {
    public static void main(String[] args) {
        List<Animal1> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal1(1));
        listOfAnimal.add(new Animal1(2));

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());

        test(listOfDogs);



    }

    private static void test(List<? extends Animal1> list) {
        for (Animal1 animal1 : list) {
            System.out.println(animal1);
            animal1.eat();
        }
    }
}

class Animal1 {
    int id;

    public Animal1() {

    }

    public Animal1(int id) {
        this.id = id;
    }
    public void eat(){
        System.out.println("eat");
    }

    public String toString() {
        return String.valueOf(id);
    }
}

class Dog extends Animal1 {


}
