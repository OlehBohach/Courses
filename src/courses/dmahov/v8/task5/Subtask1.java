package courses.dmahov.v8.task5;
import java.io.*;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Subtask1 {
    public static void main(String[] args){
        String File = "C:\\Users\\Dedik2\\Documents\\GitHub\\Rep2\\Courses\\src\\courses\\dmahov\\v8\\task5\\t.txt";
        int[][] arr = null;
        try {
            try (Scanner in = new Scanner(new File(File))) {
                int n = in.nextInt();
                int m = in.nextInt();
                arr = new int[n][m];
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        arr[i][j] = in.nextInt();
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка " + e + "! файл " + File + " не найден!");
        } catch (InputMismatchException e) {
            System.out.println("Ошибка " + e + "! Не соответствие типов данных!");
        }
        //Главная
        int gl1 = arr[0][0];
        int gl2 = arr[1][1];
        int gl3 = arr[2][2];
        int gl4 = arr[3][3];
        int gl5 = arr[4][4];
        //Побочная
        int pb1 = arr[4][0];
        int pb2 = arr[3][1];
        int pb3 = arr[2][2];
        int pb4 = arr[1][3];
        int pb5 = arr[0][4];
        //Единички
        int[] numbs = {1, 1, 1, 1, 1};
        if (gl1 < pb1) {
            numbs[0] = -1;
        }
        if (gl2 < pb2) {
            numbs[1] = -1;
        }
        if (gl3 < pb3) {
            numbs[2] = -1;
        }
        if (gl4 < pb4) {
            numbs[3] = -1;
        }
        if (gl5 < pb5) {
            numbs[4] = -1;
        }
        System.out.println(Arrays.toString(numbs));
    }

}
