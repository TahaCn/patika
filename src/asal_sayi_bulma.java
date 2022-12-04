import java.util.Scanner;

public class asal_sayi_bulma {
      static void asal(){
          Scanner inp = new Scanner(System.in);
          int a = 2;
          System.out.print("Bir sayı giriniz: ");
          int b = inp.nextInt();
          int sum = 0;

          while(a < b){
              if(b % a == 0){
                  sum += 1;
              }
              a++;
          }
          if(sum == 0){
              System.out.println(b + " asal sayıdır.");
          }
          else {
              System.out.println(b + " asal sayı değildir.");
          }



      }

    public static void main(String[] args) {
        asal();
    }
}
