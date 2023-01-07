import java.util.Scanner;

public class SuppliesForSchool_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int penPackage = Integer.parseInt(scanner.nextLine());
        int markerPackage = Integer.parseInt(scanner.nextLine());
        int litreRazr = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());
        double pricePencils = penPackage * 5.80;
        double priceMarkers = markerPackage * 7.20;
        double priceRazr = litreRazr * 1.20;
        double totalPrice = pricePencils + priceMarkers + priceRazr;
        double discountPrice = totalPrice - (totalPrice * discount / 100);
        System.out.println(discountPrice);
    }
}
