package homeworks.hw15decoder.menu;

public enum TextConsole {
    START("\u001B[32m" + "Текст в файле до дешифровки:" + "\u001B[0m"),
    TEXT_BEFORE_DECODING("\u001B[32m" + "Текст после дешифровки:" + "\u001B[0m"),
    END("\u001B[32m" + "Дешифровка прошла успешно. Текст перезаписан." + "\u001B[0m");

    private String description;

    TextConsole(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
