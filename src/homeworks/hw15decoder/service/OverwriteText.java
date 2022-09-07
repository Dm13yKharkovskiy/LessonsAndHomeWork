package homeworks.hw15decoder.service;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class OverwriteText {


    private PrintWriter textWriter;
    private String readLineText;
    private List<String> listDecodedText = new ArrayList<>();
    private File writeFile;


    public void writeText(String pathDecodedText, List<String> listDecodedText) throws IOException {
        writeFile = new File(pathDecodedText);
        textWriter = new PrintWriter(pathDecodedText);
        for (String textLine : listDecodedText) {
            textWriter.println(textLine);
        }
        textWriter.close();

    }
}
