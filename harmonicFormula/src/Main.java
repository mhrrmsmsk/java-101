import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı girin :");
        num = scanner.nextInt();
        double result =0;

        for (int i =1;i<=num;i++){

            result+=(1.0/i);
        }
        System.out.println("girilen sayının harmonik serisi :"+result);
    }
}