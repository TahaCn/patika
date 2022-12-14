import java.util.Scanner;
public class sınıf_geçme {
    public static void main(String[] args) {


        int mat, fizik, turkce, kimya, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz:");
        mat = input.nextInt();
        if (mat < 0 && mat > 100)
            mat = 0;

        System.out.print("Fizik notunuz:");
        fizik = input.nextInt();
        if (fizik < 0 && fizik > 100)
            fizik = 0;

        System.out.print("Turkce notunuz:");
        turkce = input.nextInt();
        if (turkce < 0 && turkce > 100)
            turkce = 0;

        System.out.print("Kimya notunuz:");
        kimya = input.nextInt();
        if (kimya < 0 && kimya > 100)
            kimya = 0;

        System.out.print("Muzik notunuz:");
        muzik = input.nextInt();
        if (muzik < 0 && muzik > 100)
            muzik = 0;


        double avarage = (mat + fizik + turkce + kimya + muzik) / 5;
        if (avarage <= 55) {
            System.out.println("Sinifta kaldiniz");
        } else {
            System.out.println("Sinifi gectiniz");
        }
        System.out.print("Not ortalamaniz:" + avarage);

    }
    }


