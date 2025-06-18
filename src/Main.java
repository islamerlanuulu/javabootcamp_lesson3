import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите дни недели (1-7):");
        int days =  scanner.nextInt();

        if (days == 1) {
            System.out.println("Пн");
        } else if (days == 2) {
            System.out.println("Вт");
        } else if (days == 3) {
            System.out.println("Ср");
        } else if (days == 4) {
            System.out.println("Чт");
        } else if (days == 5) {
            System.out.println("Пт");
        } else if (days == 6) {
            System.out.println("Сб");
        } else if (days == 7) {
            System.out.println("Вс");
        } else  {
            System.out.println("Такого дня нет!");
        }
    }
}