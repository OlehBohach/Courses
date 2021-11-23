package courses.dmahov.v8.task2;

import java.util.Scanner;

public class Subtask2 {
    public static void num8(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите время в часах");
        double time1 = in.nextDouble();
        if (time1 >= 0 && time1 <= 3) {
            System.out.println("Доброй ночи!");
        }
        if (time1 >= 18 && time1 <= 23) {
            System.out.println("Добрый вечер!");
        }
        if (time1 >= 12 && time1 <= 17) {
            System.out.println("Добрый день!");
        }
        if (time1 >= 4 && time1 <= 11) {
            System.out.println("Доброе утро!");
        }
    }

    public static void num10(String[] args) {

    }
}
