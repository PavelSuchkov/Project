package tasksjavahelp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Напишите рекурсивный метод отображающий строку задом на перед.
public class Recurse {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        char[] a = text.toCharArray();

        recurse(a);
    }

    private static void recurse(char[] a) {
        for (int i = a.length; i > 0; i--) {
            System.out.print(a[i - 1] + " ");

        }

    }
}