package tasksjavahelp;
//Напишите программу, которая вычислит простые числа в пределах от 2 до 100.
//(Опционально) Дополните программу так, чтобы она вычисляла составные числа.
public class SimpleNumbers {
    public static void main(String[] args) {
        boolean isprime;
        for ( int i = 2; i < 100; i++){
            if ((i % 2) == 0 ){
                System.out.println(i + " Not Simple");
            }
        }
    }

}
