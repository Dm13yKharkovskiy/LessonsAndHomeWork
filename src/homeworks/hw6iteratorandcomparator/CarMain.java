package homeworks.hw6iteratorandcomparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CarMain {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("BMW", 2018));
        carList.add(new Car("AUDI", 2009));
        carList.add(new Car("TOYOTA", 2011));
        carList.add(new Car("TESLA", 2016));
        carList.add(new Car("FORD", 2014));
        carList.add(new Car("JAC",2020));
        carList.add(new Car("JEEP", 2022));
        carList.add(new Car("HAVAL", 2012));
        carList.add(new Car("MITSUBISHI", 2000));
        carList.add(new Car("DODGE", 1970));
        carList.add(new Car("CHRYSLER", 2008));
        System.out.println("Обычная печать коллекции:");
        System.out.println(carList);
        System.out.println("Печать коллекции с помощью итератора");
        Iterator<Car> iterator = carList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        Object[] carArr = new Object[carList.size()];
        for (int i = 0; i < carList.size(); i++){
            carArr[i] = carList.get(i);
        }
        System.out.println("Массив Car: ");
        System.out.println(Arrays.toString(carArr));
        System.out.println("Массив Car, отсортированный по Model через Comparable: ");
        Arrays.sort(carArr);
        System.out.println(Arrays.toString(carArr));
        CarYearComparator carYearComparator = new CarYearComparator();
        carYearComparator.sort(carArr, carYearComparator);
        System.out.println("Масси Car, отсортированный по Year Comparator:");
        System.out.println(Arrays.toString(carArr));

    }
}

