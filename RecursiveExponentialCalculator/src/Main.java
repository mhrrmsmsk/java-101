import java.util.Scanner;

public class Main {
    static int expo(int a,int b){
int result=1;
result*=a;
        if (b==0){
            return 1;
        }

        return result*expo(a,b-1);
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        boolean cont =true;

        while (cont){
            System.out.print("Enter the base number :");
            int baseNum=scanner.nextInt();

            System.out.print("Enter the exponential number :");
            int expoNum=scanner.nextInt();

            System.out.println("Sonuç :"+expo(baseNum,expoNum));

            System.out.print("Do you want to exit(0 = continue , 1= Exit) : ");
            int chose=scanner.nextInt();
            if (chose==1){
                cont=false;
            }

        }


        System.out.println(expo(2,5));
    }
}