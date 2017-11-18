package start;

public class Numbers_chapter_two {
    public static void main (String args []){
     int four_numbers [] ={4, 6, 4, 4 };

     for( int i = 0; i < four_numbers.length; i++  ) {
         switch (i) {
             case (0):
                 if ((four_numbers[0] != four_numbers[1]) && (four_numbers[1]) == four_numbers[2]) {
                     System.out.println("1");
                     break;
                 }
             case (1):
                 if ((four_numbers[1]) != four_numbers[2] && (four_numbers[2] == four_numbers[3])){
                     System.out.println("2");
                     break;
                 }
             case (2):
                 if ((four_numbers[2] != four_numbers[1]) && (four_numbers[2] != four_numbers[3])){
                     System.out.println("3");
                     break;
                 }
             case (3):
                 if ((four_numbers[3] != four_numbers[2]) && (four_numbers[2] == four_numbers[1]) ){
                     System.out.println("4");
                     break;
                 }

         }
     }

    }

}
