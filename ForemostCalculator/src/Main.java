import java.util.Scanner;

public class Main {
    static void sum(){
        Scanner scanner = new Scanner(System.in);
        int num1,num2;
        System.out.print("İlk sayıyı giriniz :");
        num1=scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz :");
        num2 = scanner.nextInt();
        int result =num1+num2;
        System.out.println("********************");
        System.out.println("Sonuç :"+result);
    }
    static void minus(){
        Scanner scanner = new Scanner(System.in);
        int num1,num2;
        System.out.print("İlk sayıyı giriniz :");
        num1=scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz :");
        num2 = scanner.nextInt();
        int result =num1-num2;
        System.out.println("********************");
        System.out.println("Sonuç :"+result);
    }
    static void multi(){
        Scanner scanner = new Scanner(System.in);
        int num1,num2;
        System.out.print("İlk sayıyı giriniz :");
        num1=scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz :");
        num2 = scanner.nextInt();
        int result =num1*num2;
        System.out.println("********************");
        System.out.println("Sonuç :"+result);
    }
    static void divide(){
        Scanner scanner = new Scanner(System.in);
        int num1,num2;
        System.out.print("İlk sayıyı giriniz :");
        num1=scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz :");
        num2 = scanner.nextInt();
        if (num2==0){
            System.out.println("Geçersiz sayı!");
             divide();
             return;

        }
        int result =num1/num2;
        System.out.println("********************");
        System.out.println("Sonuç :"+result);
    }
    static void expo(){
        Scanner scanner = new Scanner(System.in);
        int num1,num2;
        int result=1;
        System.out.print("Üs  alınacak sayı :");
        num1=scanner.nextInt();
        System.out.print("Sayının üs'ü :");
        num2 = scanner.nextInt();
      for (int i=1;i<=num2;i++){
          result*=num1;
      }
        System.out.println("********************");
        System.out.println("Sonuç :"+result);
    }
    static void mod(){
        Scanner scanner = new Scanner(System.in);
        int num1,num2;
        System.out.print("Mod alınacak sayı :");
        num1=scanner.nextInt();
        System.out.print("Mod :");
        num2 = scanner.nextInt();
        if (num2==0){
            System.out.println("Geçersiz sayı!");
            divide();
            return;

        }
        int result =num1%num2;
        System.out.println("********************");
        System.out.println("Sonuç :"+result);
    }
    static void box(){
        Scanner scanner = new Scanner(System.in);
        int num1,num2;
        System.out.print("Uzun kenar :");
        num1=scanner.nextInt();
        System.out.print("Kısa kenar :");
        num2 = scanner.nextInt();
        int area=num1*num2;
        int around=2*(num1+num2);
        System.out.println("Çevre:"+around+"\nAlan :"+area);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select;
        String menu ="1-Toplama işlemi\n"
                +"2- Çıkarma işlemi\n"
                +"3- Çarpma işlemi\n"
                +"4- Bölme işlemi\n"
                +"5- Üslü sayı hesaplama\n"
                +"6- Mod alma\n"
                +"7- Dikdörtgen alan ve çevre hesabı\n"
                +"0- Çıkış yap";
        while (true){
            System.out.println("********************");
            System.out.println(menu);
            System.out.println("********************");
            System.out.print("Bir işlem seçiniz :");
            select=scanner.nextInt();
            if (select==0)
                break;
            switch (select){
                case 1:
                    sum();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    multi();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    expo();
                    break;
                case 6:
                    mod();
                    break;
                case 7:
                    box();
                    break;
                default:
                    System.out.println("********************");
                    System.out.println("Geçerli bir işlem seçiniz!");
            }

        }


    }
}