import java.util.Scanner;

public class Repainting_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double sumNylon = (nylon + 2) * 1.50;
        double sumPaint = (paint * 1.1) * 14.50;
        double sumThinner = thinner * 5.00;
        double totalPriceMaterials = sumNylon + sumPaint + sumThinner + 0.40;
        double totalPriceLabour = (totalPriceMaterials * 0.30) * hours;
        double totalPrice = totalPriceMaterials + totalPriceLabour;
        System.out.println(totalPrice);



    }
}
