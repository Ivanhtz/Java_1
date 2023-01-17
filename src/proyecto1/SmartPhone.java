package proyecto1;

public class SmartPhone extends SmartDevice{

    int numeroCarcasas;

    public SmartPhone() {}

    public SmartPhone(String sistemaOperativo, Double precio, String color, int numeroCarcasas) {
        super(sistemaOperativo, precio, color);
        this.numeroCarcasas = numeroCarcasas;
    }
}
