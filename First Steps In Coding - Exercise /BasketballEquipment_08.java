import java.util.Scanner;

public class BasketballEquipment_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int priceTaxPerYear = Integer.parseInt(scanner.nextLine());
        double priceTrainers = priceTaxPerYear - (priceTaxPerYear * 0.4);
//        double priceTrainers = priceTaxPerYear * 0.6;
        double trackSuit = priceTrainers - (priceTrainers * 0.20);
//        double trackSuit - priceTrainers * 0.8;
        double basketBallPrice = trackSuit / 4;
        double basketBallAcc = basketBallPrice / 5;
        double totalPrice = priceTaxPerYear + priceTrainers + trackSuit + basketBallPrice + basketBallAcc;
        System.out.println(totalPrice);
    }
}
