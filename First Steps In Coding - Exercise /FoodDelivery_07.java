import java.util.Scanner;

public class FoodDelivery_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int veggieMenu = Integer.parseInt(scanner.nextLine());
        double chickenMenuPrice = chickenMenu * 10.35;
        double fishMenuPrice = fishMenu * 12.40;
        double veggieMenuPrice = veggieMenu * 8.15;
        double menusPrice = chickenMenuPrice + fishMenuPrice + veggieMenuPrice;
        double dessertPrice = menusPrice * 0.2;
        double totalPrice = menusPrice + dessertPrice + 2.50;
        System.out.println(totalPrice);

    }
}

