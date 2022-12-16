import java.util.Scanner;

public class mükemmel_sayi {
    public static void main(String[] args) {

        int number;
        int total = 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir tam sayı giriniz: ");
        number = inp.nextInt();

        for(int i=1; i<=number; i++){
            if(number % i == 0){
                total += i;

            }
        }
        if(total - number == number){
            System.out.println(number + " mükemmel sayıdır!");
        }else{
            System.out.println(number + " mükemmel sayı değildir!");
        }



    }
}