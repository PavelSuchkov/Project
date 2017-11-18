package tasksjavahelp;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int number = read.nextInt();
        isPalindrom(number);
        String m = new Palindrom().toString();



    }

    public static boolean isPalindrom(int number) {
        String original = Integer.toString(number);
        int i = original.length() - 1;
        int j = 0;

        while (i > j) {
            if (original.charAt(i) != original.charAt(j)) {
                System.out.println("Not palindrom");
                return false;

            }
            i--;
            j++;
        }
        System.out.println("Is palindrom");
        return true;

    }


    @Override
    public String toString() {
        return "";
    }
}
