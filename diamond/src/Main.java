import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n ;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz :");
        n = scanner.nextInt();

        for (int i =1;i<=n;i++){
            for (int k =1;k<=(n-i);k++){
                System.out.print(" ");
            }
           for (int j =1;j<=(2*i)-1;j++){
               System.out.print("*");
           }

            System.out.println();
        }
        for (int z=1;z<n;z++){
            for (int l =1;l<=z;l++){
                System.out.print(" ");
            }
            for (int m =1;m <= 2 * (n - z) - 1;m++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}