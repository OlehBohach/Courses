package courses.atulinov.lab1;

import java.util.Scanner;
public class ex1primer2 {
    public static void main(String[] args) {
        double logarifm, modul, stepen, delit1, plus, minus, delit2, umnogenie;
        double w, x, y, z;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        z = scanner.nextDouble();
        stepen = Math.pow(x, 5);
        delit1 = stepen / 4;
        plus = z + delit1;
        delit2 = y / plus;
        minus = x - delit2;
        logarifm = Math.log(Math.abs(x+7));
        umnogenie = logarifm * minus;
        w = umnogenie;
        System.out.print(w);
    }
}