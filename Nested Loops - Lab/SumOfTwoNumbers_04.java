import java.util.Scanner;

public class SumOfTwoNumbers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int startInterval = Integer.parseInt(scanner.nextLine());
        int endInterval = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        int sum = 0;
        boolean isFound = false;

        for (int number1 = startInterval; number1 <= endInterval ; number1++) {
            for (int number2 = startInterval; number2 <= endInterval ; number2++) {
                counter++;
                sum = number1 + number2;

                if(sum == magicNumber){
                    isFound = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, number1, number2, magicNumber);
                    break;
                }

            }

            if(isFound){
                break;
            }

        }

        if(!isFound){
            System.out.printf("%d combinations - neither equals %d", counter, magicNumber);
        }
    }
}
