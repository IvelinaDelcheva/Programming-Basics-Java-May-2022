import java.util.Scanner;

public class CleverLily_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int age = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int money = 0;
        int allMoney = 0;
        int toys = 0;
        int brother = 0;

        for (int i = 1; i <= age; i++) {

            if (i % 2 == 0) {

                money = money + 10;
                allMoney = allMoney + money;
                brother++;

            } else {

                toys++;

            }
        }

        int moneyFromToys = toys * toyPrice;
        int totalSavedMoney = allMoney + moneyFromToys - brother;
        double diff = Math.abs(totalSavedMoney - washingMachinePrice);

        if (totalSavedMoney >= washingMachinePrice) {

            System.out.printf("Yes! %.2f", diff);

        } else {

            System.out.printf("No! %.2f", diff);
        }


    }
}
