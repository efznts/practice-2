import java.util.Scanner;

public class Task4 {
    public static double powerSum(double a) {
        return Math.pow(a, 2) + Math.pow(a, 4) + Math.pow(a, 6);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите A: ");
        double a = in.nextDouble();
        System.out.println("Сумма = " + powerSum(a));
    }
}
