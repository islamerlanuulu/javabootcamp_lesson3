import java.util.Scanner;

public class ThreeDigitNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        int number = scanner.nextInt();

        boolean result = number >= 100 && number <= 999 && number % 7 == 0 && number % 11 == 0;

        System.out.println(result);
    }
}
