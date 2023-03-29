import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n1,n2;
        System.out.print("N1 :");
        n1=input.nextInt();
        System.out.print("N2 :");
        n2 = input.nextInt();

        int ebob=1;
        if (n1>n2){
            int i=n2;
            while (i<=n2){
                if (n2%i==0 && n1%i==0){
                    ebob=i;
                    System.out.println("Ebob :"+ebob);
                    break;
                }
                i--;
            }
        }else {
            int i=n1;
            while (i<=n1){
                if (n2%i==0 && n1%i==0){
                    ebob=i;
                    System.out.println("Ebob :"+ebob);
                    break;
                }
                i--;
            }
        }
        System.out.println("Ekok:"+((n1*n2)/ebob));

        // Ekok 
/*
        int k=1;
        while (k<=(n1*n2)){
            if (k%n1==0 && k%n2==0){
                System.out.println("Ekok :"+k);
                break;
            }
            k++;
        }*/
    }
}