import java.util.Scanner;

public class Moving_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int freeSpace = width * length * height;
        int movedBoxes = 0;
        boolean noSpace = false;

        String command = scanner.nextLine();
        while (!command.equals("Done")){
            int currentBoxes = Integer.parseInt(command);

            movedBoxes = movedBoxes + currentBoxes;

            if(movedBoxes > freeSpace){
                noSpace = true;
                break;
            }

            command = scanner.nextLine();

        }

        int diff = Math.abs(freeSpace - movedBoxes);
        if(noSpace){
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(diff));
        }else{
            System.out.printf("%d Cubic meters left.", Math.abs(diff));
        }
    }
}
