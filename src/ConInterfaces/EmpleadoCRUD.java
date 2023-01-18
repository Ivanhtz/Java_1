package ConInterfaces;


import SinInterfaces.Empleado;

import java.util.List;

/**
 * Se declaran los métodos, no se implementan
 *
 * Actúa como un contrato, dice lo que hay que hacer pero no lo hace
 * */
public interface EmpleadoCRUD {

    void guardarEmpleados(Empleado empleado);

    List<Empleado> mostrarEmpleados();

    void borrarEmpleado(Empleado empleado);

}
