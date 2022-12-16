public class asal_sayi {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            int a = 0;
           for(int b = 1; b <= i; b++){
               if(i % b == 0){
                   a++;
               }
           }
           if(a == 2){
               System.out.print(i + " , ");
           }
        }
    }





}
