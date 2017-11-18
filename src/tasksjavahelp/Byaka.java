package tasksjavahelp;
//4. Напишите метод, заменяющий в строке все вхождения слова «бяка» на «вырезано цензурой».
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Byaka {

    public static void main(String[] args) throws IOException {
        Byaka byaka = new Byaka();
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String a = buf.readLine();
        a = byaka.censure(a);
        System.out.println(a);

    }
    protected String censure(String b){
        b = b.replaceAll("бяка", "/Вырезано цензурой/");
        return b;
    }
}
