import java.util.Scanner;

public class PositiveNegativeOrZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println("Ноль");
        } else if (number < 0) {
            System.out.println("Отрицательное число");
        } else if (number > 0) {
            System.out.println("Положительное число");
        }
    }
}
