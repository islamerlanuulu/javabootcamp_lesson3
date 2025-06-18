import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите год:");
        int year = scanner.nextInt();

        boolean result = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

        System.out.println(result);
    }
}
