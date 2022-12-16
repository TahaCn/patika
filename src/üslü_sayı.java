import java.util.Scanner;

public class üslü_sayı {
    public static void main(String[] args) {
        Scanner input =new Scanner((System.in));
        int a, b;
        System.out.println("Enter your number: ");
        a= input.nextInt();
        System.out.println("Enter your force: ");
        b = input.nextInt();
        int total = 1;
        for (int i = 1; i<=b; i++){
            total*=a;

        }
        System.out.println(total);
    }
}
