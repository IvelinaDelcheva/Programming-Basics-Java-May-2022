import java.util.Scanner;

public class Oscars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String actorName = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int numberOfEvaluation = Integer.parseInt(scanner.nextLine());

        double totalPoints = academyPoints;

        for (int i = 1; i <= numberOfEvaluation; i++) {

            String nameOfEvaluation = scanner.nextLine();
            double pointsOfEvaluation = Double.parseDouble(scanner.nextLine());

            double currentPointsSum = ((nameOfEvaluation.length() * pointsOfEvaluation) / 2);

            if (totalPoints < 1250.5) {
                totalPoints = totalPoints + currentPointsSum;
            }


        }


        if (totalPoints >= 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, totalPoints);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", actorName, 1250.5 - totalPoints);
        }
    }
}
