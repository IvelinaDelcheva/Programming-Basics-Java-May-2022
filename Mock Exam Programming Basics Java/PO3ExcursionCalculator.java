import java.util.Scanner;

public class PO3ExcursionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        double totalPrice = 0;

        if(numberOfPeople <= 5){
            switch (season){
                case "spring":
                    totalPrice = numberOfPeople * 50.00;

                    break;
                case "summer":
                    totalPrice = numberOfPeople * 48.50;
                    totalPrice = totalPrice * 0.85;
                    break;
                case "autumn":
                    totalPrice = numberOfPeople * 60.00;
                    break;
                case "winter":
                    totalPrice = numberOfPeople * 86.00;
                    totalPrice = totalPrice * 1.08;
                    break;
            }

        }else {

            switch (season){
                case "spring":
                    totalPrice = numberOfPeople * 48.00;

                    break;
                case "summer":
                    totalPrice = numberOfPeople * 45.00;
                    totalPrice = totalPrice * 0.85;
                    break;
                case "autumn":
                    totalPrice = numberOfPeople * 49.50;
                    break;
                case "winter":
                    totalPrice = numberOfPeople * 85.00;
                    totalPrice = totalPrice * 1.08;
                    break;
            }
        }

        System.out.printf("%.2f leva.", totalPrice);
    }
}
