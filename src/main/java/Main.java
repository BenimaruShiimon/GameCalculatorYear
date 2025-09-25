import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Добро пожаловать в игру Календарь!");
        int count = 0;

        while (true) {
            System.out.println("Введите год: ");
            String inputYear = sc.nextLine();
            int year = Integer.parseInt(inputYear);

            System.out.println("Введите колличество дней: ");
            String inputDays = sc.nextLine();
            int day = Integer.parseInt(inputDays);

            int correctDays = countOfDay(year);
            if (day == correctDays) {
                count++;

            } else if (day < correctDays) {
                System.out.println("Неправильно! В " + year + " году " + correctDays + " дней.\n" +
                        "Ваш счет = " + count);
                break;
            }
        }
        sc.close();
    }


    public static int countOfDay(int year) {
        if (year % 400 == 0) {
            return 366; // високосный год
        } else if (year % 100 == 0) {
            return 365; // обычный год
        } else if (year % 4 == 0) {
            return 366; // високосный год
        } else {
            return 365; // обычный год
        }

    }
}
