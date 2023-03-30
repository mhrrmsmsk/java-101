import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin elemean sayısı :");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){

arr[0]=1;
arr[1]=1;
if (i>1){
   arr[i]=arr[(i-1)]+arr[(i-2)];
    System.out.println(arr[i]);
} else {
    System.out.println(arr[i]);
}

        }

    }
}