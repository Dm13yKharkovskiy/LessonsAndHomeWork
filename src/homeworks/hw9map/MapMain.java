package homeworks.hw9map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapMain {
    public static void main(String[] args) {
        Map<String, String> families = new HashMap<>();
        families.put("Москва", "Ивановы");
        families.put("Киев", "Петровы");
        families.put("Лондон", "Абрамовичи");
        String exit;
        String family;
        Scanner scanner = new Scanner(System.in);
        do {
            do {
                System.out.println("Веедите название города из списка: Москва, Киев, Лондон.");

                family = families.get(scanner.nextLine());
                if (family == null) {
                    System.out.println("Вы ввели неверный город! Проверьте регистр, расскладку клавиатуры и наличие города в списке.");
                } else {
                    System.out.println("В этом городе проживают - " + family);
                }
            } while (family == null);
            System.out.println("Чтобы продолжить введите return, для завершения нажмите любую клавишу");
            exit = scanner.nextLine();
        }
        while (exit.equals("return"));
        System.out.println("Завершение работы");

    }
}
