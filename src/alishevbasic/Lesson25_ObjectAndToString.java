package alishevbasic;

public class Lesson25_ObjectAndToString {
    public static void main(String[] args) {
        String string = "Hello";
        System.out.println(string);
        Student student = new Student("Ivan", 19);
        System.out.println(student);
    }
}
class Student extends Object {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
