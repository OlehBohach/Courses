package courses.atulinov.lab1;
import java.util.Scanner;
public class ex1primer6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x, y, b;
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        b = scanner.nextDouble();
        double stx =Math.pow(x, 2);
        double sty = Math.pow(y, 2);
        double plus =stx + sty;
        double koren = Math.sqrt(plus);
        double minus = koren - b;
        double modul = Math.abs(x);
        double koren1 = Math.sqrt(modul);
        double sin = Math.sin(y);
        double plusik = sin + koren1 + b;
        double del = minus / plusik;
        double z = Math.log(del);
        System.out.print(z);
    }
}