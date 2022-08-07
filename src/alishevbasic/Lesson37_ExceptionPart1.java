package alishevbasic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lesson37_ExceptionPart1 {
    public static void main(String[] args) throws FileNotFoundException {
        readFile();
        File file = new File("text");
        try {
            Scanner scanner = new Scanner(file);
            System.out.println("После Scanner");

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        System.out.println("После блока try catch");
    }

    public static void readFile() throws FileNotFoundException {
        File file1 = new File("sdsd");
        Scanner scanner = new Scanner(file1);
    }

}
