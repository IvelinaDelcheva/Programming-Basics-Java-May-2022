import java.util.Scanner;

public class Journey_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String destination = "";
        String vacationType = "";
        double spentMoney = 0;



        if(budget <= 100){
            destination = "Bulgaria";
            if(season.equals("summer")){
                vacationType = "Camp";
                spentMoney = budget * 0.30;
            }
            else if(season.equals("winter")){
                vacationType = "Hotel";
                spentMoney = budget * 0.70;
            }
        }
        else if(budget <= 1000){
            destination = "Balkans";
            if(season.equals("summer")){
                vacationType = "Camp";
                spentMoney = budget * 0.40;
            }
            else if(season.equals("winter")){
                vacationType = "Hotel";
                spentMoney = budget * 0.80;
            }
        }
        else if(budget > 1000){
            destination = "Europe";
            vacationType = "Hotel";
            spentMoney = budget * 0.90;
        }



        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", vacationType, spentMoney);

    }
}
