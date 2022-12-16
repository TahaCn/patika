import java.util.Scanner;

public class ters_üçgen {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Basamak giriniz: ");
        int basamak = inp.nextInt();

        for (int i = basamak - 1; i >= 1; i--) {
            for (int b = i; b > i; b--) {
                System.out.print(" ");}

            for (int num = 1; num <= (2 * i - 1); num++) {
                System.out.print("*");}

            System.out.println(); }
    }
}