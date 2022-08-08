package alishevbasic;

import java.util.Objects;

public class Lesson42_EqualsStringPool {
    public static void main(String[] args) {
        Animal6 animal1 = new Animal6(1);
        Animal6 animal2 = animal1;
        System.out.println(animal1 == animal2);
        String string1 = "Hello";
        String string2 = "Hello";
        System.out.println(string1 == string2);
        String a = "Hello";
        String b = "Hello123".substring(0, 5);
        System.out.println(a == b);
    }
}
class Animal6{
    int id;
    public Animal6(int id){
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal6 animal6 = (Animal6) o;
        return id == animal6.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
