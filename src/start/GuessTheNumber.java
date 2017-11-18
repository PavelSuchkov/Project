package start;


import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {


    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Нужно загадать число от 0 до ...");
        int size = scan.nextInt();
        int x = new Random().nextInt(size);

        int i = 0;

        System.out.println("Угадай число");
        while (i < 10) {
        int answer = scan.nextInt();
       if (answer < x){
           System.out.println("Моё число больше");
       }
       if (answer > x){
           System.out.println("Моё число меньше");
       }
       else  if (answer == x){
           System.out.println("Ебать ты гений! Моё число " + x + " Ты угадал моё число за " + (i + 1) + " поаыток!");
           return;
       }
       i++;
       }
    }
}