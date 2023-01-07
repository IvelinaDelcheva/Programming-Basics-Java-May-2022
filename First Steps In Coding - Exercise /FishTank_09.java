import java.util.Scanner;

public class FishTank_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int wide = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());
        double volume = length * wide * height;
        double volumeInLitres = volume / 1000;
        double totalLitres = volumeInLitres * (1 - percent / 100);
        System.out.println(totalLitres);
    }
}
