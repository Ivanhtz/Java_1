package ConInterfaces;

public class Main {

    /**
     * Se implementa arriba la interfaz y se instancia el objeto (implementado de la interfaz) que queramos
     * */

    static EmpleadoCRUD empleadoCRUD = new EmpleadoCRUDMySQL();
    static EmpleadoCRUD empleadoCRUD2 = new EmpleadoCRUDExcel();

    public static void main(String[] args) {


        empleadoCRUD.mostrarEmpleados();

        empleadoCRUD2.mostrarEmpleados();

    }
}
