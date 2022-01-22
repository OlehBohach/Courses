package courses.dmahov.v8.task2;
import java.util.Scanner;

public class Subtask2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Какое задание вы хотите запустить?");
        System.out.println("1. 8");
        System.out.println("2. 10");
        System.out.print("Введите число: ");
        double vv = in.nextDouble();
        if (vv == 1) {
            num8();
        }
        else if (vv == 2) {
            num10();
        }
    }
    public static void num8() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите время в часах: ");
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
        else {
            System.out.println("Вы ввели неверное время!");
        }
    }

    public static void num10() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество экзаменов которое вы сдали: ");
        double ekz1 = in.nextDouble();
        String str1 = " экзаменов";
        String str2 = " экзамена";
        String str3 = " экзамен";
        String out1 = "";
        int ekz2 = (int)ekz1;
        ekz1 = Math.abs(ekz1) % 10;
        if (ekz1 == 0) {
            out1 = str1;
        }
        if (ekz1 >= 5 && ekz1 <= 9) {
            out1 = str1;
        }
        if (ekz1 == 1) {
            out1 = str3;
        }
        if (ekz1 >= 2 && ekz1 <= 4) {
            out1 = str2;
        }
        System.out.print("Мы здали ");
        System.out.print(ekz2);
        System.out.println(out1);
    }
}
