import java.util.Scanner;

public class Walking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int targetSteps = 10000;
        int sumSteps = 0;
        boolean reachedGoal = false;


        String command = scanner.nextLine();
        while (!command.equals("Going home")) {
            int currentSteps = Integer.parseInt(command);
            sumSteps = sumSteps + currentSteps;

            if (sumSteps >= targetSteps) {
                break;

            }

            command = scanner.nextLine();

        }

        if(command.equals("Going home")){
            int homeSteps = Integer.parseInt(scanner.nextLine());
            sumSteps = sumSteps + homeSteps;
        }
        int diff = Math.abs(sumSteps - targetSteps);
        if(sumSteps >= targetSteps){
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", Math.abs(sumSteps - 10000));
        }else {
            System.out.printf("%d more steps to reach goal.", Math.abs(sumSteps - 10000));
        }
    }
}