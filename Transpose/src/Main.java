import java.util.Scanner;

public class Main {
    static void transpose(int[][] matrix,int row,int colmn){
        for (int i=0;i<colmn;i++){
            for (int j=0;j<row;j++){
                System.out.print("["+matrix[j][i]+"]");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the row:");
        int row=scan.nextInt();
        System.out.print("Enter the colmn:");
        int colmn=scan.nextInt();
        System.out.println("***********");
        int value;
        int[][] matrix=new int[row][colmn];

        for(int i = 0;i<row;i++){
            for (int j=0;j<colmn;j++){
                System.out.print("matrix["+i+"]["+j+"]:");
                value=scan.nextInt();
                matrix[i][j]=value;
            }
        }

        System.out.println("***********");
        System.out.println("A:");
        for(int i = 0;i<row;i++){
            for (int j=0;j<colmn;j++)
            {
                System.out.print("["+matrix[i][j]+"]");
            }
            System.out.println();
        }
        System.out.println("***********");
        System.out.println("A^T:");
        transpose(matrix,row,colmn);
    }
}