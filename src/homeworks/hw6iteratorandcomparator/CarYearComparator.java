package homeworks.hw6iteratorandcomparator;

import java.util.Arrays;
import java.util.Comparator;

class CarYearComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getYear() - o2.getYear();
    }
    public void sort(Object[] arrCar, Comparator CarYearComparator){
        Arrays.sort(arrCar, CarYearComparator.reversed());
    }
}
