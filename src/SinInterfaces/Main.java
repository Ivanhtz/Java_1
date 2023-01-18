package SinInterfaces;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();
        Empleado pedro = new Empleado("Pedro", 30, 40000, true);
        Empleado julian = new Empleado("Julian", 25, 35000, true);
        Empleado lucia = new Empleado("Lucía", 32, 45000, true);
        Empleado carmen = new Empleado("Carmen", 23, 25000, false);

        empleadoCRUD.guardarEmpleado(pedro);
        empleadoCRUD.guardarEmpleado(julian);
        empleadoCRUD.guardarEmpleado(lucia);
        empleadoCRUD.guardarEmpleado(carmen);

        List<Empleado> empleados = empleadoCRUD.mostrarEmpleados();

        System.out.println(empleados);
    }
}
