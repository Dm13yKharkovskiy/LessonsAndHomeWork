package alishevbasic.lesson49_recursion;

public class Test {
    public static void main(String[] args) {
        int n = 5;
        int factorial = factorial(n);
        System.out.println(n + "! " + "= " + factorial);
    }

    private static int factorial(int n) {
        if (n == 1) return 1;
        if (n == 0) return 1;

        return n * factorial(n - 1);
    }
}
