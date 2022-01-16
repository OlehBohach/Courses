package courses.atulinov.lab4;

import java.util.Scanner;

public class ex {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] X = new int[20];
        int[] Y = new int[5];
        int ycounter = 0;
        System.out.println("Введите значение элемента: ");
        int[] var5 = X;
        int var6 = X.length;

        int var7;
        int d;
        for(var7 = 0; var7 < var6; ++var7) {
            int var10000 = var5[var7];
            d = scn.nextInt();
            if (ycounter <= 4 && d % 2 == 0) {
                Y[ycounter] = d;
                ++ycounter;
            }
        }

        var5 = Y;
        var6 = Y.length;

        for(var7 = 0; var7 < var6; ++var7) {
            d = var5[var7];
            System.out.println(d);
        }

    }
}
