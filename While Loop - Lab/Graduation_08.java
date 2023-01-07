import java.util.Scanner;

public class Graduation_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int counter = 0;
        double sum = 0;
        int lowGrades = 0;

        while(counter != 12){
            double currentGrade = Double.parseDouble(scanner.nextLine());

           if(currentGrade < 4){
               lowGrades++;
               if(lowGrades > 1){
                   break;
               }
           }

           sum = sum + currentGrade;
           counter++;

        }

        if(counter == 12){
            System.out.printf("%s graduated. Average grade: %.2f", name, sum / 12);
        }else{
            System.out.printf("%s has been excluded at %d grade", name, counter);
        }
    }
}
