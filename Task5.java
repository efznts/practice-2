import java.util.Scanner;

public class Task5 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            printMenu();
            String choice = in.nextLine();
            if (choice.equals("1")) {
                calculate();
            } else if (choice.equals("2")) {
                printAbout();
            } else if (choice.equals("3")) {
                printAuthor();
            } else if (choice.equals("0")) {
                running = false;
            } else {
                System.out.println("Нет такого пункта");
            }
        }
    }

    static void printMenu() {
        System.out.println("1 - Расчёт");
        System.out.println("2 - О программе");
        System.out.println("3 - О разработчике");
        System.out.println("0 - Выход");
    }

    static void printAbout() {
        System.out.println("Программа считает кинетическую энергию E = m * v * v / 2");
    }

    static void printAuthor() {
        System.out.println("Разработчик: ______");
    }

    static void calculate() {
        double m = readNumber("Введите массу (кг): ");
        if (m == -1) {
            return;
        }
        double v = readNumber("Введите скорость (м/с): ");
        if (v == -1) {
            return;
        }
        System.out.println("E = " + kineticEnergy(m, v) + " Дж");
    }

    static double kineticEnergy(double m, double v) {
        return m * v * v / 2;
    }

    // повторяет ввод, пока не введут число >= 0; q - выход в меню
    static double readNumber(String text) {
        while (true) {
            System.out.print(text);
            String s = in.nextLine();
            if (s.equals("q")) {
                return -1;
            }
            try {
                double x = Double.parseDouble(s);
                if (x >= 0) {
                    return x;
                }
                System.out.println("Число не может быть отрицательным, введите ещё раз (q - выход)");
            } catch (NumberFormatException e) {
                System.out.println("Ошибка ввода, введите ещё раз (q - выход)");
            }
        }
    }
}
