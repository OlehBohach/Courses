package courses.dmahov.v8.task9;

// Прямоугольный преугольник
public class Triangle2 {
    private static double s1 = 10;
    private static double s2 = 5;

    private static double getS() {
        double out = s1*s2;
        out=out / 2;
        return out;
    }

    private static double getP() {
        double s3 = Math.sqrt(Math.pow(s1, 2)+Math.pow(s2, 2));
        double out = s1+s2+s3;
        return out;
    }

    public static double[] getStor() {
        double[] out = {s1, s2};
        return out;
    }

    public static double[] getSandP() {
        double[] data = new double[2];
        data[0] = getS();
        data[1] = getP();
        return data;
    }
}