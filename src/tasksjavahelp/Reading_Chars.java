package tasksjavahelp;
//Напишите программу, которая считывает символы пока не встретится точка
// Также предусмотрите вывод количества пробелов.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class Reading_Chars {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        char b = '=';
        while (b != '.') {
            b = reader.readLine().charAt(0);
            if (b == ' '){
                count++;
            }

        }
        System.out.println(count);

    }

}
