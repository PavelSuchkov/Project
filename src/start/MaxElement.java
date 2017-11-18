package start;

public class MaxElement {
    public static void main(String[] args) {
       int array [] = {3, 7, 12, 65, 25, 14, 24, 56, 45, 67, 76};
       for (int i = 0; i < array.length; ){
           if( array[i] == 14){
               System.out.println(array[i]);
               System.out.println(i);
           }
           i++;
       }
    }
}
