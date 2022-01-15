package courses.atulinov.lab1;
import java.util.Scanner;
public class ex1primer8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double x, b, c;
        x = scn.nextDouble();
        b = scn.nextDouble();
        c = scn.nextDouble();
        double stepen = Math.pow(x, 3);
        double stepen1 = Math.pow(x, 2);
        double sin = Math.sin(b * x);
        double umno = sin * stepen1;
        double plus = stepen + umno + c;
        double pl = stepen1 + c;
        double min = 1 - x;
        double del = pl / min;
        double plu = 1 + del;
        double y = plus / plu;
        System.out.print(y);
    }
}