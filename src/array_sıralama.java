import java.util.Scanner;

public class array_sıralama{

    static void Array(int[] array){
        for(int i = 0; i<array.length; i++){
            for(int j = i+1; j<array.length; j++){
                int a = 0;
                if(array[i]>array[j]){
                    a = array[i];
                    array[i] = array[j];
                    array[j] = a;
                }
            }
        }
        for(int v : array){
            System.out.print(v + " ");
        }

    }


    public static void main(String[] args) {
        int eleman_sayisi;
        int eleman;
        Scanner inp = new Scanner(System.in);
        System.out.print("Dizinin eleman sayısını girin: ");
        eleman_sayisi = inp.nextInt();
        int[] list = new int[eleman_sayisi];

        for(int i = 0; i < list.length; i++){
            System.out.println("Elemanı girin: ");
            eleman = inp.nextInt();
            list[i] = eleman;
        }

        Array(list);



    }
}