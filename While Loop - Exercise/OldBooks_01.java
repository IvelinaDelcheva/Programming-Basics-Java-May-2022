import java.util.Scanner;

public class OldBooks_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String wantedBook = scanner.nextLine();
        int numberOfBooks = 0;
        boolean wasFound = false;

        String input = scanner.nextLine();
        while (!input.equals("No More Books")) {


            if (input.equals(wantedBook)) {
                wasFound = true;
                break;
            }

            numberOfBooks++;

            input = scanner.nextLine();
        }

        if (wasFound) {
            System.out.printf("You checked %d books and found it.", numberOfBooks);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", numberOfBooks);
        }

    }
}
