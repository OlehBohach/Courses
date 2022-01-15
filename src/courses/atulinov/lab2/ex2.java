package courses.atulinov.lab2;

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите 1 число: ");
        double a = scn.nextDouble();
        System.out.print("Введите 2 число: ");
        double b = scn.nextDouble();
        System.out.print("Введите 3 число: ");
        double c = scn.nextDouble();
        System.out.print("Введите 4 число: ");
        double d = scn.nextDouble();
        System.out.print("Введите 5 число: ");
        double z = scn.nextDouble();
        if (a < b) {
            if (z > a && z < b) {
                System.out.println("Z входит в промежуток[ab]");
            } else if (z < a) {
                System.out.println("Z не входит ни в 1 промежуток");
            } else if (c < d) {
                if (z > c && z < d) {
                    System.out.println("Z входит в промежуток[cd]");
                } else if (z < c) {
                    System.out.println("Z не входит ни в 1 промежуток");
                } else if (z > d) {
                    System.out.println("Z не входит ни в 1 промежуток");
                }
            } else if (c < b && d > c) {
                if (z > c && z < d) {
                    System.out.println("Z входит в промежуток[cd and ab]");
                }
            } else if (z < a && z < d) {
                System.out.println("Z не входит ни в 1 промежуток");
            } else {
                System.out.println("Z не входит ни в 1 промежуток");
            }
        } else {
            if (z > b && z < a) {
                System.out.println("Z входит в промежуток[ab]");
            } else if (z < b) {
                System.out.println("Z не входит ни в 1 промежуток");
            }

            if (c < d) {
                if (z < d && z > c) {
                    System.out.println("Z входит в промежуток[cd]");
                } else if (z > d) {
                    System.out.println("Z входит в промежуток[ab]");
                }
            } else if (z < c && z > d) {
                System.out.println("Z входит в промежуток[cd]");
            } else if (z > c) {
                System.out.println("Z входит в промежуток[ab]");
            }
        }

    }
}
