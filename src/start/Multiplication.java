package start;
import java.util.Scanner;

public class Multiplication {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Первое число?");
        int a =  scanner.nextInt();
        System.out.println("Второе число?");
        int b = scanner.nextInt();
        System.out.println("А ну-ка пиздани, скок будет первое умножить на второе?");
        int c = scanner.nextInt();

        int corrAnsw = a * b;
        if (corrAnsw == c ){
            System.out.println("Правильно блять, невхерский ты гений!!! " + corrAnsw);
        }
        else {
            System.out.println("Пиздуй учить таблицу умножения!!! Правильный ответ " + corrAnsw);
        }


    }
}
