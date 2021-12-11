package courses.atulinov.lab2;
import java.util.Scanner;
public class Lab2ex3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите 1 число: ");
        double x = scn.nextDouble();
        System.out.print("Введите 2 число: ");
        double y = scn.nextDouble();
        System.out.print("Введите что нужно сделать (1(сложить), 2(отнять), 3(умножить), 4(делить)): ");
        int i = scn.nextInt();
        switch (i) {
            case 1:
                System.out.print("Ваш ответ: ");
                System.out.println(x + y);
                break;
            case 2:
                System.out.print("Ваш ответ: ");
                System.out.print(x - y);
                break;
            case 3:
                System.out.print("Ваш ответ: ");
                System.out.print(x * y);
                break;
            case 4:
                System.out.print("Ваш ответ: ");
                System.out.print(x / y);
                break;
            default:
                System.out.print("Такого варианта нет");

        }
    }
}