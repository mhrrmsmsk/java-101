import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username,password;
        double balance=1500;
        int right=3,choice;
        double amountP,amountM;
        Scanner scanner = new Scanner(System.in);
        System.out.println("HOŞGELDİNİZ...");
      while (right!=0){
            System.out.print("Kullanıcı Adı :");
            username = scanner.nextLine();
            System.out.print("Şifre :");
            password = scanner.nextLine();
            if (username.equals("patika") && password.equals("div123")){
                System.out.println("Merhaba , X banka Hoşgeldiniz...");
                do {
                    System.out.println("------------");
                    System.out.println("1:Para çekme\n"+"2:Para yatırma\n"+"3:Bakiye sorgulama\n"+"4:Çıkış yap");
                    System.out.println("------------");
                    System.out.print("Yapmak istediğiniz işelmi seçiniz :");
                    choice=scanner.nextInt();
                    System.out.println("------------");
                    switch (choice){
                        case 1:
                            System.out.print("Çekmek istediğiniz mikterı giriniz:");
                            amountM=scanner.nextDouble();
                            if (amountM>balance){
                                System.out.println("yetersiz bakiye !");
                            }else {
                                balance-=amountM;
                                System.out.println("Bakiye:"+balance);
                            }
                            break;
                        case 2:
                            System.out.print("Yatırmak istediğiniz miktarı giriniz :");
                            amountP=scanner.nextDouble();
                            balance+=amountP;
                            System.out.println("Bakiye:"+balance);
                            break;
                        case 3:
                            System.out.println("Bakiye:"+balance);
                            break;
                        case 4:
                            System.out.println("Çıkış yapılıyor...");
                            break;

                    }
                }while (choice!=4);
right=0;



            }else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }


    }
}