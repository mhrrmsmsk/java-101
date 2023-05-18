import java.util.Scanner;

public class Main {

    static void sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for (int j = 0; j < arr.length - i - 1; j++){
                if (arr[j]>arr[j+1]){
                    //elemanları yer değiştir
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin Boyutu :");
        int n=scanner.nextInt();
        int[] arr=new int[n];
        System.out.println("Dizinin Elemanlarını Giriniz :");
        for (int i=0;i<n;i++){
            System.out.print((i+1)+"."+"Elemanı :");
            int value=scanner.nextInt();
            arr[i]=value;
        }
sort(arr);
        System.out.print("Sıralama :");
        for (int i:arr){
            System.out.print(i+" ");

        }

    }

}