import java.util.Scanner;

public class Main {
    static int find(int num){
        for (int i=2;i<=num;i++){
            if (num%i==0){
                System.out.println("false");

                return 1;
            }else System.out.println("true");
            return 1;
        }
        
        if (num==1){
            System.out.println("false");
            return 1;
        }
        return find(num-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         {
            boolean isTrue=true;
            while (isTrue){
                System.out.print("Enter the number :");
                int a =scanner.nextInt();
                if (a<0){
                    System.out.println("Please enter the valid number!");

                }else find(a);
                System.out.print("Do you continue to check number(1:yes , 0:no ):");
                int cont=scanner.nextInt();
                if (cont==0){
                    isTrue=false;
                }

            }

        }

    }

}