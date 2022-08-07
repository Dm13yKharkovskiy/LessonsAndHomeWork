package alishevbasic;

public class Lesson23_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());
        sb.append(" My").append(" Friend");
        System.out.println(sb.toString());
    }
}
