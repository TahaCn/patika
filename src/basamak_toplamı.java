import java.util.Scanner;


public class basamak_toplamı {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.print("Enter one integer: ");

        int number = inp.nextInt();
        int total = 0;

        while (number != 0) {
            total += number % 10;
            number = number / 10;
        }
        System.out.println("Total is: " + total);










    }

}


