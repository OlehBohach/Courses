package courses.atulinov.lab1;
import java.util.Scanner;
public class ex1primer4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double h, y, a, b, c, x;
        double tan, stepentan, minus, modul, koren, kvadrat, umnogit, umnogitkoren, umnogity, siny, umnogsin, del, min;
        h = scanner.nextDouble();
        y = scanner.nextDouble();
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        x = scanner.nextDouble();
        tan = Math.tan(x);
        stepentan = Math.pow(tan, 3);
        minus = 1 - stepentan;
        modul = Math.abs(minus);
        koren = Math.sqrt(modul);
        kvadrat = Math.pow(b, 2);
        umnogit = 17.3 * kvadrat;
        umnogitkoren = umnogit * koren;
        umnogity = y * 2;
        siny = Math.sin(umnogity);
        double stepeny = Math.pow(siny, 3);
        umnogsin = 0.4 * stepeny;
        double umnabs = a * b * c;
        del = umnogsin / umnabs;
        min = del - umnogitkoren;
        double h1 = min;
        System.out.print(h);
    }
}