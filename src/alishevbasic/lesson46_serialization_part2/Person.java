package alishevbasic.lesson46_serialization_part2;

import java.io.Serializable;

class Person implements Serializable {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public String toString(){
        return id + " : " + name;
    }
}
