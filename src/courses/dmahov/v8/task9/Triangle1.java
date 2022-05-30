package courses.dmahov.v8.task9;

// Две стороны и угол между ними
public class Triangle1 {
    private static double s1 = 10;
    private static double s2 = 5;
    private static double ugl = 30;

    private static double getS() {
        double u = Math.sin(ugl/57.2958);
        double out = s1*s2*u;
        out=out / 2;
        return out;
    }

    private static double getP() {
        double v1 = Math.cos(s1/57.2958);
        double v2 = 2*s1*s2*v1;
        double v3 = Math.pow(s1, 2)+Math.pow(s2, 2);
        double v4 = Math.sqrt(v3-v2);
        double out = s1+s2+v4;
        return out;
    }
    public static double[] getStor() {
        double[] out = {s1, s2, ugl};
        return out;
    }
    public static double[] getSandP() {
        double[] data = new double[2];
        data[0] = getS();
        data[1] = getP();
        return data;
    }
}