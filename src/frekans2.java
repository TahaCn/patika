public class frekans2{
    public static void main(String[] args) {
        int [] liste = new int [] {2, 2, 3, 4, 5, 5, 5, 3, 2, 4};
        int [] frekans = new int [liste.length];
        int a = -1;
        for(int i = 0; i <liste.length; i++){
            int b = 1;
            for(int j = i+1; j < liste.length; j++){
                if(liste[i] == liste[j]){
                    b++;
                    frekans[j] = a;
                }
            }
            if(frekans[i] != a)
                frekans[i] = b;
        }

        for(int i = 0; i < frekans.length; i++){
            if(frekans[i] != a)
                System.out.println("Element: "+ liste[i] + "Frekans: " + liste[i]);
        }


    }
}