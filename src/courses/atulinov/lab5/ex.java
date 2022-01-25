package courses.atulinov.lab5;

import java.util.Arrays;

public class ex {
    public static void main(String[] args) {
        int [] numbers = new int [5];
        int[][] matrice = {{11, 0, 323, 7, 2345}
                ,{42, 53, 6, -5, 4}
                ,{73, 84, 94, 0, 3432},
                {45, 673, 34, 98, 3245},
                {2, 345, 5546, 4564, 6565}};
        for (int i = 0; i < 5; i ++) {
            for (int j = 0; j < 5; j ++){
                if (matrice[i][j] > 0) {
                    numbers[i] = 1;
                }
                else{
                    numbers[i] = -1;
                    break;
                    }
                }
            }
        System.out.println(Arrays.toString(numbers));
        }
    }