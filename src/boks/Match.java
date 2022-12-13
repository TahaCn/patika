public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }



    // Çalıştırma metodu
    public void run() {
        if (checkWeight()) {
            if (start()) {
                while (f1.health > 0 && f2.health > 0) {
                    System.out.println("======Yeni Round=========");
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    f1.health = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    printScore();
                }
            } else {
                while (f1.health > 0 && f2.health > 0) {
                    System.out.println("======Yeni Round=========");
                    f1.health = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    printScore();
                }
            }
        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }
    }
    // Kilo kontrolü metodu
    public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    // Kimin başlayacağını belirlemek için oluşturduğum metot
    public boolean start() {
        double randomValue = Math.random() * 100;
        return (randomValue >= 0 && randomValue <= 50);
    }

    // Kazananı belirlemek için metot
    public boolean isWin() {
        if(f1.health == 0) {
            System.out.println("Maçı Kazanan : " + f2.name);
            return true;
        } else if (f2.health == 0){
            System.out.println("Maçı Kazanan : " + f2.name);
            return true;
        }

        return false;
    }

    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Kalan Can \t:" + f1.health);
        System.out.println(f2.name + " Kalan Can \t:" + f2.health);
    }
}


