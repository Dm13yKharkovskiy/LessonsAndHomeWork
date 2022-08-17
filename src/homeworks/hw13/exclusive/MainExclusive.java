package homeworks.hw13.exclusive;

import java.util.HashSet;
import java.util.Set;

public class MainExclusive {
    public static void main(String[] args) {
        System.out.println("У нас есть 2 обязательных факультатива, которые посещают студенты.");
        Set<Student> maths = new HashSet<>();
        Set<Student> philosophy = new HashSet<>();
        maths.add(new Student("Bob", 20));
        maths.add(new Student("Tom", 21));
        maths.add(new Student("Rob", 22));
        philosophy.add(new Student("Bob", 20));
        philosophy.add(new Student("Tom", 21));
        philosophy.add(new Student("Ivan", 23));
        System.out.println("1. Факультатив математики, студенты, которые посещают: ");
        System.out.println(maths);
        System.out.println("2. Факультатив философии, студенты, которые посещают: ");
        System.out.println(philosophy);
        System.out.println("Нам требуется узнать студентов, который посещают только один факультатив.");
        System.out.println("Это студенты");
        Set<Student> exclusive1 = new HashSet<>(maths);
        Set<Student> exclusive2 = new HashSet<>(philosophy);
        exclusive1.removeAll(philosophy);
        exclusive2.removeAll(maths);
        exclusive1.addAll(exclusive2);
        System.out.println(exclusive1);

    }
}
