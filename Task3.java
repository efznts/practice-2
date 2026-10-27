import java.util.Scanner;

public class Task3 {
    public static int digitCount(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }

    public static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите N (> 0): ");
        int n = in.nextInt();

        if (n <= 0) {
            System.out.println("Ошибка: N должно быть больше 0");
            return;
        }
        System.out.println("Количество цифр: " + digitCount(n));
        System.out.println("Сумма цифр: " + digitSum(n));
    }
}
