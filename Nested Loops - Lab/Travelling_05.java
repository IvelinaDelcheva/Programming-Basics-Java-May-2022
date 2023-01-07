import java.util.Scanner;

public class Travelling_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        while(!destination.equals("End")){

            double neededBudget = Double.parseDouble(scanner.nextLine());
            double savedMoney = 0;

            while(savedMoney < neededBudget) {
                double money = Double.parseDouble(scanner.nextLine());
                savedMoney = savedMoney + money;
            }

                    System.out.printf("Going to %s!%n", destination);


            destination = scanner.nextLine();

        }

    }
}
