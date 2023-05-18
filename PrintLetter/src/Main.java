public class Main {
    public static void main(String[] args) {
      String[][] matrix=new String[6][4];
      // 0,3 colmn
        // 0,3,6 row
      for (int i =0;i<matrix.length;i++){
          for (int j=0;j<matrix[i].length;j++){
              if (i==0 || i==2 || i==5){
                  matrix[i][j]=" * ";
              } else if (j==0 || j==3){
                  matrix[i][j]=" * ";
              }else {
                  matrix[i][j]="   ";
              }
          }
      }
      for (String[] row :  matrix){
          for (String col: row ){
              System.out.print(col);
          }
          System.out.println();
      }
        System.out.println();
        String[][] letter = new String[6][4];

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if (i == 0 || i == 2) {
                    letter[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    letter[i][j] = " * ";
                } else {
                    letter[i][j] = "   ";
                }
            }
        }

        for (String[] row : letter){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if ( i == 5) {
                    letter[i][j] = " * ";
                } else if (j == 0 ) {
                    letter[i][j] = " * ";
                } else {
                    letter[i][j] = "   ";
                }
            }
        }

        for (String[] row : letter){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }





    }

}