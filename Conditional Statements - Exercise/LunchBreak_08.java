import java.util.Scanner;

public class LunchBreak_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        String seriesName = scanner.nextLine();
        int episodeDuration = Integer.parseInt(scanner.nextLine());
        int brakeDuration = Integer.parseInt(scanner.nextLine());

        double lunchTime = brakeDuration / 8.0;
        double restTime = brakeDuration / 4.0;
        double leftTime = brakeDuration - lunchTime - restTime;
        double diff = Math.abs(episodeDuration - leftTime);


        if(leftTime >= episodeDuration){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", seriesName, Math.ceil(diff) );
        }else{
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", seriesName, Math.ceil(diff));
        }


    }

}
