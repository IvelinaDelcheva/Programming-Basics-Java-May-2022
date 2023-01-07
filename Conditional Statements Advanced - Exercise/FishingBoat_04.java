import java.util.Scanner;

public class FishingBoat_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fisherman = Integer.parseInt(scanner.nextLine());
        double shipPrice = 0;



        if (season.equals("Spring")) {
            shipPrice = 3000.00;
            if (fisherman <= 6) {
                shipPrice = shipPrice * 0.9;
            } else if (fisherman <= 11) {
                shipPrice = shipPrice * 0.85;
            } else if (fisherman > 12) {
                shipPrice = shipPrice * 0.75;
            }
        } else if (season.equals("Summer")) {
            shipPrice = 4200.00;
            if (fisherman <= 6) {
                shipPrice = shipPrice * 0.9;
            } else if (fisherman <= 11) {
                shipPrice = shipPrice * 0.85;
            } else if (fisherman > 12) {
                shipPrice = shipPrice * 0.75;
            }
        } else if (season.equals("Autumn")) {
            shipPrice = 4200.00;
            if (fisherman <= 6) {
                shipPrice = shipPrice * 0.9;
            } else if (fisherman <= 11) {
                shipPrice = shipPrice * 0.85;
            } else if (fisherman > 12) {
                shipPrice = shipPrice * 0.75;
            }
        } else if (season.equals("Winter")) {
            shipPrice = 2600.00;
            if (fisherman <= 6) {
                shipPrice = shipPrice * 0.9;
            } else if (fisherman <= 11) {
                shipPrice = shipPrice * 0.85;
            } else if (fisherman > 12) {
                shipPrice = shipPrice * 0.75;
            }
        }

        if ((fisherman % 2 == 0) && (!season.equals("Autumn"))) {
            shipPrice = shipPrice * 0.95;
        }

        double diff = Math.abs(budget - shipPrice);

        if (budget >= shipPrice) {
            System.out.printf("Yes! You have %.2f leva left.", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }
    }
}
