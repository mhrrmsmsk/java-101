import java.util.Arrays;

public class Main {
    //farklı sayıları seçen metod
    static boolean isFind(int[] arr,int value){
        for (int i:arr){
            if (value==i){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int[] list ={1,2,2,3,56,66,66,45,34,56,12,1};
        // yeni oluşan dizi
        int[] duplicate=new int[list.length];
        // başlangıç indexi
        int index=0;
        //tekrar eden çift sayıları bulma
        for (int i=0;i<list.length;i++){
            for (int j=0;j< list.length;j++){
                if (!isFind(duplicate,list[i])){
                    if ((i != j) && (list[i])==(list[j])){
                        if (list[i]%2==0){
                            duplicate[index++]=list[i];
                        }

                        break;
                    }
                }

            }
        }
        // yeni diziyi ekrana yazdırma
        System.out.print("Tekrar eden çift sayılar : ");
      for (int i :duplicate){
          if (i!=0){
              System.out.print(i+" ");
          }
      }


    }
}