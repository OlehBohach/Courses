import java.util.Arrays;

public class Subtask1 {
    public static void main(String[] args) {
        String[] g1 = {"Num1", "Num2", "Num3"};
        Integer[] g2 = {123,1231,12331};
        Work newWork = new Work(g1, g2);
        System.out.println(Arrays.toString(newWork.getOut()));
    }
}

