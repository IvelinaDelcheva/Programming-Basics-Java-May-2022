import java.util.Scanner;

public class SumPrimeNonPrime_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int primeNumbers = 0;
        int nonPrimeNumbers = 0;


        while (!command.equals("stop")) {
            int number = Integer.parseInt(command);

            if (number < 0) {
                System.out.println("Number is negative.");
                command = scanner.nextLine();
                continue;
            }

            int divident = 0;

            for (int i = 1; i <= number; i++) {

                if (number % i == 0) {
                    divident++;
                }
            }

            if (divident == 2) {
                primeNumbers = primeNumbers + number;
            } else {
                nonPrimeNumbers = nonPrimeNumbers + number;
            }

            command = scanner.nextLine();

        }

        System.out.printf("Sum of all prime numbers is: %d%n", primeNumbers);
        System.out.printf("Sum of all non prime numbers is: %d%n ", nonPrimeNumbers);
    }
}
