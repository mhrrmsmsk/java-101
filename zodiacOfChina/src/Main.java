import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
int birthYear;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz:");
        birthYear = scanner.nextInt();
int rate = birthYear%12;
        if (rate==0){
            System.out.println("Çin Zodyağı Burcunuz : Maymun");
        } else if (rate == 1) {
            System.out.println("Çin Zodyağı Burcunuz : Horoz");
        } else if (rate == 2) {
            System.out.println("Çin Zodyağı Burcunuz : Köpek");
        }else if (rate == 3) {
            System.out.println("Çin Zodyağı Burcunuz : Domuz");
        }else if (rate == 4) {
            System.out.println("Çin Zodyağı Burcunuz : Fare");
        }else if (rate == 5) {
            System.out.println("Çin Zodyağı Burcunuz : Öküz");
        }else if (rate == 6) {
            System.out.println("Çin Zodyağı Burcunuz : Kaplan");
        }else if (rate == 7) {
            System.out.println("Çin Zodyağı Burcunuz : Tavşan");
        }else if (rate == 8) {
            System.out.println("Çin Zodyağı Burcunuz : Ejderha");
        }else if (rate == 9) {
            System.out.println("Çin Zodyağı Burcunuz : Yılan");
        }else if (rate == 10) {
            System.out.println("Çin Zodyağı Burcunuz : At");
        }else if (rate == 11) {
            System.out.println("Çin Zodyağı Burcunuz : Koyun");
        }

    }
}