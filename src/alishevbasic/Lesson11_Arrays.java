package alishevbasic;

import java.util.Arrays;

public class Lesson11_Arrays {
    public static void main(String[] args) {
        int number = 10;
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        int[] numbers1 = {1,2,3,4};
        System.out.println("\n" + Arrays.toString(numbers1));
    }
}
