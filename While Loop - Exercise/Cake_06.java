import java.util.Scanner;

public class Cake_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int numberOfPieces = width * length;
        boolean endOfCake = false;

        String command = scanner.nextLine();
        while (!command.equals("STOP")) {
            int currentPieces = Integer.parseInt(command);

            numberOfPieces = numberOfPieces - currentPieces;
            if (numberOfPieces < 0) {
                endOfCake = true;
                break;
            }

            command = scanner.nextLine();
        }


        if (endOfCake) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(numberOfPieces));
        } else {
            System.out.printf("%d pieces are left.", Math.abs(numberOfPieces));
        }
    }
}
