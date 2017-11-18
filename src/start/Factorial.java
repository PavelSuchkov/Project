package start;
import java.util.Scanner;
public class Factorial {

    public  static void main (String args[]){

        Scanner scan = new Scanner(System.in);

     int n = scan.nextInt();
     int factorial =0;
     int m = 1;

     for (int i = 1; i <= n ; i++  ){
         m = ( m * i);



     }
        factorial = m;
        System.out.println(factorial);
    }
}
