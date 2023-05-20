import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // dizi oluşturma
        Scanner scanner= new Scanner(System.in);
        System.out.print("Eleman sayısı :");
        int n = scanner.nextInt();
        int[] arr=new int[n];
        System.out.println("Dizinin Elemanlarını Giriniz :");
        for (int i=0;i<n;i++){
            System.out.print((i+1)+"."+"Elemanı :");
            int value=scanner.nextInt();
            arr[i]=value;
        }

        int count;
        for (int i =0;i<arr.length;i++){
            //sayaç sıfırlama
            count=0;
            //kaç kez tekrar ettiğini bulan döngü
            for (int j=0;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    count++;
                }
            }
                System.out.println(arr[i]+" sayısı "+count+" kez tekrar edildi");
        }




    }
}