package SinInterfaces;

public class Empleado {

    //1. Atributos

    String nombre;
    int edad;
    double sueldo;
    boolean alta;

    //2. Constructor
    public Empleado(){}

    public Empleado(String nombre, int edad, double sueldo, boolean alta) {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
        this.alta = alta;
    }

    //3. Métodos


    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sueldo=" + sueldo +
                ", alta=" + alta +
                '}';
    }
}
