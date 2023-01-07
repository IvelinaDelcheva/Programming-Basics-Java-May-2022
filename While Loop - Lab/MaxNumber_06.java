import java.util.Scanner;

public class MaxNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int maxNUmber = Integer.MIN_VALUE;

        while(!command.equals("Stop")){
            int currentNum = Integer.parseInt(command);

            if(currentNum > maxNUmber){
                maxNUmber = currentNum;
            }

            command = scanner.nextLine();
        }

        System.out.println(maxNUmber);
    }
}
