import java.util.Scanner;
public class yıldız  {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter one integer: ");
        int a = inp.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int k = 1; k <= (a - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int x = a - 1; x >= 1; x--) {

            for (int d = 1; d <= (a - x); d++) {
                System.out.print(" ");
            }
            for (int f = 1; f <= (2 * x) - 1; f++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}