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
        boolean k2 = false;
        boolean l2 = false;
        boolean m2 = false;
        double out3 = 0;
        if ( k1 % 2 == 0 ) {
            out2 = out1 + 1;
            if (k1 >= 0) {
                k2 = true;
            }
        }
        if (l1 % 2 == 0) {
            out2 = out1 + 1;
            if (l1 >= 0) {
                l2 = true;
            }
        }
        if (m1 % 2 == 0) {
            out2 = out1 + 1;
            if (m1 >= 0) {
                m2 = true;
            }
        }
        int out4 = 0;
        if (k2 == true) {
            out3 = out3 + k1;
            out4 = out4+1;
        }
        if (l2 == true) {
            out3 = out3 + l1;
            out4 = out4+1;
        }
        if (m2 == true) {
            out3 = out3 + m1;
            out4 = out4+1;
        }
        double out5 = out3 / out4;
        System.out.print("Количество чётных чисел: ");
        System.out.println(out2);

        System.out.print("Среднеарифметическое положительных чисел: ");
        System.out.println(out5);
    }

    public static void num10(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите x координату точки m1: ");
        double mx1 = in.nextDouble();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите y координату точки m1: ");
        double my1 = in.nextDouble();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите x координату точки m2: ");
        double mx2 = in.nextDouble();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите y координату точки m2: ");
        double my2 = in.nextDouble();
        double m1 = mx1*mx1+my1*my1;
        double m2 = mx2*mx2+my2*my2;
        double m12 = Math.sqrt(m1);
        double m22 = Math.sqrt(m2);
        if (m12<m22){
            System.out.println("Точка M1 ближе к нулю");
        } else if (m12>m22){
            System.out.println("Точка M2 ближе к нулю");
        } else {
            System.out.println("Точки M1 и M2 одинаково близки к нулю");
        }
    }

}