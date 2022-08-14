package homeworks.hw6iteratorandcomparator;

import java.util.Comparator;

class Car implements Comparable<Car> {
    private String model;
    private int year;

    public Car(String model, int year){

        this.model = model;
        this.year = year;
    }

    public String getModel() {

        return model;
    }
    public int getYear(){
        return year;
    }

    @Override
    public String toString() {
        return "\n" + model + " : " + year;
    }

    @Override
    public int compareTo(Car o) {

        return model.compareTo(o.getModel());
    }

}
