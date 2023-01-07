import java.util.Scanner;

public class MinNumber_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int minNUmber = Integer.MAX_VALUE;

        while(!command.equals("Stop")){
            int currentNum = Integer.parseInt(command);

            if(currentNum < minNUmber){
                minNUmber = currentNum;
            }

            command = scanner.nextLine();
        }

        System.out.println(minNUmber);
    }
}
