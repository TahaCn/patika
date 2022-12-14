import java.util.Scanner;

public class burç {
    public static void main(String[] args) {
        int day, month;
        boolean bln = false;
        Scanner obj = new Scanner(System.in);
        System.out.println(" Doğduğunuz ayı giriniz: ");
        month = obj.nextInt();
        System.out.println(" Doğduğunuz günü giriniz: ");
        day = obj.nextInt();

        if (month == 1 && (day >= 1 && day <= 31)) {
            if (day < 22) {
                System.out.println(" oğlak ");
            } else {
                System.out.println(" kova ");
            }


        } else {
            bln = true;
        }

        if (month == 2 && (day >= 1 && day <= 28)) {
            if (day < 20) {
                System.out.println(" kova ");
            } else {
                System.out.println(" balık ");
            }

        } else {
            bln = true;
        }


        if (month == 3 && (day >= 1 && day <= 31)) {
            if (day < 21) {
                System.out.println(" balık ");
            } else {
                System.out.println(" koç ");
            }

        } else {
            bln = true;
            System.out.println(" gecersiz bir gün girdinz ");
        }
        if (month == 4 && (day >= 1 && day <= 30)) {
            if (day < 22) {
                System.out.println(" koç ");
            } else {
                System.out.println(" boğa ");
            }

        } else {
            bln = true;
        }
        if (month == 5 && (day >= 1 && day <= 31)) {
            if (day < 22) {
                System.out.println(" boğa ");
            } else {
                System.out.println(" ikizler ");
            }

        } else {
            bln = true;
        }
        if (month == 6 && (day >= 1 && day <= 31)) {
            if (day < 22) {
                System.out.println(" ikizler ");
            } else {
                System.out.println(" yengeç ");
            }


        } else {
            bln = true;
        }
        if (month == 7 && (day >= 1 && day <= 30)) {
            if (day < 22) {
                System.out.println("yengeç");
            } else {
                System.out.println("aslan");
            }


        } else {
            bln = true;
        }
        if (month == 8 && (day >= 1 && day <= 31)) {
            if (day < 22) {
                System.out.println("aslan");
            } else {
                System.out.println("başak");
            }


        } else {
            bln = true;
            ;
        }
        if (month == 9 && (day >= 1 && day <= 31)) {
            if (day < 22) {
                System.out.println("başak");
            } else {
                System.out.println("terazi");
            }


        } else {
            bln = true;
        }

        if (month == 10 && (day >= 1 && day <= 31)) {
            if (day < 22) {
                System.out.println("terazi");
            } else {
                System.out.println("akrep");
            }

        } else {
            bln = true;
            ;
        }

        if (month == 11 && (day >= 1 && day <= 31)) {
            if (day < 22) {
                System.out.println("akrep");
            } else {
                System.out.println("yay");
            }


        } else {
            bln = true;

        }
        if (month == 12 && (day >= 1 && day <= 31)) {
            if (day < 22) {
                System.out.println("yay");
            } else {
                System.out.println("oğlak");
            }


        } else {
            bln = true;
        }



    }


}