package tasksjavahelp;
// Напишите метод, который будет увеличивать заданный элемент массива на 10%
import java.util.Scanner;

public class TenPercents {





    public static void main(String[] args) {
        TenPercents ten = new TenPercents();


        double array [] = {3, 7, 12, 65, 25, 14, 24, 56, 45, 67, 76};
        Scanner scan = new Scanner(System.in);
        int x = 0;
        if ( x >= 0 && x <=array.length ){
            x = scan.nextInt();
        }
        array[x] = ten.increase(array, x);
        System.out.println(array[x]);

    }

     private  double increase(double [] x, int a) {

         x[a] = (x[a] * 0.1) + x[a];
         return x[a];
     }
}
