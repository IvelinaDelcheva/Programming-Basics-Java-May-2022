import java.util.Scanner;

public class AccountBalance_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        double allSum = 0;

        while(!command.equals("NoMoreMoney")){
            double input = Double.parseDouble(command);

            if(input < 0){
                System.out.println("Invalid operation!");
                break;
            }

            System.out.printf("Increase: %.2f%n", input);
            allSum = allSum + input;

            command = scanner.nextLine();

        }

        System.out.printf("Total: %.2f", allSum);
    }
}
