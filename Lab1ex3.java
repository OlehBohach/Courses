package courses.atulinov.lab1;

import java.util.Scanner;

public class Lab1ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение первого катета: ");
        double katet1 = scanner.nextDouble();
        System.out.print("Введите значение гипотенузы");
        double gipotenusa = scanner.nextDouble();
        double gipotenusa1 = gipotenusa * 100;
        System.out.print("Второй катет равен: ");
        double katet2 = (Math.sqrt(Math.pow(gipotenusa1, 2) - (Math.pow(katet1, 2))));
        System.out.print("Периметр равен: ");
        double perimetr = katet1 + katet2 + gipotenusa1;
        System.out.println(katet2);
        System.out.print(perimetr);
    }
}
