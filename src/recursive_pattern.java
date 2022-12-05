import java.util.Scanner;

public class recursive_pattern {
    static void pattern(int n, boolean side, int temp) {
        if (side && n > 0 && n <= temp) {
            System.out.print(n + " ");
            n -= 5;
            pattern(n, true, temp);
            if (n <= 0) {
                pattern(n, false, temp);
            }
        } else if (side == false && n <= temp) {
            System.out.print(n + " ");
            n += 5;
            pattern(n, false, temp);
        }
    }

    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        a = sc.nextInt();
        int temp = a;
        System.out.println();
        pattern(a, true, temp);
    }





}
