public class Voenkomat {
    static int age = 100;

    public static void main(String[] args) {

        if (age >= 18 && age <= 27) {
            System.out.println("Пора пиздовать родину защищать!!! ");
        }

        if (age >= 28 && age <= 59) {
            System.out.println("Можно взять лошару окопы копать за миималку");
        }

        if ((age < 18 && age >= 0)|| (age > 59 && age <= 100)) {
            System.out.println("Руки прочт от пиздюка!!! ");
        }

        if (age < 0 || age > 100) {
            System.out.println("Ну и что захуйню ты тут навводил?");
        }
    }

}

