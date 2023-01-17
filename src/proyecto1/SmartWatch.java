package proyecto1;

public class SmartWatch extends SmartDevice{

    int numeroDeCorreas;

    public SmartWatch() {}

    public SmartWatch(String sistemaOperativo, Double precio, String color, int numeroDeCorreas) {
        super(sistemaOperativo, precio, color);
        this.numeroDeCorreas = numeroDeCorreas;
    }
}
