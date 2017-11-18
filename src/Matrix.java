import java.util.ArrayList;

public class Matrix {
    String[] array = new String[3];


    public static void main(String args[]) {
        Matrix mat = new Matrix();
        mat.array[0] = "mama";
        mat.array[1] = "myla";
        mat.array[2] = "mramu";

        for (int i = 0; i < mat.array.length; i++) {
            System.out.print(mat.array[i] + " ");
        }


    }
}
