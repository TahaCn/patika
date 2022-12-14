import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class manav_kasa {
    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlıcan = 5;
        double q, w, y, r, t;
        System.out.println("Kaç kilo armut alıcaksınız.");
        int a = inp.nextInt();
        q = armut * a;
        System.out.println("Kaç kilo elma alıcaksınız.");
        int b = inp.nextInt();
        w = elma * b;
        System.out.println("Kaç kilo domates alıcaksınz.");
        int c = inp.nextInt();
        y = domates * c;
        System.out.println("Kaç kilo muz alıcaksınız.");
        int d = inp.nextInt();
        r = muz * d;
        System.out.println("Kaç kilo patlıcan alıcaksınız.");
        int e = inp.nextInt();
        t = patlıcan * e;

        double total = t + r + y + w + q;
        System.out.println("Toplam tutar: " + total);




           }
}
