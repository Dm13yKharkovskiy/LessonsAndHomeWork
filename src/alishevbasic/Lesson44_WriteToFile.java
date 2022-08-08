package alishevbasic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Lesson44_WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("testfile");
        PrintWriter printWriter = new PrintWriter(file);

        printWriter.println("Test row 1");
        printWriter.println("Test row 2");
        printWriter.close();

    }
}
