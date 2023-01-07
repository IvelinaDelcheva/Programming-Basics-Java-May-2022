import java.util.Scanner;

public class TennisRanklist_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfTournaments = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());
        int finalPoints = 0;
        int wonTournaments = 0;

        for (int i = 1; i <= numberOfTournaments ; i++) {
            String stageOfTournament = scanner.nextLine();

            switch (stageOfTournament) {
                case "W":
                    finalPoints = finalPoints + 2000;
                    wonTournaments++;
                    break;
                case "F":
                    finalPoints = finalPoints + 1200;
                    break;
                case "SF":
                    finalPoints = finalPoints + 720;
                    break;
            }


        }

        System.out.printf("Final points: %d%n", finalPoints + startPoints);
        System.out.printf("Average points: %.0f%n", Math.floor(finalPoints * 1.0 / numberOfTournaments));
        System.out.printf("%.2f%%", wonTournaments * 1.0 / numberOfTournaments * 100);


    }
}
