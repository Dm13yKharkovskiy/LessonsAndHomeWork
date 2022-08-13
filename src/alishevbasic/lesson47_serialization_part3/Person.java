package alishevbasic.lesson47_serialization_part3;

import java.io.Serializable;

class Person implements Serializable {
    private static final long serialVersionUID = 3434353556353535L;
    private transient  int id;
    private String name;
    private int age;



    public Person(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
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
        return  id  + " : " + name;
    }
}
