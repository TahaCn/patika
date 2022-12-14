import java.util.Scanner;

public class sayı_sıralama {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayınızı giriniz: ");
        int a = input.nextInt();

        System.out.print("İkinci sayınızı giriniz: ");
        int b = input.nextInt();

        System.out.print("Üçüncü sayınızı giriniz: ");
        int c = input.nextInt();

        if ((a > b) && (a > c)) {
            if (b > c) {
                System.out.println(a + " > " + b + " > " + c);
            } else {
                System.out.println(a + " > " + c + " > " + b);
            }
        }else if ((b > a) && (b > c)) {
            if (c > a) {
                System.out.println(b + " > " + c + " > " + a);
            }else {
                System.out.println(b + " > " + a + " > " + c);
            }
        }else {
            if(a > b) {
                System.out.println(c + " > " + a + " > " + b);
            }else {
                System.out.println(c + " > " + b + " > " + a);
            }
        }
    }
}