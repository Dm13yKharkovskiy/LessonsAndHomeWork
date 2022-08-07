package alishevbasic;

public class Lesson6_If {
    public static void main(String[] args) {
        int myInt = 15;
        if (myInt < 10) {
            System.out.println("не верно");
        } else if (myInt > 20) {
            System.out.println("да, верно");
        } else {
            System.out.println("ни одного из указанных");
        }
    }
}
