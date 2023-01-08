import java.util.Scanner;

public class PO2DeerOfSanta {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int numberOfDaysMissing = Integer.parseInt(scanner.nextLine());
        int leftFoodKg = Integer.parseInt(scanner.nextLine());
        double foodPerDayDeer1 = Double.parseDouble(scanner.nextLine());
        double foodPerDayDeer2 = Double.parseDouble(scanner.nextLine());
        double foodPerDayDeer3 = Double.parseDouble(scanner.nextLine());


        double foodDeer1 = numberOfDaysMissing * foodPerDayDeer1;
        double foodDeer2 = numberOfDaysMissing * foodPerDayDeer2;
        double foodDeer3 = numberOfDaysMissing * foodPerDayDeer3;

        double totalFood = foodDeer1 + foodDeer2 + foodDeer3;

        double diff = Math.abs(leftFoodKg - totalFood);

        if(totalFood <= leftFoodKg){
            System.out.printf("%.0f kilos of food left.", Math.floor(diff));
        }else{
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(diff));
        }


    }
}
