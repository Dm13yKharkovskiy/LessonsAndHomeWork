package homeworks.hw15decoder.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadText {
    private List<String> listReadText = new ArrayList<>();
    private Scanner textScanner;
    private File textFile;
    private String readLineText;


    public void readText(String pathDecodedText) throws IOException {
        textFile = new File(pathDecodedText);
        textScanner = new Scanner(textFile);
        while (textScanner.hasNextLine()) {
            readLineText = textScanner.nextLine();
            listReadText.add(readLineText);
            System.out.println(readLineText);
        }
        textScanner.close();
    }
    public List<String> getListReadText(){
        return listReadText;
    }
}
