package courses.atulinov.lab1;

import java.util.Scanner;

public class Lab1ex1primer1 {
    public static void main(String[] args) {
        double a1, a2, b1, b2, c1, c2, d1, d2, e1;
        Scanner scanner = new Scanner(System.in);
        double a, x, e;
        a = scanner.nextDouble();
        x = scanner.nextDouble();
        e = scanner.nextDouble();
        scanner.close();
        a1 = Math.sin(a);
        a2 = Math.tan(x);
        b1 = Math.pow(a2, 2);
        b2 = a1 + b1;
        c1 = Math.abs(a);
        c2 = Math.pow(e, c1);
        d1 = b2 * c2;
        d2 = Math.log(a);
        e1 = d1 / d2;
        System.out.print(e1);
    }
}