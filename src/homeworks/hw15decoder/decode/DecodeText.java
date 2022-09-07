package homeworks.hw15decoder.decode;


import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DecodeText {
    private final Pattern PATTERN = Pattern.compile("(?i)(\\b)(в|без|вокруг|до|для" +
            "|между|за|к|на|по|про|с)(\\b|\\,|\\.)", Pattern.UNICODE_CHARACTER_CLASS);
    private Matcher matcher;
    private final String REPLACE_PATTERN = "\u001B[32m" + "JAVA" + "\u001B[0m";
    private List<String> listDecodedText = new ArrayList<>();


    public void decodeText(List<String> listReadText) {
        for (int indexListText = 0; indexListText < listReadText.size(); indexListText++) {
            matcher = PATTERN.matcher(listReadText.get(indexListText));
            listDecodedText.add(matcher.replaceAll(REPLACE_PATTERN));
        }
    }

    public List<String> getListDecodedText() {
        return listDecodedText;
    }


}
