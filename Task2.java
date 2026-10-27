public class Task2 {
    public static double sinDeg(int x) {
        return Math.sin(Math.toRadians(x));
    }

    public static void main(String[] args) {
        for (int x = 0; x <= 90; x += 5) {
            System.out.println("sin(" + x + ") = " + sinDeg(x));
        }
    }
}
