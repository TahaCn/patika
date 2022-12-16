import java.util.Scanner;

public class ebob {
    public static void main(String[] args) {

        int a1, a2;
        int ebob, ekok, i;
        ebob = 1;
        ekok = 0;
        i = 1;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        a1 = inp.nextInt();

        System.out.print("Enter your second number: ");
        a2 = inp.nextInt();

        while (i <= a1 && i <= a2) {
            if (a1 % i == 0 && a2 % i == 0){
                ebob = i;
            }
            i++;


        }
        i++;
        System.out.println(ebob);
        ekok = a1 * a2 / ebob;
        System.out.println(ekok);


    }
}