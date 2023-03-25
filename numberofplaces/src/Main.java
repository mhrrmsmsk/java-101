import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı giriniz :");
        number = scanner.nextInt();
int result = 0;
        int basValue;

        while (number!=0){

           basValue = number%10;
number/=10;
result+=basValue;
        }
        System.out.println("Basamak değerleri toplamı :"+result);
    }
}