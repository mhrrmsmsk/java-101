import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of triangle :");
        int n = scanner.nextInt();

        for (int z=0;z<=n;z++){
            for (int l =0;l<=z;l++){
                System.out.print(" ");
            }
            for (int m =1;m <= 2 * (n - z) - 1;m++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}