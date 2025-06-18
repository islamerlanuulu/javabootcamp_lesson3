import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Число: ");
        int userNumber = scanner.nextInt();

        if (userNumber == 0) {
            System.out.println("Ноль");
        } else if (userNumber == 1000) {
            System.out.println("Тысяча");
        } else {
            int hundreds = userNumber / 100;
            if (hundreds == 1) {
                System.out.print("сто ");
            } else if (hundreds == 2) {
                System.out.print("двести ");
            } else if (hundreds == 3) {
                System.out.print("триста ");
            } else if (hundreds == 4) {
                System.out.print("четыреста ");
            } else if (hundreds == 5) {
                System.out.print("пятьсот ");
            } else if (hundreds == 6) {
                System.out.print("шестьсот ");
            } else if (hundreds == 7) {
                System.out.print("семьсот ");
            } else if (hundreds == 8) {
                System.out.print("восемьсот ");
            } else if (hundreds == 9) {
                System.out.print("девятьсот ");
            }

            int tens = userNumber % 100;
            if (tens >= 11 && tens <= 19) {
                if (tens == 11) {
                    System.out.print("одиннадцать");
                } else if (tens == 12) {
                    System.out.println("двенадцать");
                } else if (tens == 12) {
                    System.out.println("двенадцать");
                } else if (tens == 13) {
                    System.out.println("тринадцать");
                } else if (tens == 14) {
                        System.out.println("четырнадцать");
                } else if (tens == 15) {
                    System.out.println("пятнадцать");
                } else if (tens == 16) {
                    System.out.println("шеснадцать");
                } else if (tens == 17) {
                    System.out.println("семьнадцать");
                } else if (tens == 18) {
                    System.out.println("восемьнадцать");
                } else if (tens == 19) {
                    System.out.println("девятьнадцать");
                }
                } else {

                tens = userNumber / 10 % 10;
                if (tens == 1) {
                    System.out.print("десять ");
                } else if (tens == 2) {
                    System.out.print("двадцать ");
                } else if (tens == 3) {
                    System.out.print("тридцать ");
                } else if (tens == 4) {
                    System.out.print("сорок ");
                } else if (tens == 5) {
                    System.out.print("пятьдесят ");
                } else if (tens == 6) {
                    System.out.print("шестьдесят ");
                } else if (tens == 7) {
                    System.out.print("семьдесят ");
                } else if (tens == 8) {
                    System.out.print("восемьдесят ");
                } else if (tens == 9) {
                    System.out.print("девяносто ");
                }
                int ones = userNumber % 10;
                if (ones == 1) {
                    System.out.print("один ");
                } else if (ones == 2) {
                    System.out.print("два ");
                } else if (ones == 3) {
                    System.out.print("три ");
                } else if (ones == 4) {
                    System.out.print("четыре ");
                } else if (ones == 5) {
                    System.out.print("пять ");
                } else if (ones == 6) {
                    System.out.print("шесть ");
                } else if (ones == 7) {
                    System.out.print("семь ");
                } else if (ones == 8) {
                    System.out.print("восемь ");
                } else if (ones == 9) {
                    System.out.print("девять ");
                }
            }
        }
    }
}
