package homeworks.hw15decoder;

import homeworks.hw15decoder.decode.DecodeText;
import homeworks.hw15decoder.menu.TextConsole;
import homeworks.hw15decoder.service.OverwriteText;
import homeworks.hw15decoder.service.PrintText;
import homeworks.hw15decoder.service.ReadText;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String pathDecodedFile = "C:\\Users\\Дмитрий\\IdeaProjects\\LessonsAndHomeWork\\src\\homeworks\\hw15decoderr\\Text";
        System.out.println(TextConsole.START.getDescription());
        ReadText readText = new ReadText();
        readText.readText(pathDecodedFile);
        PrintText printText = new PrintText();
        printText.print(readText.getListReadText());
        DecodeText decodeText = new  DecodeText();
        decodeText.decodeText(readText.getListReadText());
        System.out.println(TextConsole.TEXT_BEFORE_DECODING.getDescription());
        printText.print(decodeText.getListDecodedText());
        OverwriteText overwriteText = new OverwriteText();
        overwriteText.writeText(pathDecodedFile, decodeText.getListDecodedText());
        System.out.println(TextConsole.END.getDescription());

    }
}
