package courses.atulinov.lab2;
import java.util.Scanner;
public class Lab2ex4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите количество рублей: ");
        double denga = scn.nextDouble();
        System.out.print("Введите во что хотите перевести: (1 - доллар; 2 - евро; 3 - гривны)");
        int deistvie = scn.nextInt();
        switch (deistvie){
            case 1:
                System.out.print(denga * 0.0136);
                break;
            case 2:
                System.out.print(denga * 0.012013);
                break;
            case 3:
                System.out.print(denga * 0.36992);
        }
    }
}