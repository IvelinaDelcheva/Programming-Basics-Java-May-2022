import java.util.Scanner;

public class ProjectCreation_07_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());
        int hours = number * 3;
        System.out.println("The architect " + name + " will need " + hours + " hours to complete " + number + " project/s. ");
    }
}
