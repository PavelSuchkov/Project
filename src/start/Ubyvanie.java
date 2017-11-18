package start;
import java.io.*;
import java.util.Arrays;


public class Ubyvanie {
    public static void faner(int kol) throws IOException {
        int[] pri = new int[kol];
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        for (int i = 0; i < kol; i++) {
            System.out.println("Введите " + (i + 1) + "-е число");
            String sNum = br.readLine();
            pri[i] = Integer.parseInt(sNum);
        }
        Arrays.sort(pri);
        System.out.println(Arrays.toString(pri));
    }
    public static void main(String[] args) throws IOException {
        faner(3);
    }
}
