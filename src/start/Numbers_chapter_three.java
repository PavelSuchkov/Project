package start;
import java.util.Scanner;

public class Numbers_chapter_three {
    public static void main (String args []){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int sum;
        if ((a > c) && (b > c ) ){
            sum = a + b;
            System.out.println(sum );
        }
        if ((b > a) &&(c > a )){
            sum = b + c;
            System.out.println(sum );
        }
        if ((c > b) && (a > b)){
            sum = c + a;
            System.out.println(sum );

        }
    }

}
