import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random=new Random();
        int number =random.nextInt(100);
        int right=0;
        int selected;
int[] wrong=new int[5];
boolean isWin=false;
boolean error=false;

        while (right<5){
            System.out.print("Enter the number:");
            selected=scanner.nextInt();
            if (selected<0 || selected>99){
                System.out.println("You entered wrong number please enter the number in the exact bound");
                if (error){
                    right++;
                    System.out.println("remaining right:"+(5-right));
                }
                if (!error){
                    error=true;
                    System.out.println("if you enter out of bound number again you will lost  right!");
                }

                continue;
            }
            if (selected==number){
                System.out.println("congratulations! you are winner");
                isWin=true;
                break;
            }else {
               if (selected<number){
                   System.out.println(selected+" is less than the secret number ! try again!");
               }else {
                   System.out.println(selected+" is greater than the secret number ! try again!");
               }
                wrong[right]=selected;
                right++;
                System.out.println("remaining right:"+(5-right));
            }
        }

        System.out.println();

        if (!isWin){
            System.out.println("Game Over You Lost");
            if (!error){
                System.out.println("Wrong Answers : "+Arrays.toString(wrong));
            }


        }

    }
}