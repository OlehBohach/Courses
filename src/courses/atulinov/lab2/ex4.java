package courses.atulinov.lab2;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите количество рублей: ");
        int denga = scn.nextInt();
        System.out.print("Введите во что хотите перевести: (1 - доллар; 2 - евро; 3 - гривны)");
        int deistvie = scn.nextInt();
        switch(deistvie) {
            case 1:
                System.out.println((double)denga * 0.0136D);
                break;
            case 2:
                System.out.println((double)denga * 0.012013D);
                break;
            case 3:
                System.out.println((double)denga * 0.4D);
        }

    }
}
