import java.util.Scanner;
public class döngü {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter one positive number: ");
        int a = obj.nextInt();
        int b = 0;
        int total = 0;
        int sum = 0;
        while(b <= a){
            if(b % 3 == 0 && b % 4 == 0){
                total += b;
                sum++;
            }
            b++;

        }
        if(sum != 0) {
            double average = total / sum;
            System.out.println("Average is: " + average);
        }




    }
}
