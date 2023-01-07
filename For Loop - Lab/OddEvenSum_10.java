import java.util.Scanner;

public class OddEvenSum_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int even = 0;
        int odd = 0;

        for(int i = 1; i <= n; i++){
            int number = Integer.parseInt(scanner.nextLine());
            if(i % 2 == 0){
                even += number;
            }else {
                odd += number;
            }
        }



        if(even == odd){
            System.out.println("Yes");
            System.out.println("Sum = " + even);
        }else {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(even - odd));
        }
    }
}
