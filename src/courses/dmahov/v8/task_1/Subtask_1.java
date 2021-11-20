package courses.dmahov.v8.task_1;

public class Subtask_1 {
    public static void num8_1(String[] args) {
        // 3 в 4 степени
        double c1 = 3;
        double c2 = 4;
        double out1 = Math.pow(c1, c2);
        // 3 во 2 степени
        double a1 = 3;
        double a2 = 2;
        double out2 = Math.pow(a1, a2);
        // корень из out1 and out2
        double ac1 = out1 + out2;
        double out3 = Math.sqrt(ac1);
        // Тангенс x
        double x1 = 360.0;
        double x2 = Math.toRadians(x1);
        double out4 = Math.tan(x2);
        // out4 * a
        double out5 = out4 * a1;
        // out3 + out5
        double out6 = out3 + out5;
        // lg из x
        double out7 = Math.log(x1);
        // e в степени c
        double e1 = 4;
        double out8 = Math.pow(e1, c1);
        // lgx + e в степени c
        double out9 = out7 + out8;
        //Модуль из out9
        double out10 = Math.abs(out9);
        // Деление out6 на out9
        double out11 = out6 / out9;
        System.out.print("Ответ:");
        System.out.println(out11);
    }

    public static void num8_2(String[] args) {
        // sin x
        double x1 = 360.0;
        double x2 = Math.toRadians(x1);
        double out1 = Math.sin(x2);
        // 3 в 3 степени
        double c1 = 3;
        double c2 = 3;
        double out2 = Math.pow(c1, c2);
        // 5 в 3 степени
        double a1 = 5;
        double a2 = 3;
        double out3 = Math.pow(a1, a2);
        // (a^3 - c^3)
        double out4 = out3 - out2;
        // sinx + c^3
        double out5 = out1 + out2;
        //(a - 4)
        double out6 = a1 - 4;
        //out4*out6
        double out7 = out4 * out6;
        //out 5 / out7
        double out8 = out5/out7;
        System.out.print("Ответ:");
        System.out.println(out8);
    }
}
