package tasksjavahelp;
//Сила тяжести на Луне примерно равна 17%, напишите программу, которая вычисляет ваш вес на Луне.
import java.util.Scanner;

public class ForceOfGravity {
    public static void main(String[] args) {
        Scanner earthWeight = new Scanner(System.in);
        int weight = earthWeight.nextInt();
        double gForEarth = 9.8;
        double gForMoon;
        System.out.println(weight * (gForEarth * 17 / 100));


    }
}
