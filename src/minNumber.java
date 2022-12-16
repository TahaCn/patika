import java.util.Scanner;

public class minNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter your numbers number: ");
        int number = inp.nextInt();
        int min = 0;
        int max = 0;
        int a = 1;

        while (a <= number) {
            if (a == 1) {
                System.out.print("Enter your first number: ");
                int total = inp.nextInt();
                min = total;
                max = total;
            } else if (a > 1) {
                System.out.print("Enter your last number: ");
                int total = inp.nextInt();
                if (total < min) {
                    min = total;
                } else if (total > max) {
                    max = total;
                }
            }
            a++;
        }
        System.out.println("Minimum number is: " + min);
        System.out.print("Maximum number is: " + max);
    }
}