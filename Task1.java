import java.util.Scanner;

public class Task1 {
    public static double exp(double x, int n) {
        double sum = 1;
        double term = 1;
        for (int i = 1; i <= n; i++) {
            term = term * x / i;
            sum = sum + term;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите X: ");
        double x = in.nextDouble();
        System.out.print("Введите N: ");
        int n = in.nextInt();
        System.out.println("exp(X) = " + exp(x, n));
    }
}
