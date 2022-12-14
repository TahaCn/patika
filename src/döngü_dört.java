import java.util.Scanner;

public class döngü_dört {
    public static void main(String[] args) {
        int n, r, i, combination;
        int rP = 1, nP = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        n = scanner.nextInt();

        System.out.print("Enter the second number: ");
        r = scanner.nextInt();

        for (i = 1; i <= r; i++) {
            rP *= i;
            nP *= n;
            n--;
        }
        combination = nP / rP;
        System.out.print("Answer :" + combination);
    }
}