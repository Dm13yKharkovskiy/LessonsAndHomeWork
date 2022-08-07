package alishevbasic;

public class Lesson22_Final {
    public static void main(String[] args) {
        System.out.println(Test.CONSTANT);
        Test.getConstant();

    }
}
class Test {
    public static final int CONSTANT = 0;
    public static void getConstant(){
        System.out.println("My constant is " + CONSTANT);
    }
}
