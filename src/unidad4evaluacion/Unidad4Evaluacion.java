package unidad4evaluacion;

import modelos.*;
import dao.DEmpleadoProduccion;
import dao.DEmpleadoOficina;


public class Unidad4Evaluacion {
    public static void main(String[] args) {
        //Empleados de Produccion 
        DEmpleadoProduccion empleadoP = new DEmpleadoProduccion();          
        Empleado juan = new EmpleadoProduccion("Perez", 25000, 1, "Juan", 10000, 2000);
        empleadoP.agregarRegistro(juan);
        Empleado carlos = new EmpleadoProduccion("Romero", 1000, 2, "Carlos", 11000, 2000);
        empleadoP.agregarRegistro(carlos);
        Empleado javier = new EmpleadoProduccion("Lopez", 3000, 3, "Javier", 12000, 2000);
        empleadoP.agregarRegistro(javier);
        //Empleados de Oficina
        DEmpleadoOficina empleadoO = new DEmpleadoOficina();
        Empleado pedro = new EmpleadoOficina("Ruiz", 4000, 4, "Pedro", 14000);
        empleadoO.agregarRegistro(pedro);
        Empleado jose = new EmpleadoOficina("Duran", 5000, 5, "Jose", 15000);
        empleadoO.agregarRegistro(jose);
        Empleado pancho = new EmpleadoOficina("Carrasco", 6000, 6, "Pancho", 20000);
        empleadoO.agregarRegistro(pancho);
        
        empleadoO.mostrarRegistro();
        System.out.println("--------------------------------------------------------------------------------------------");
        empleadoP.mostrarRegistro();
        
        
        
    }
    
}
