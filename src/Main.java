import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод данных
        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();

        double start_money;
        while (true) {
            try {
                System.out.print("Введите размер первоначального взноса в рублях: ");
                start_money = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! Введите число.");
            }
        }

        int years;
        while (true) {
            try {
                System.out.print("Введите длительность накопительного периода в годах: ");
                years = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! Введите целое число.");
            }
        }

        double rate;
        while (true) {
            try {
                System.out.print("Введите размер ставки накопительного счета в процентах: ");
                rate = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! Введите число.");
            }
        }

        // Расчет и вывод результата
        double finish_money = start_money * Math.pow(1 + rate/100, years);
        System.out.printf(" %s, на вашем счёте будет: %.2f рублей.", name, finish_money);
    }
}
