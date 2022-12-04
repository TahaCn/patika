public class palindrom_sayilar {

     static boolean isPalindrom(int number){
         int temp = number, lastNumber, reverseNumber = 0;
         while (temp != 0){
             System.out.println("Sayı: " + temp);
             lastNumber = temp % 10;
             System.out.println("Son basamak: " + lastNumber);
             reverseNumber = (reverseNumber * 10) + lastNumber;
             System.out.println("Yeni Sayı: " + reverseNumber);
             temp /= 10;

         }
         return true;
     }

    public static void main(String[] args) {
        isPalindrom(24768);
    }






}
