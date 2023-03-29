import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı adedi giriniz :");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++){
            System.out.print((i+1)+". Sayı :");
            arr[i]=scanner.nextInt();
        }
        int maxValue=arr[0];

        for (int i=0;i<n;i++){
            if (arr[i]>maxValue){
                maxValue=arr[i];
            }
        }
        System.out.println("En büyük sayı :"+maxValue);

        int minValue=arr[0];
        for (int i=0;i<n;i++){
            if (arr[i]<minValue){
                minValue=arr[i];
            }
        }
        System.out.println("En küçük sayı :"+minValue);

    }
}