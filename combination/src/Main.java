import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Definition: N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır.\n N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.");
        System.out.println("-------------");
        int n, r;
int nTotal=1,rTotal=1,nrTotal=1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("n sayısıını girin :");
        n = scanner.nextInt();

        System.out.print("r sayısını girin :");
        r = scanner.nextInt();

        for (int i =1;i<=n;i++){
            nTotal*=i;
        }


        for (int j =1;j<=r;j++){
            rTotal*=j;
        }


        for (int k=1;k<=(n-r);k++){
            nrTotal*=k;
        }


        int formula= nTotal / (rTotal * nrTotal);

        System.out.println("C(n,r) ="+formula);


    }
}