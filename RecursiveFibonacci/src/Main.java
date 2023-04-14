import java.util.Scanner;

public class Main {
    static int fibonacci(int number){
      if (number==1)
          return 1;
      if(number==2)
          return 1;

      return fibonacci(number-1)+fibonacci(number-2);
    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the number of term :");
        int num=input.nextInt();
      for (int i=1;i<=num;i++){
          System.out.println(fibonacci(i));
      }

    }
}