package alishevbasic;

import java.util.Scanner;

public class Lesson8_DoWhile {
    public static void main(String[] args) {
        int value;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Ввведите 5");
            value = scanner.nextInt();
        } while (value != 5);
        System.out.println("Вы ввели 5");
    }
}
