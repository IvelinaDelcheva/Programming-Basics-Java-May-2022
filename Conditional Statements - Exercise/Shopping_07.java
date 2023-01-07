import java.util.Scanner;

public class Shopping_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        double budget = Double.parseDouble(scanner.nextLine());
        int cardsCount = Integer.parseInt(scanner.nextLine());
        int processorsCount = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double cardsPrice = cardsCount * 250.0;
        double processorsPrice = processorsCount * (cardsPrice * 0.35);
        double ramPrice = ram * (cardsPrice * 0.1);

        double totalSum = cardsPrice + processorsPrice + ramPrice;

        if (cardsCount > processorsCount) {
            totalSum = totalSum * 0.85;
        }

        double diff = Math.abs(budget - totalSum);
        if(totalSum <= budget){
            System.out.printf("You have %.2f leva left!", diff);
        }else{
            System.out.printf("Not enough money! You need %.2f leva more!", diff);
        }
    }
}
