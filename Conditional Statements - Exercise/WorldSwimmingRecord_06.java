import java.util.Scanner;

public class WorldSwimmingRecord_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double distanceInMetres = Double.parseDouble(scanner.nextLine());
        double timeInSecForMetre = Double.parseDouble(scanner.nextLine());

        double neededDistance = distanceInMetres * timeInSecForMetre;
        double resistanceTime = Math.floor(distanceInMetres / 15) * 12.5;
        double totalTime = neededDistance + resistanceTime;

        if (totalTime < recordInSeconds) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", totalTime - recordInSeconds);
        }
    }
}
