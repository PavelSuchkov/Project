package start;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stroki {
    public static void main(String[] args) throws IOException {
        String abc = "абвгдеёжзиклмнопрстуфцчшщъыьэюя 1234567890.,!?;-:";
        
        char alphabet[] = abc.toCharArray();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char data[] = reader.readLine().toCharArray();

        for (int i = 0; i < alphabet.length; i++ ){
            int count= 0;
            for (int j = 0; j < data.length; j++){
                if (alphabet[i] == data[j]){

                    count ++;
                }

            }
            String m = String.valueOf(alphabet[i]);
            System.out.println(m + " -  " + count);

        }

    }
}
