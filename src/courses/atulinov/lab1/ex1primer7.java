package courses.atulinov.lab1;
import java.util.Scanner;
public class ex1primer7 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        double j, x;
        j = scaner.nextDouble();
        x = scaner.nextDouble();
        double stepen = Math.pow(x, 3);
        double tg = Math.tan(stepen);
        double umn = 2 * Math.PI * j;
        double plus = umn + tg;
        double cos = Math.cos(x);
        double modul = Math.abs(cos);
        double umnog = 2 * j * modul;
        double del = plus / umnog;
        System.out.print(del);
    }
}