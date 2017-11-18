package tasksjavahelp;

import java.util.Scanner;

public class CheckIntegrality {
    public static void main(String[] args) {
        CheckIntegrality check = new CheckIntegrality();
        Scanner scan = new Scanner(System.in);
         double a = scan.nextDouble();
         int b = (int)a;
         if ( a / b ==  1){
             System.out.println("number is integer");

         }
         else System.out.println("fractional number");

    }
}
