import java.util.Scanner;

public class CinemaTickets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int standard = 0;
        int kid = 0;
        int student = 0;
        int allTickets = 0;

        String command = scanner.nextLine();
        while (!command.equals("Finish")) {
            String movieName = command;
            int seats = Integer.parseInt(scanner.nextLine());
            int currentTickets = 0;

            String command2 = scanner.nextLine();
            while (!command2.equals("End")) {
                String ticketType = command2;
                allTickets++;
                currentTickets++;


                switch (ticketType) {
                    case "standard":
                        standard++;
                        break;
                    case "kid":
                        kid++;
                        break;
                    case "student":
                        student++;
                        break;
                }
                if(currentTickets >= seats){
                    break;
                }

                command2 = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.%n", movieName, currentTickets * 1.0 / seats * 100);

            command = scanner.nextLine();
        }

        System.out.printf("Total tickets: %d%n", allTickets);
        System.out.printf("%.2f%% student tickets.%n", student * 1.0 / allTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", standard * 1.0 / allTickets * 100);
        System.out.printf("%.2f%% kids tickets.%n", kid * 1.0 / allTickets * 100);

    }
}
