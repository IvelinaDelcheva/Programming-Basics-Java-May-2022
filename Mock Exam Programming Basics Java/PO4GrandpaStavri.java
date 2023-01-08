import java.util.Scanner;

public class PO4GrandpaStavri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




        int numberOfDays = Integer.parseInt(scanner.nextLine());
        double totalQuantity = 0;
        double totalDegrees = 0;


        for (int i = 1; i <= numberOfDays ; i++) {
            double quantity = Double.parseDouble(scanner.nextLine());
            double degree = Double.parseDouble(scanner.nextLine());

          totalQuantity = totalQuantity + quantity;
          totalDegrees = totalDegrees + quantity * degree;

        }

        double total = totalDegrees / totalQuantity;

        System.out.printf("Liter: %.2f%n", totalQuantity);
        System.out.printf("Degrees: %.2f%n", total);

        if(total < 38){
            System.out.println("Not good, you should baking!");
        }else if(total < 42){
            System.out.println("Super!");
        }else{
            System.out.println("Dilution with distilled water!");
        }

    }
}
