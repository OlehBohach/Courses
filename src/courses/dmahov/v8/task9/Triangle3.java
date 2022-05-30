package courses.dmahov.v8.task9;

// Равносторонний преугольник
public class Triangle3 {
    private static double s1 = 10;

    private static double getS() {
        double out = Math.sqrt(3)/4*Math.pow(s1, 2);
        return out;
    }

    private static double getP() {
        double out = s1*3;
        return out;
    }

    public static double[] getStor() {
        double[] out = {s1};
        return out;
    }

    public static double[] getSandP() {
        double[] data = new double[2];
        data[0] = getS();
        data[1] = getP();
        return data;
    }
}