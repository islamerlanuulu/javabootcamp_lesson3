import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstRandomNumber =  (int) (Math.random() * ((100 - 1) + 1)) + 1;
        System.out.println(firstRandomNumber);
        int secondRandomNumber = (int) (Math.random() * ((100 - 1) + 1)) + 1;
        System.out.println(secondRandomNumber);

        System.out.println("Сумма: " + (firstRandomNumber + secondRandomNumber));
        System.out.println("Произведение: " + (firstRandomNumber * secondRandomNumber));

        System.out.println("Введите первое цисло");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе цисло");
        int secondNumber = scanner.nextInt();

        boolean result = (firstNumber == firstRandomNumber && secondNumber == secondRandomNumber) || (firstNumber == secondRandomNumber && secondNumber == firstRandomNumber);

        System.out.println(result);
    }
}
