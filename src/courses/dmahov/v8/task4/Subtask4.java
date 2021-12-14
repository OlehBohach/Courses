package courses.dmahov.v8.task4;

public class Subtask4 {
    public static void main(String[] args) {
        int[] numbs = {-97, -93, -91, -64, -62, -50, -40, -34, -30, -28, -25, -22, -7, 5, 22, 38, 68, 70, 91, 93};
        boolean flag = true;
        int out1 = 0;
        for (int i = 0; i < numbs.length; i++) {
            if (numbs[i] < 0) {
                if ( numbs[i] % 2 != 0 ) {
                    out1 = out1 + numbs[i];
                }
                flag = false;

            }
            if (flag) System.out.println("Отрицательных чисел нет!");
        }
        System.out.println(out1);
    }
}
