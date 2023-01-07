import java.util.Scanner;

public class HotelRoom_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String month = scanner.nextLine();
        int overnightStays = Integer.parseInt(scanner.nextLine());
        double studioPrice = 0.0;
        double apartmentPrice = 0.0;

        if (month.equals("May") || month.equals("October")) {
            studioPrice = overnightStays * 50.00;
            apartmentPrice = overnightStays * 65.00;
            if (overnightStays > 7 && overnightStays < 14) {
                studioPrice = studioPrice * 0.95;
            } else if (overnightStays > 14) {
                studioPrice = studioPrice * 0.70;
                apartmentPrice = apartmentPrice * 0.90;
            }


        } else if (month.equals("June") || month.equals("September")) {
            studioPrice = overnightStays * 75.20;
            apartmentPrice = overnightStays * 68.70;
            if (overnightStays > 14) {
                studioPrice = studioPrice * 0.80;
                apartmentPrice = apartmentPrice * 0.90;
            }


        } else if (month.equals("July") || month.equals("August")) {
            studioPrice = overnightStays * 76.00;
            apartmentPrice = overnightStays * 77.00;
            if (overnightStays > 14) {
                apartmentPrice = apartmentPrice * 0.90;
            }
        }


        System.out.printf("Apartment: %.2f lv.%n", apartmentPrice);
        System.out.printf("Studio: %.2f lv.", studioPrice);
    }
}
