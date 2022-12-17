public class matris_transpozu {
    public static void main(String[] args) {
        int[][] array = {
                {1,2,3},
                {4,5,6},
        };
        int[][] new_arr = new int[array[0].length][array.length];
        for(int i = 0; i < new_arr.length; i++){
            for(int b = 0; b < new_arr[i].length; b++){
                new_arr[i][b] = array[b][i];
                System.out.print(new_arr[i][b] + " ");
            }
            System.out.println();
        }
    }
}