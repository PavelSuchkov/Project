package tasksjavahelp;
// Найдите победителя марафона.
//Группа людей участвует в марафоне, их имена и время за которое они пробежали марафон вы можете увидеть ниже.
//        Ваша задача найти человека, который быстрее всех пробежал дистанцию и вывести его имя и счет.
//        (Опционально) Найдите человека, который прибежал вторым.

public class Winner {
    public static void main(String[] args) {
        String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
        int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265};
        int min = 0;
        int index = 0;
        int i2 = 0;

        for (int i = 0; i < times.length; i++) {
            min = times[0];
            if (min > times[i]) {
                min = times[i];
                index = i;

            }

        }

        System.out.println(names[index]);

    }
}
