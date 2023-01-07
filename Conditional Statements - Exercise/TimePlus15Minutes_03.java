import java.util.Scanner;

public class TimePlus15Minutes_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int hourInMin = hours * 60;
        int total = hourInMin + minutes + 15;
        int totalHours = total / 60;
        int totalMin = total % 60;
        if(totalHours > 23){
            totalHours = 0;
        }
        System.out.printf("%d:%02d", totalHours, totalMin);
    }
}
