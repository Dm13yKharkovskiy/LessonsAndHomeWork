package homeworks.hw12;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CheckNotCloseLogs checkNotCloseLogs = new CheckNotCloseLogs();
        checkNotCloseLogs.read("log.txt");
        checkNotCloseLogs.difference();
        checkNotCloseLogs.printNotCloseLogs();
        checkNotCloseLogs.write("notcloselogs.txt");
    }
}
