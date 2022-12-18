import java.util.Random;
import java.util.Scanner;

public class mayın {
    int satır;
    int sütun;
    String[][] tarla;
    String[][] mayinY;
    int mayın;
    int tarlaBoyut;

    mayın(int satır, int sütun) {
        this.satır = satır;
        this.sütun = sütun;
        this.tarla = new String[this.satır][this.sütun];
        this.mayinY = new String[this.satır][this.sütun];
        this.mayın = (this.satır * this.sütun) / 4;
        this.tarlaBoyut = this.satır * this.sütun;
    }

    public void tarlaDoldur() {
        for (int i = 0; i < this.satır; i++) {
            for (int j = 0; j < this.sütun; j++) {
                tarla[i][j] = "-";
            }
        }
    }

    public void mayinla() {
        System.out.println("Mayınların Konumu");
        tarlaDoldur();
        for (int i = 0; i < this.mayın; i++) {
            Random rand = new Random();
            int rand_int1 = rand.nextInt(this.satır);
            int rand_int2 = rand.nextInt(this.sütun);
            if (tarla[rand_int1][rand_int2] != "*") {
                tarla[rand_int1][rand_int2] = "*";
                mayinY[rand_int1][rand_int2] = "*";
            }
        }
        goster();
        System.out.println("============================================");
    }

    public void goster() {
        for (int i = 0; i < this.satır; i++) {
            for (int j = 0; j < this.sütun; j++) {
                System.out.print(tarla[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void play() {
        Scanner input = new Scanner(System.in);
        int bosAlan = this.tarlaBoyut - this.mayın;
        while (bosAlan > 0) {
            System.out.print("İşaretlenecek satır değeri: ");
            int seciliSatir = input.nextInt() - 1;
            System.out.print("İşaretlenecek sütun değeri: ");
            int seciliSütun = input.nextInt() - 1;

            if (mayinY[seciliSatir][seciliSütun] == "*") {
                System.out.println("====GAME OVER====");
                return;
            }
            if (tarla[seciliSatir][seciliSütun] == "-") {
                tarla[seciliSatir][seciliSütun] = Sayaç(seciliSatir, seciliSütun);
            }
            goster();
            System.out.println("============================================");
            bosAlan--;
        }
        System.out.println("Tebrikler kazandınız!!!");
    }

    public String Sayaç(int seciliSatir, int seciliSütun) {
        int mayinSayar = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (seciliSatir - 1 + i >= 0 && seciliSatir - 1 + i < tarla.length) {
                    if (seciliSütun - 1 + j >= 0 && seciliSütun - 1 + j < tarla[i].length) {
                        if (mayinY[seciliSatir - 1 + i][seciliSütun - 1 + j] == "*") {
                            mayinSayar++;
                        }
                    }
                }
            }


        }
        String s = Integer.toString(mayinSayar);
        return s;
    }

    public void run() {

        mayinla();
        tarlaDoldur();
        goster();
        play();


    }
}