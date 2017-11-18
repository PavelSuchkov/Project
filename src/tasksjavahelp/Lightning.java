package tasksjavahelp;
//Расчет расстояния до места удара молнии. Звук в воздухе распространяется со скоростью приблизительно равной 1100 футам в секунду.
// Зная интервал времени между вспышкой молнии и звуком сопровождающим ее можно рассчитать расстояние. Допустим интервал 7,2 секунды.

import java.util.Scanner;

public class Lightning {
    double speed = 1100;

    public static void main(String[] args) {
        Lightning light = new Lightning();
        Scanner scan = new Scanner(System.in);

        double interval = scan.nextDouble();



        double distance = 0;
        distance = light.count(interval);
        System.out.println(distance);


    }
    protected double count(double a){
       a = speed * a;
        return a;
    }
}
