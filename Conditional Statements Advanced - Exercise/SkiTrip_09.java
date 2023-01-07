import java.util.Scanner;

public class SkiTrip_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int daysForStay = Integer.parseInt(scanner.nextLine());
        String typeOfRoom = scanner.nextLine();
        String evaluation = scanner.nextLine();
        double priceForStay = 0.0;



        if(typeOfRoom.equals("room for one person")){
            priceForStay = (daysForStay - 1) * 18.00;
        }
        else if(typeOfRoom.equals("apartment")){
            priceForStay = (daysForStay - 1) * 25.00;
            if(daysForStay < 10){
                priceForStay = priceForStay * 0.70;
            }
            else if(daysForStay < 15){
                priceForStay = priceForStay * 0.65;
            }
            else if(daysForStay > 15){
                priceForStay = priceForStay * 0.50;
            }
        }
        else if(typeOfRoom.equals("president apartment")){
            priceForStay = (daysForStay - 1) * 35.00;
            if(daysForStay < 10){
                priceForStay = priceForStay * 0.90;
            }
            else if(daysForStay < 15){
                priceForStay = priceForStay * 0.85;
            }
            else if(daysForStay > 15){
                priceForStay = priceForStay * 0.80;
            }
        }

        if(evaluation.equals("positive")){
            priceForStay = priceForStay * 1.25;
        }
        else if(evaluation.equals("negative")){
            priceForStay = priceForStay * 0.90;
        }

        System.out.printf("%.2f", priceForStay);
    }
}
