package tasksjavahelp;
//Найдите среднее арифметическое массива из 10 элементов типа double.
public class ArithmeticMean {
    public static void main(String[] args) {
      double [] numbers = {10.2, 12.5, 14.7, 34.5, 23.7, 67.8, 76.8, 82.3, 92.1, 100.2};
      double average = 0;
      if (numbers.length > 0){
          double sum = 0;
          for (int i = 0; i < numbers.length; i++){
              sum = sum + numbers[i];
          }
          average = sum / numbers.length;
      }
        System.out.println(average);
    }
}
