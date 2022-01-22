package courses.atulinov.lab3;

public class Ship {
    private String name;
    private double displasement;
    private boolean passagir;

    public Ship() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDisplasement() {
        return this.displasement;
    }

    public void setDisplasement(double weight) {
        this.displasement = weight;
    }

    public boolean getPassagir() {
        return this.passagir;
    }

    public void setPassagir(boolean passagir) {
        this.passagir = passagir;
    }

    public void toConsole() {
        System.out.println("Название корабля: " + this.name);
        System.out.println("Водоизмещение корабля: " + this.displasement);
        System.out.println("Наличие пассажирских кают: " + this.passagir);
    }
}