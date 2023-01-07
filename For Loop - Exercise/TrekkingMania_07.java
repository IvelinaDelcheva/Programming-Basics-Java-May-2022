import java.util.Scanner;

public class TrekkingMania_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numberPfGroups = Integer.parseInt(scanner.nextLine());
        int musalaGroup = 0;
        int monBlancGroup = 0;
        int kilimandzharoGroup = 0;
        int k2Group = 0;
        int everestGroup = 0;
        int allPeople = 0;


        for (int i = 1; i <= numberPfGroups; i++) {
            int numberOfPeople = Integer.parseInt(scanner.nextLine());
            allPeople = allPeople + numberOfPeople;

            if (numberOfPeople <= 5) {
                musalaGroup = musalaGroup + numberOfPeople;
            } else if (numberOfPeople <= 12) {
                monBlancGroup = monBlancGroup + numberOfPeople;
            } else if (numberOfPeople <= 25) {
                kilimandzharoGroup = kilimandzharoGroup + numberOfPeople;
            } else if (numberOfPeople <= 40) {
                k2Group = k2Group + numberOfPeople;
            } else {
                everestGroup = everestGroup + numberOfPeople;
            }
        }

        System.out.printf("%.2f%%%n", musalaGroup * 1.0 / allPeople * 100);
        System.out.printf("%.2f%%%n", monBlancGroup * 1.0 / allPeople * 100);
        System.out.printf("%.2f%%%n", kilimandzharoGroup * 1.0 / allPeople * 100);
        System.out.printf("%.2f%%%n", k2Group * 1.0 / allPeople * 100);
        System.out.printf("%.2f%%%n", everestGroup * 1.0 / allPeople * 100);

    }
}
