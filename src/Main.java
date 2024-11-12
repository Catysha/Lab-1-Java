import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите x: ");
        double x = scanner.nextDouble();
        System.out.print("Введите k: ");
        int k = scanner.nextInt();
        double p0 = 1;
        double res = p0;
        for (int i = 1; i <= k; i++) {
            p0 *= (0.5 - (i - 1)) / i * x;
            res += p0;
        }
        System.out.println("Значение sqrt(1 + x): " + Math.sqrt(1 + x));
        System.out.println("Результат ряда Тейлора: " + res);
        System.out.println("Результат ряда Тейлора: " + res);
        scanner.close();
    }
}