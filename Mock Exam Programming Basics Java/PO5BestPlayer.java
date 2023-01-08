import java.util.Scanner;

public class PO5BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int maxGoals = Integer.MIN_VALUE;
        boolean isBest = false;
        String currentName = "";

        String nameOfPlayer = scanner.nextLine();
        while (!nameOfPlayer.equals("END")) {
            int numberOfGoals = Integer.parseInt(scanner.nextLine());


            if (numberOfGoals > maxGoals) {
                maxGoals = numberOfGoals;
                isBest = true;
                currentName = nameOfPlayer;
            }

            if(maxGoals >=  10){
                break;
            }

            nameOfPlayer = scanner.nextLine();
        }


        if(isBest){
            System.out.printf("%s is the best player!%n", currentName);
        }
        if(maxGoals < 3){
            System.out.printf("He has scored %d goals.", maxGoals);
        }else {
            System.out.printf("He has scored %d goals and made a hat-trick !!!", maxGoals);
        }

    }
}
