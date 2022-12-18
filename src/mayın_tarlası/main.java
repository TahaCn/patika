import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("======= MAYIN TARLASI OYUNUNA HOŞGELDİNİZ !! =======");
        System.out.print("Satır boyutunu giriniz: ");
        int satir =input.nextInt();
        System.out.print("Sütun boyutunu giriniz: ");
        int sutun = input.nextInt();

        mayın ms = new mayın(satir,sutun);
        ms.run();
    }
}