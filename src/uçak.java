import java.util.Scanner;

public class uçak {
    public static void main(String[] args) {
        int km, yas, tip;
        double price = 0.10;
        double total = 0;
        double tipInd = 0;
        double yasInd = 0;

        Scanner obj = new Scanner(System.in);
        System.out.print("Mesafeyi giriniz: ");
        km = obj.nextInt();
        total = km*price;
        System.out.println("İndirimsiz ücret: " + total +" tl ");

        System.out.print("Tek yön için 1 / Çift Yön için 2: ");
        tip = obj.nextInt();

        if (tip == 2){
            System.out.println("İndirim tutarı: "+ (tipInd=total*0.20)+" tl");
        }else {
            System.out.println("İndiriminiz yok");
        }

        System.out.print("Yaşınızı giriniz: ");
        yas = obj.nextInt();
        if (yas<12){
            System.out.println(" Yaş indirimi ücreti:"+ (yasInd=total/2)+"tl");
        } else if (yas>12 && yas<24) {
            System.out.println("Yaş indirimi ücreti :"+ (yasInd=total - (total*0.10))+"tl");
        } else if (yas>65) {
            System.out.println("Yaş indirimi ücreti :"+ (yasInd=total - (total*0.30))+"tl");
        }else {
            System.out.println("Yaş indiriminiz yok!!!!! ");
        }
        System.out.println("-----------------------------------");

        System.out.println("İndirimsiz Toplam Ücreti =" + total + "TL");
        System.out.println("------------------------------------");
        System.out.println("Uçuş Tip İndirimi = " + tipInd + "TL");
        System.out.println("Yaş indirimi = "+ yasInd+ "TL");
        System.out.println("-------------------------------------");
        System.out.println("Bilet ücret Tutarınız = " + (total-tipInd-yasInd)+"TL" );
    }
}