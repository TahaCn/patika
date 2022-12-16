import java.util.Scanner;

public class fibonacci2{
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 0;
        int counter = 0;
        int a;

        Scanner inp = new Scanner(System.in);
        System.out.print("Eleman sayısını giriniz:  ");
        a = inp.nextInt();
        while(counter <a){
            System.out.println(n1 + " ");

            int n3 = n2+ n1;
            n1 = n2;
            n2 = n3;
            counter++;


        }

    }
}