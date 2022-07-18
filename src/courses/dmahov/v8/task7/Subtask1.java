package courses.dmahov.v8.task7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Subtask1 {
    public static void main(String[] args) {
        //Многочлен 1
        Scanner in = new Scanner(System.in);
        System.out.print("Введите степень на которую будут умножены многочлены: ");
        int step = in.nextInt();
        ArrayList<Integer> mn1k1 = new ArrayList<Integer>();
        ArrayList<Integer> mn1k2 = new ArrayList<Integer>();
        ArrayList<Integer> mn1k3 = new ArrayList<Integer>();
        System.out.print("1 многочлен - Введите первый коэфицент многочлена: ");
        int k = in.nextInt();
        mn1k1.add(k);
        System.out.print("1 многочлен - Введите второй коэфицент многочлена: ");
        k = in.nextInt();
        mn1k2.add(k);
        System.out.print("1 многочлен - Введите третий коэфицент многочлена: ");
        k = in.nextInt();
        mn1k3.add(k);
        ArrayList<Integer> mn1 = new ArrayList<Integer>();
        mn1.addAll(mn1k1);
        mn1.addAll(mn1k2);
        mn1.addAll(mn1k3);
        //Многочлен 2
        ArrayList<Integer> mn2k1 = new ArrayList<Integer>();
        ArrayList<Integer> mn2k2 = new ArrayList<Integer>();
        ArrayList<Integer> mn2k3 = new ArrayList<Integer>();
        System.out.print("2 многочлен - Введите первый коэфицент многочлена: ");
        k = in.nextInt();
        mn2k1.add(k);
        System.out.print("2 многочлен - Введите второй коэфицент многочлена: ");
        k = in.nextInt();
        mn2k2.add(k);
        System.out.print("2 многочлен - Введите третий коэфицент многочлена: ");
        k = in.nextInt();
        mn2k3.add(k);
        ArrayList<Integer> mn2 = new ArrayList<Integer>();
        mn2.addAll(mn2k1);
        mn2.addAll(mn2k2);
        mn2.addAll(mn2k3);
        int mn1s = mn1.size();
        int mn2s = mn2.size();
        int out1 = 0;
        int out2 = 0;
        for (int i =0; i<mn1s; i++) {
            int a = mn1.get(i);
            out1 = out1 + a;
        }
        for (int i =0; i<mn2s; i++) {
            int a = mn2.get(i);
            out2 = out2 + a;
        }
        int out1s = (int) Math.pow(out1, step);
        int out2s = (int) Math.pow(out2, step);
        System.out.println(out1s+"*"+out2s+"="+out1s*out2s);
    }
}
