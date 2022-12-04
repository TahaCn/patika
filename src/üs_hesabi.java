import java.util.Scanner;

public class üs_hesabi {

    static void üs(){
        Scanner inp = new Scanner(System.in);
          System.out.print("Enter your base: ");
          int base = inp.nextInt();
          System.out.print("Enter your exponent: ");
          int exponent = inp.nextInt();
          int result = 1;

          for(int i = 1; i <= exponent; i++){
              result *= base;
          }
          System.out.println(result);

    }

    public static void main(String[] args) {
        üs();
    }
}
