import java.util.Scanner;
import java.util.Arrays;

public class minmax {
    public static void main(String[] args) {

        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter one number: ");
        int numb = inp.nextInt();

        int[] List = {15, 12, 788, 1, -1, -778, 2, 0, numb};

        Arrays.sort(List);

        int x = Arrays.binarySearch(List, numb);
        if(x == 0){
            System.out.println("Nearest min number: " + List[x+1]);
            System.out.println("Nearest max number: " + List[x+2]);
        }

        else if ( x == List.length-1) {
            System.out.println("Nearest min number: " + List[x-1]);
            System.out.println("Nearest max number: " + List[x-2]);
        }

        else {
            System.out.println("Nearest min number: " + List[x - 1]);
            System.out.println("Nearest max number: " + List[x + 1]);
        }



    }
}