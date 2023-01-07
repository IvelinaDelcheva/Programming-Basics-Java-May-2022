import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        double neededMoney = Double.parseDouble(scanner.nextLine());
        double moneyOnHand = Double.parseDouble(scanner.nextLine());

        int daysCounter = 0;
        int spendingCounter = 0;

        while (moneyOnHand < neededMoney && spendingCounter < 5){
            String command = scanner.nextLine();
            double savedMoney = Double.parseDouble(scanner.nextLine());

            daysCounter++;

            if (command.equals("save")) {
                moneyOnHand += savedMoney;
                spendingCounter = 0;
            } else if (command.equals("spend")) {
                moneyOnHand -= savedMoney;
                spendingCounter += 1;
                if (moneyOnHand < 0) {
                    moneyOnHand = 0;
                }
            }
        }

        if(spendingCounter == 5){
            System.out.println("You can't save the money.");
            System.out.printf("%d%n", daysCounter);
        } else{
            System.out.printf("You saved the money for %d days.", daysCounter);
        }

        }

        }


