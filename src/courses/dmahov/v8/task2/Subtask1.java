package courses.dmahov.v8.task2;

import java.util.Scanner;

public class Subtask1 {
    public static void num8(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число К: ");
        double k1 = in.nextDouble();
        System.out.print("Введите число L: ");
        double l1 = in.nextDouble();
        System.out.print("Введите число M: ");
        double m1 = in.nextDouble();
        int out1 = 0;
        int out2 = 0;
        if ( k1 % 2 == 0 ) {
            out2 = out1 + 1;
        }
        if (l1 % 2 == 0) {
            out2 = out1 + 1;
        }
        if (m1 % 2 == 0) {
            out2 = out1 + 1;
        }
        System.out.println(out2);

    }
}
