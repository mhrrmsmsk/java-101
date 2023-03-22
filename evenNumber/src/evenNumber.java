
import java.util.Scanner;
public class evenNumber {
    public static void main(String[] args) {
        int a, b = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz :");
        a = input.nextInt();
        for(int i=0;i<a;i++){
            if(i%3==0 && i%4==0){
                b +=i;
            }
        }
        System.out.println("Ortalama : "+b);
    }
}