package alishevbasic;

import java.util.Scanner;

public class Lesson7_ScannerInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите что-нибудь");
        String yourInput = input.nextLine();
        System.out.println("Вы ввели " + yourInput);
    }
}
