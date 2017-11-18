package tasksjavahelp;
//Разработайте программу, которая будет выводить таблицу умножения введенного пользователем числа с клавиатуры.
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int a =  number.nextInt();
        multiplication(a);
    }
   static void multiplication(int a){
        for(int i = 1; i < 11 ; i++ ){
           int b = a * i;
            System.out.println(b);
        }

    }

}
