import java.util.Scanner;
public class döngü_iki {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int total = 0;
        int a = 2;
        while (a % 2 == 0){
            if(a % 4 == 0){
                total += a;
            }
            a = inp.nextInt();

        }
        System.out.println("4'ün katları olan sayılar toplamı: " + total);








    }
}
