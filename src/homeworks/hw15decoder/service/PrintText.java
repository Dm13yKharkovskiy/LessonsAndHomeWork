package homeworks.hw15decoder.service;

import java.util.List;

public class PrintText {


    public void print(List<String> text) {
        for (String lineText : text) {
            System.out.println(lineText);
        }
    }

}
