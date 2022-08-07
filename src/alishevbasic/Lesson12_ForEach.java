package alishevbasic;

public class Lesson12_ForEach {
    public static void main(String[] args) {
        int[] numbers = new int[11];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2;
        }
        int sum = 0;
        for (int x : numbers) {
            sum = sum + x;
        }
        for (int x : numbers) {
            System.out.print(x + " ");
        }
        System.out.println(sum);
    }
}
