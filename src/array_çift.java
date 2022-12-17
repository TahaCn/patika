import java.util.Arrays;

public class array_çift{

    static boolean find(int[] array, int v) {
        for (int i : array) {
            if (i == v) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {


        int[] list = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10};
        int a = 0;
        int[] c = new int[list.length];
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (i != j) {
                    if (list[i] % 2 == 0 && list[j] % 2 == 0) {
                        if (!find(c, list[i])) {
                            c[a++] = list[i];
                        }
                    }
                }


            }
        }
        System.out.println(Arrays.toString(c));
        for(int b : c){
            if(b != 0){
                System.out.print(b +" ");
            }
        }
    }
}