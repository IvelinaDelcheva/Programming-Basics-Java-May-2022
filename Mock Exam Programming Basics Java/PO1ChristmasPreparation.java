import java.util.Scanner;

public class PO1ChristmasPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int rollsPaper = Integer.parseInt(scanner.nextLine());
        int rollsFabric = Integer.parseInt(scanner.nextLine());
        double glueLitre = Double.parseDouble(scanner.nextLine());
        int discountPercent = Integer.parseInt(scanner.nextLine());

        double rollsPaperPrice = rollsPaper * 5.80;
        double rollsFabricPrice = rollsFabric * 7.20;
        double glueLitrePrice = glueLitre * 1.20;
        double totalPrice = rollsPaperPrice + rollsFabricPrice + glueLitrePrice;
        double finalDiscount = discountPercent * 1.0 / 100;
        double discountSum = totalPrice - (totalPrice * finalDiscount);
        System.out.printf("%.3f", discountSum) ;
    }
}
