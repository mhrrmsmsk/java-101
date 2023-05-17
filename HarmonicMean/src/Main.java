public class Main {
    public static void main(String[] args) {
      int[] arr={1,2,3,4,5,6,7,8,200,300};
      double denominator = 0;
      for (int i=0;i<arr.length;i++){
          denominator+=(1.0/arr[i]);
      }

double harmonic=(arr.length)/(denominator);
       System.out.println(harmonic);
    }
}