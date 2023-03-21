import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int day , month ;
        Scanner input = new Scanner(System.in);

        System.out.print("Birth Month:");
        month = input.nextInt();

        System.out.print("Birth Day:");
        day = input.nextInt();

       if (month<=12 && month>0 && day>0 && day<=31){
           boolean jan1 = ((month==1 && day<22) || (month==12 && day>21) );
           if (jan1){
               System.out.println("Oğlak Burcu");
           }
        
           boolean fab1 = ((month==2 && day<20) || (month==1 && day>21) );
           if (fab1){
               System.out.println("Kova Burcu");
           }

           boolean march1 = ((month==3 && day<21) || (month==2 && day>19) );
           if (march1){
               System.out.println("Balık Burcu");
           }

           boolean apr1 = ((month==4 && day<21) || (month==3 && day>20) );
           if (apr1){
               System.out.println("Koç Burcu");
           }

           boolean may1 = ((month==5 && day<22) || (month==4 && day>20) );
           if (may1){
               System.out.println("Boğa Burcu");
           }

           boolean june1 = ((month==6 && day<23) || (month==5 && day>21) );
           if (june1){
               System.out.println("İkizler Burcu ");
           }


           boolean july1 = ((month==7 && day<22) || (month==6 && day>22) );
           if (july1){
               System.out.println("Yengeç Burcu");
           }


           boolean agst1 = ((month==8 && day<23) || (month==7 && day>21) );
           if (agst1){
               System.out.println("Aslan Burcu");
           }


           boolean sep1 = ((month==9 && day<23) || (month==8 && day>22) );
           if (sep1){
               System.out.println("Başak burcu");
           }

           boolean dec1 = ((month==10 && day<23) || (month==9 && day>22) );
           if (dec1){
               System.out.println("Terazi Burcu");
           }


           boolean octb1 = ((month==11 && day<22) || (month==10 && day>22) );
           if (octb1){
               System.out.println("Akrep Burcu");
           }


           boolean novb1 = ((month==12 && day<22) || (month==11 && day>21) );
           if (novb1){
               System.out.println("Yay Burcu");
           }


       }else System.out.println("Invalid value !");
    }
}