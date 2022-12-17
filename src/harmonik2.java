public class harmonik2 {
    public static void main(String[] args) {
        int[] array= {1,2,3,4,5};
        double total = 0;
        double average;

        for(int i = 0; i < array.length; i++){
            total += (1 / array[i]);
        }
        System.out.println("Total: " + total);
        average = array.length / total;
        System.out.println("Ortalama: " + average);
    }
}
