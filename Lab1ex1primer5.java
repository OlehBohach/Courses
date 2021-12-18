package courses.atulinov.lab1;
import java.util.Scanner;
public class Lab1ex1primer5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, x, b, e;
        double stepenx, kos, modul, stepen1, umnogitb, umnogita, plus, plus1, umnogit, stepene, umn, del;
        x = scanner.nextDouble();
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        e = scanner.nextDouble();
        stepenx = Math.pow(x, 2);
        kos = Math.cos(stepenx);
        modul = Math.abs(kos);
        stepen1 = Math.pow(x, 2);
        umnogitb = b * 2;
        umnogita = a * x;
        plus = umnogita + umnogitb;
        plus1 = plus + stepen1;
        umnogit = modul * plus1;
        stepene = Math.pow(e, x);
        umn = Math.PI * stepene;
        del = umnogit / umn;
        System.out.print(del);
    }
}
