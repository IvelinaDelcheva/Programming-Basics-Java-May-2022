import java.util.Scanner;

public class TrainTheTrainers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jury = Integer.parseInt(scanner.nextLine());
        double presentationGradeSum = 0;
        int gradeCount = 0;

        String command = scanner.nextLine();
        while(!command.equals("Finish")){
            String presentation = command;

            double presentationGrade = 0;

            for (int i = 1; i <= jury ; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                gradeCount++;
                presentationGrade = presentationGrade + grade;
                presentationGradeSum = presentationGradeSum + grade;

            }


            double averageGrade = presentationGrade / jury;
            System.out.printf("%s - %.2f.%n", presentation, averageGrade);

            command = scanner.nextLine();
        }

        double averageGradeSum = presentationGradeSum / gradeCount;
        System.out.printf("Student's final assessment is %.2f.", averageGradeSum);
    }
}
