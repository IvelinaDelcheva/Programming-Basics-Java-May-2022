import java.util.Scanner;

public class ToyShop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double vacationPrice = Double.parseDouble(scanner.nextLine());
        int puzzlesCount = Integer.parseInt(scanner.nextLine());
        int dollsCount = Integer.parseInt(scanner.nextLine());
        int teddyCount = Integer.parseInt(scanner.nextLine());
        int minionsCount = Integer.parseInt(scanner.nextLine());
        int truckCount = Integer.parseInt(scanner.nextLine());

        double totalPrice = puzzlesCount * 2.60 + dollsCount * 3.0 + teddyCount * 4.10 +
                minionsCount * 8.20 + truckCount * 2.0;

        int allToys = puzzlesCount + dollsCount + teddyCount + minionsCount + truckCount;

        if (allToys >= 50) {
            totalPrice = totalPrice * 0.75;
        }

        double profit = totalPrice * 0.9;

        double diff = Math.abs(profit - vacationPrice);

        if (profit >= vacationPrice) {
            System.out.printf("Yes! %.2f lv left.", diff);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", diff);
        }


    }
}
