package tasksjavahelp;
//Напишите программу, которая будет просить ввести ваше имя, а потом выведет его на консоль
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Name {
    public static void main(String[] args) throws IOException {
        System.out.println("Wats ur name bro");
        BufferedReader name = new BufferedReader(new InputStreamReader(System.in));
        String imyaBlyat = name.readLine();
        System.out.println( "ur name is  " + imyaBlyat + ". Congratulation, fcking genius!!");
    }
}
