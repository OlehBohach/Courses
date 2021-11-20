package courses.dmahov.v8.task1;

import java.util.Scanner;

public class Subtask2 {
    public static void num8(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение первого катета: ");
        double k1 = in.nextDouble();
        System.out.print("Введите значение второго катета: ");
        double k2 = in.nextDouble();
        double c1 = 2;
        double out1 = Math.pow(k1, c1);
        double c2 = 2;
        double out2 = Math.pow(k2, c2);
        double out3 = out1 + out2;
        double out4 = Math.sqrt(out3);
        String s = String.valueOf(out4);
        System.out.println("Длинна гипотенузы: "+ s);
        double out5 = k1 * k2;
        double out6 = out5/2;
        String s2 = String.valueOf(out6);
        System.out.println("Площадь треугольника: "+ s2);
    }

    public static void num15(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите высоту треугольника в миллиметрах: ");
        double k1 = in.nextDouble();
        System.out.print("Введите площадь треугольника в сантиметрах: ");
        double k2 = in.nextDouble();
        double sm = k1 / 10;
        double out1 = 0.5 * sm;
        double out2 = k2 / out1;
        double out3 = out2 / 2;
        double out4 = out3 * out3;
        double out5 = sm*sm;
        double out6 = out4+out5;
        double out7 = Math.sqrt(out6);
        String s = String.valueOf(out7);
        System.out.println("стороны a и с = "+ s);
        double out8 = out7 + out7 + out2;
        String s2 = String.valueOf(out8);
        System.out.println("Периметр треугольника: "+ s2);
    }

    public static void num17(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите периметр правильноо треугольника: ");
        double k1 = in.nextDouble();
        double out1 = k1 / 3;
        String s = String.valueOf(out1);
        System.out.println("a,b,c = "+ s);
        double out2 = Math.sqrt(3)/4*Math.pow(out1, 2);
        String s2 = String.valueOf(out2);
        System.out.println("Периметр треугольника: "+ s2);
    }
}
