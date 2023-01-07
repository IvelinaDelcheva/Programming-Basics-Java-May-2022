import java.util.Scanner;

public class Salary_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numberOpenTabs = Integer.parseInt(scanner.nextLine());
        double salary = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= numberOpenTabs; i++) {
            if (salary > 0) {
            String website = scanner.nextLine();

                switch (website) {
                    case "Facebook":
                        salary = salary - 150;
                        break;
                    case "Instagram":
                        salary = salary - 100;
                        break;
                    case "Reddit":
                        salary = salary - 50;
                        break;
                }
            }


        }

        if (salary <= 0) {
            System.out.println("You have lost your salary.");
        } else {
            System.out.printf("%.0f", salary);

        }


    }
}
