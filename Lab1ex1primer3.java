package courses.atulinov.lab1;
import java.util.Scanner;
public class Lab1ex1primer3 {
    public static void main(String[] args) {
        double stepen, cosinus, plus, delit, koren, umnogit, stepen2;
        double a, x, j;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        x = scanner.nextDouble();
        j = scanner.nextDouble();
        stepen = Math.pow(a, 6);
        cosinus = Math.cos(x);
        stepen2 = Math.pow(cosinus, 4);
        koren = Math.sqrt(j);
        delit = 1 / koren;
        umnogit = delit * stepen2;
        plus = stepen + umnogit;
        System.out.print(plus);
    }

}


