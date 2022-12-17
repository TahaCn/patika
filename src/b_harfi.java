public class b_harfi{
    public static void main(String[] args) {
        String[][] array = new String[7][4];

        for(int a = 0; a < array.length; a++){
            for(int b = 0; b < array[a].length; b++){
                if(a == 0 || a == 3 || a == 6 ){
                    array[a][b] = " * ";
                    array[a][3] = " ";
                }else if(b == 0 || b == 3){
                    array[a][b] = " * ";
                }else {
                    array[a][b] = "  ";
                }
            }
        }
        for (String[] row : array){
            for(String col : row){
                System.out.print(col);
            }
            System.out.println();
        }

    }
}