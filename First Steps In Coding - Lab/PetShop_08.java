import java.util.Scanner;

public class PetShop_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dog = Integer.parseInt(scanner.nextLine());
        int cat = Integer.parseInt(scanner.nextLine());
        double total = dog * 2.50;
        double total2 = cat * 4;
        System.out.println(total + total2 + " lv. ");
    }
}
