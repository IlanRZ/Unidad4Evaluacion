/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author MOVIE
 */
public class EmpleadoOficina extends Empleado {

    public EmpleadoOficina() {
    }

    public EmpleadoOficina(String apellido, double horasExtras, int id, String nombre, double salarioBase) {
        super(apellido, horasExtras, id, nombre, salarioBase);
    }
    
    @Override
    public float calcularSalarioNeto(){   
        float salarioNeto;
        salarioNeto = (float) ((calcularSalarioBruto() - calcularSeguro()));
        return salarioNeto;
    }    
    @Override
    public String toString() {
        return "Empleado{" + "apellido=" + apellido + 
                ", horasExtras=" + horasExtras + ", id=" + id + ", nombre=" 
                + nombre + ", Salario Base: " + salarioBase + " Salario Bruto: " +
                calcularSalarioBruto() + " Seguro Social: " + calcularSeguro() +
                " Salario Neto: "+ calcularSalarioNeto() + '}';
    }
    

    
    
    
}
