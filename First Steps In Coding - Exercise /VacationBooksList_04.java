import java.util.Scanner;

public class VacationBooksList_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberPages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int totalReadingTime = numberPages / pagesPerHour;
        int totalHoursPerDay = totalReadingTime / days;
        System.out.println(totalHoursPerDay);
    }
}
