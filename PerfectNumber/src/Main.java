import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num,sum=0;
        System.out.print("Sayı giriniz :");
        num=scanner.nextInt();

        for (int i=1;i<=num;i++){
            if (num%i==0){
               sum+=i;
            }
        }
        if (sum==(2*num)){
            System.out.println("Mükemmel sayıdır");
        }else System.out.println("Mükemmel sayı değildir");
    }
}