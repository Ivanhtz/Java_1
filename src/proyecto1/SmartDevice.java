package proyecto1;

public abstract class SmartDevice {

    String sistemaOperativo;
    Double precio;
    String color;


    public SmartDevice(){}

    public SmartDevice(String sistemaOperativo, Double precio, String color) {
        this.sistemaOperativo = sistemaOperativo;
        this.precio = precio;
        this.color = color;
    }


}
