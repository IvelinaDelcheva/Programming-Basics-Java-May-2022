import java.util.Scanner;

public class NewHouse_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String flowerType = scanner.nextLine();
        int countFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;

        if (flowerType.equals("Roses")) {
            totalPrice = countFlowers * 5.00;
            if (countFlowers > 80) {
                totalPrice = totalPrice * 0.90;
            }
        } else if (flowerType.equals("Dahlias")) {
            totalPrice = countFlowers * 3.80;
            if (countFlowers > 90) {
                totalPrice = totalPrice * 0.85;
            }

        } else if (flowerType.equals("Tulips")) {
            totalPrice = countFlowers * 2.80;
            if (countFlowers > 80) {
                totalPrice = totalPrice * 0.85;
            }
        } else if (flowerType.equals("Narcissus")) {
            totalPrice = countFlowers * 3.00;
            if (countFlowers < 120) {
                totalPrice = totalPrice + (totalPrice * 0.15);
            }
        } else if (flowerType.equals("Gladiolus")) {
            totalPrice = countFlowers * 2.50;
            if (countFlowers < 80) {
                totalPrice = totalPrice + (totalPrice * 0.2);
            }
        }

        double diff = Math.abs(budget - totalPrice);

        if (budget >= totalPrice) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left."
                    , countFlowers, flowerType, diff);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", diff);
        }


    }
}
