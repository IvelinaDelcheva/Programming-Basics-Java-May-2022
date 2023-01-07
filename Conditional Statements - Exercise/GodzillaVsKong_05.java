import java.util.Scanner;

public class GodzillaVsKong_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double movieBudget = Double.parseDouble(scanner.nextLine());
        int walkingGentlemen = Integer.parseInt(scanner.nextLine());
        double costumePrice = Double.parseDouble(scanner.nextLine());

        double decorPrice = movieBudget * 0.1;
        double totalCostumePrice = walkingGentlemen * costumePrice;
        if (walkingGentlemen > 150) {
            totalCostumePrice = totalCostumePrice * 0.9;
        }

        double moviePrice = decorPrice + totalCostumePrice;

        double diff = Math.abs(moviePrice - movieBudget);

        if (moviePrice <= movieBudget) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", diff);

        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", diff);
        }


    }
}
