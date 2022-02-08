package courses.dmahov.v8.task8;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Subtask1 {
    public static Calendar date;
    public static void main(String[] args) {
        date();
        Calendar dateNow = getDate();
        printDate(dateNow);
    }

    public static void date() {
        Calendar cal = Calendar.getInstance();
        setDate(cal);
    }

    public static void setDate(Calendar dateNow) {
        date = dateNow;
    }

    public static Calendar getDate() {
        return date;
    }

    public static void dateSetting(int day, int month, int year) {
        Calendar date = getDate();
        date.add(Calendar.DATE, day);
        date.add(Calendar.MONTH, month);
        date.add(Calendar.YEAR, year);
        setDate(date);
    }

    public static void printDate(Calendar date) {
        boolean b = true;
        while (b=true) {
            DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
            System.out.println(dateFormat.format(date.getTime()));
            System.out.println("Для изменения даты напишите - 1\nДля обновления значений напишите - 2");
            System.out.print("Enter: ");
            Scanner i = new Scanner(System.in);
            int ch = i.nextInt();
            if (ch == 1) {
                System.out.print("Введите день (если не хотите менять этот параметр напишите 0): ");
                int day = i.nextInt();
                System.out.print("Введите месяц (если не хотите менять этот параметр напишите 0): ");
                int month = i.nextInt();
                System.out.print("Введите год (если не хотите менять этот параметр напишите 0): ");
                int year = i.nextInt();
                dateSetting(day, month, year);
            } else if (ch == 2) {
                System.out.println("Обновляю..");
            } else {
                System.out.println("Вы ввели неверное число.");
            }

        }
    }


}
