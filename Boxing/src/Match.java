public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }
    void run(){
        if(isCheck()){
            while (this.f1.health>0 && this.f1.health>0){
                if (choice()){
                    System.out.println("***ROUND***");
                    this.f2.health=this.f1.hit(this.f2);
                    if (isWin()){
                        break;
                    }
                    this.f1.health=this.f2.hit(this.f1);
                    if (isWin()){
                        break;
                    }
                    printScore();
                }else {
                    System.out.println("***ROUND***");
                    this.f1.health=this.f2.hit(this.f1);
                    if (isWin()){
                        break;
                    }
                    this.f2.health=this.f1.hit(this.f2);
                    if (isWin()){
                        break;
                    }
                    printScore();
                }

            }
        }else System.out.println("Kilolar uyuşmuyor!");
    }
    boolean isCheck(){
        return (this.f1.weight<=maxWeight && this.f1.weight>=minWeight) && (this.f2.weight<=maxWeight && this.f2.weight>=minWeight);
    }
    boolean isWin(){
        if (this.f1.health==0){
            System.out.println(this.f2.name+" Kazandı!");
            return true;
        }
        if (this.f2.health==0){
            System.out.println(this.f1.name+" Kazandı!");
            return true;
        }else {
            return false;
        }
    }
    void printScore(){
        System.out.println(this.f2.name+" kalan sağlık =>"+this.f2.health);
        System.out.println(this.f1.name+" kalan sağlık =>"+this.f1.health);
    }
    boolean choice(){
        double randomNumber = Math.random() * 100;
        return randomNumber <=50;
    }
}
