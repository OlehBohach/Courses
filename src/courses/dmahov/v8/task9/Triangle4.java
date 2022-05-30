package courses.dmahov.v8.task9;

// Равнобедренный преугольник
public class Triangle4 {
    private static double s1 = 10;
    private static double h = 9;

    private static double getS() {
        double out = s1*h/2;
        return out;
    }

    private static double getP() {
        double out = 2*Math.sqrt(Math.pow(s1, 2)-Math.pow(h, 2))+2*s1;
        return out;
    }

    public static double[] getStor() {
        double[] out = {s1, h};
        return out;
    }

    public static double[] getSandP() {
        double[] data = new double[2];
        data[0] = getS();
        data[1] = getP();
        return data;
    }
}