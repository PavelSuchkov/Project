package tasksjavahelp;

public class Stack {
    static int stck[] = new int[10];
    static int tos = -1;


    public static void main(String[] args) {
        for (int i = 0; i < stck.length; i++) {

            push(i);
            System.out.println(stck[i]);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(pop(i));


        }


    }


    // Заталкивание элемента в стек
    static void push(int item) {
        if (tos == 9) System.out.println("Стек полон.");
        else stck[++tos] = item;
    }

    // Выталкивание элемента из стека
    static int pop(int i) {
        if (tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        } else return stck[tos--];
    }
}
