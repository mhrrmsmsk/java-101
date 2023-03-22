import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      int km ,type,age;
double ageDiscount,retireDiscount,childDiscount;
      Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünde giriniz :");
        km = input.nextInt();

        System.out.print("Yaşınızı girniz :");
        age = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        type = input.nextInt();

        if (km>0 && age>0 && (type==1||type==2)){
double cost=(km*0.10);
ageDiscount =(cost*0.10);
retireDiscount =(cost*0.30);
childDiscount=(cost*0.50);

if (age<12 && type ==1){
    cost=cost-childDiscount;
    System.out.println("Toplam tutar:"+cost+" Tl");
} else if (age<12 && type==2) {
    cost = ((cost-childDiscount)*0.80)*2;
    System.out.println("Toplam tutar:"+cost+" Tl");
} else if (age>=12 && age<25 && type == 1) {
    cost = cost-ageDiscount;
    System.out.println("Toplam tutar:"+cost+" Tl");
} else if (age >= 12 && age <= 25 && type == 2) {
    cost = ((cost-ageDiscount)*0.80)*2;
    System.out.println("Toplam tutar:"+cost+" Tl");
} else if (age>65 && type==1) {
    cost = cost-retireDiscount;
    System.out.println("Toplam tutar:"+cost+" Tl");
} else if (age > 65 && type == 2) {
    cost = ((cost-retireDiscount)*0.80)*2;
    System.out.println("Toplam tutar:"+cost+"Tl");
}else if (age>25 && age<=65 && type ==1){
    System.out.println("Toplam tutar:"+cost+" Tl");
} else if (age > 25 && age <= 65 && type == 2) {
    cost = cost*0.80*2;
    System.out.println("Toplam tutar:"+cost+" Tl");
}

        }else System.out.println("Hatalı giriş yaptınız !");
    }
}