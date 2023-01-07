import java.util.Scanner;

public class HalfSumElement_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int maxNum = Integer.MIN_VALUE;
        int allSum = 0;

        for (int i = 1; i <= n ; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            allSum = allSum + currentNum;

            if(currentNum > maxNum){
                maxNum = currentNum;
            }

        }

        int sameValue = Math.abs(allSum - maxNum);
        int diff = Math.abs(sameValue - maxNum);

        if(maxNum == sameValue){
            System.out.println("Yes");
            System.out.println("Sum = "  + sameValue);
        }else{
            System.out.println("No");
            System.out.println("Diff = " + diff);
        }
    }
}
