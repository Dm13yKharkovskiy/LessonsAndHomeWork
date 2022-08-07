package alishevbasic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lesson36_ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path1 = "C:" + separator + "MyPrograms" +
                separator + "test.txt";
        File file = new File(path1);
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");
        int[] numbers = new int[3];
        int counter = 0;
        for(String number : numbersString) {
            numbers[counter++] = Integer.parseInt(number);
        }
        scanner.close();
        System.out.println();
        double a = 4.5;
        int b = (int)a;
        System.out.println(b);
    }
}
