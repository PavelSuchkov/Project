package tasksjavahelp;

import java.util.Scanner;

public class SalaryCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salaryInHour = scanner.nextInt();
        double hoursCounter = scanner.nextInt();
        salary(salaryInHour, hoursCounter);
    }
    protected static double salary(double a, double b){
        if (b > 40){
            b = b * 1.5;
        }
        if (b > 60){
            System.out.println("Нельзя стока въёбывать!");
        }
        if ( a < 8){
            System.out.println("Сами ебашьте за такую з/п");
        }
         double c = a * b;
        return c;
    }


}
