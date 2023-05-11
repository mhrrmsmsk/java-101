import java.util.Scanner;

public class Main {
    static void pattern(int n, int temp){
      if (n>0){
          System.out.print(n+" ");
           pattern(n-5,temp);
      } else if (n<=0) {
           pattern1(n,temp);
      }
    }
    static void pattern1(int n, int temp){
        if (n<=temp){
            System.out.print(n+" ");
                pattern1(n + 5, temp);
}
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("N sayısı :");
        int num=input.nextInt();
        int temp=num;
        System.out.print("N Çıktısı :");
       pattern(num,temp);



    }
}