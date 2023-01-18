package SinInterfaces;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUD {

   private List<Empleado> empleados = new ArrayList<>();

    // Guardar un empleado
    public void guardarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }

    // Mostrar los empleados
    public List<Empleado> mostrarEmpleados(){
        return empleados;
    }
}
