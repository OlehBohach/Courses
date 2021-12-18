package courses.atulinov.lab2;
import java.util.Scanner;
public class Lab2ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double storona_kvadrata = scanner.nextDouble();
        double r_radius = scanner.nextDouble();
        double ploshad1 = Math.pow(storona_kvadrata,2);
        double ploshad2 = Math.PI * Math.pow(r_radius, 2);
        if (ploshad1 > ploshad2) {
            System.out.print("Площадь квадрата больше площади круга");
        } else if (ploshad1 < ploshad2) {
            System.out.print("Площадь квадрата меньше площади круга");
        } else if (ploshad1 == ploshad2) {
            System.out.print("Площади равны");
        }
    }
}