package homeworks.hw5linckedlist;

import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.add(1,5);
        System.out.println(list);
        System.out.println(list);
        list.clear();
        System.out.println(list.isEmpty());
    }
}
