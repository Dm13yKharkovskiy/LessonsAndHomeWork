package homeworks.hw13.meltiplicationtable;

import java.util.Scanner;

class Table {
    private int value;
    private int n = 2;
    private char rep;
    private String repeat;

    private void getTable(int value, int n) {
        if (n == 10) {
            return;
        }
        System.out.println(value + " " + "*" + " " + n + " " + "=" + " " + value * n);
        getTable(value, n + 1);
    }

    public void input() {
        do {
            System.out.println("Для просмотра тадлицы умножения введите число от 2 до 9: ");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                if ((value = scanner.nextInt()) > 1 && value < 10) {
                    getTable(value, n);
                } else throw new IndexOutOfBoundsException("Вы ввели неверное число!!!");
            } else throw new NumberFormatException("Вы ввели не число!!!");
            repeat(scanner);
            if (rep != 'y' && rep != 'n') {
                System.out.println("Вы сделали неверный выбор! Повторите выбор!");
                repeat(scanner);
            }

        } while (rep == 'y');
        System.out.println("Спасибо!");
    }

    private void repeat(Scanner scanner) {
        System.out.println("Желаете продолжить? y/n");
        String repeat = scanner.next();
        rep = repeat.charAt(0);
    }
}
