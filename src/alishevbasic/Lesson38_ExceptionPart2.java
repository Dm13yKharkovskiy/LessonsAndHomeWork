package alishevbasic;

import java.io.IOException;
import java.util.Scanner;

public class Lesson38_ExceptionPart2 {
    public static void main(String[] args) throws ScannerException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int x = Integer.parseInt(scanner.nextLine());
            if (x != 0) {
                throw new ScannerException("Пользователь ввел не ноль");
            }
        }
    }
}

class ScannerException extends Exception {

    public ScannerException(String description) {
        super(description);
    }

}
