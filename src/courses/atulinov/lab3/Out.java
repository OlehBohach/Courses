package courses.atulinov.lab3;

import java.util.Scanner;

public class Out {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Ship ship = new Ship();
        ship.setName(scn.nextLine());
        ship.setDisplasement(scn.nextDouble());
        ship.setPassagir(scn.hasNext());
        ship.toConsole();
    }
}