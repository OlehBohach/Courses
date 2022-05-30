package courses.dmahov.v8.task9;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
// Класс взаимодействия с треугольниками
public class Picture {

    public static String[] getOut() {
        double[] tr1 = Triangle1.getSandP();
        String tr1out = "По двум сторонам и углу между ними:\n  Площадь: "+Arrays.toString(new double[]{tr1[0]})+"\n  Периметр: "+Arrays.toString(new double[]{tr1[1]})+"\n";
        double[] tr2 = Triangle2.getSandP();
        String tr2out = "Прямоугольный треугольник:\n  Площадь: "+Arrays.toString(new double[]{tr2[0]})+"\n  Периметр: "+Arrays.toString(new double[]{tr2[1]})+"\n";
        double[] tr3 = Triangle3.getSandP();
        String tr3out = "Равносторонний треугольник:\n  Площадь: "+Arrays.toString(new double[]{tr3[0]})+"\n  Периметр: "+Arrays.toString(new double[]{tr3[1]})+"\n";
        double[] tr4 = Triangle4.getSandP();
        String tr4out = "Равнобедненный треугольник:\n  Площадь: "+Arrays.toString(new double[]{tr4[0]})+"\n  Периметр: "+Arrays.toString(new double[]{tr4[1]})+"\n";
        String[] all = new String[] {tr1out, tr2out, tr3out, tr4out};
        return all;
    }

    public static String[] getData() {
        double[] tr1 = Triangle1.getStor();
        String out = "По двум сторонам и углу между ними:\n  Первая сторона: "+tr1[0]+"; Вторая сторона: "+tr1[1]+"; Угол между ними: "+tr1[2]+"\n";
        double[] tr2 = Triangle2.getStor();
        String out1 = "Прямоугольный треугольник:\n  Первая сторона: "+tr2[0]+"; Вторая сторона: "+tr2[1]+"\n";
        double[] tr3 = Triangle3.getStor();
        String out2 = "Равносторонний треугольник:\n  Сторона: "+tr3[0]+"\n";
        double[] tr4 = Triangle4.getStor();
        String out3 = "Равнобедненный треугольник:\n  Сторона: "+tr4[0]+"; Высота: "+tr4[1]+"\n";
        String[] all = new String[] {out, out1, out2, out3};
        return all;
    }

    public static void printOut(String[] out) {
        for (int i = 0; i < out.length; i++) {
            System.out.print(out[i]);
        }
    }

    public static void printData(String[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]);
        }
    }

    public static void exportFile(String[] out, String[] data) throws IOException {
        FileWriter writer = new FileWriter("out.txt", false);
        writer.write(""+ Arrays.toString(data) +"::"+ Arrays.toString(out));
        writer.flush();
    }

    public static String[] importFile() throws IOException {
        FileReader reader = new FileReader("out.txt");
        // читаем посимвольно
        int c;
        String out = "";
        while((c=reader.read())!=-1){
            out = out+(char)c;
        }

        String out1 = Arrays.toString(new String[]{out.split("::")[0]}).replace("[[", "[").replace("]]", "]");
        String out2 = Arrays.toString(new String[]{out.split("::")[1]}).replace("[[", "[").replace("]]", "]");

        String[] outArray = new String[] {out1, out2};
        return outArray;
    }

    public static String[] data;
    public static String[] out;

    public static void main(String[] args) throws IOException {
        String[] outOnCode = getOut();
        out = outOnCode;
        String[] dataOnCode = getData();
        data = dataOnCode;
        while (true){
            System.out.println("");
            System.out.print("Выберите действие:\n  1 - Вывести периметры и площади треугольников\n  2 - Вывести размеры треугольников\n  3 - Запись в файл\n  4 - Получение из файла\nEnter: ");
            Scanner get = new Scanner(System.in);
            int s = get.nextInt();
            if (s == 1) {
                System.out.println("\n----------");
                printOut(out);
                System.out.print("\n----------");
            } else if (s == 2) {
                System.out.println("\n----------");
                printData(data);
                System.out.print("\n----------");
            } else if (s == 3) {
                exportFile(out, data);
            } else if (s == 4) {
                String[] dataFile = importFile();
                data =  Arrays.toString(new String[]{dataFile[0]}).replace("[[", "").replace("]]", "").split(",");
                out = Arrays.toString(new String[]{dataFile[1]}).replace("[[", "").replace("]]", "").split(",");
            } else {
                System.out.println("Измивините, я вас не понимаю");
            }
            System.out.println("");
        }
    }
}
