package start;
//1. При помощи цикла for вывести на экран нечетные числа от 1 до 99.
public class OneHundredArray {
    public static void main (String args[]){
//       int m ;
//       for ( int i = 0; i < 100 ; i++){
//           if (i % 2 ==1){
//               m = i;
//               System.out.println(m);
//           }
//       }

        int m;
        int i = 0;
        while ( i < 100){
           if (i % 2 == 1){
               m = i;
               System.out.println(m);
           }
           i++;
        }
    }
}
