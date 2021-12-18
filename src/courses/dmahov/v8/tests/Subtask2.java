package courses.dmahov.v8.tests;

import java.util.Scanner;

//Получение данных от пользователя
public class Subtask2 {
    public static void main(String[] args) {
        while(true) {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите имя человека: ");
            String vv = in.nextLine();
            Subtask1.main(vv);
        }
    }
}
