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
public class EmpleadoProduccion extends Empleado{
    private double bono;

    public EmpleadoProduccion() {
    }

    public EmpleadoProduccion(double bono) {
        this.bono = bono;
    }

    public EmpleadoProduccion( String apellido, double horasExtras, int id, String nombre, double salarioBase,double bono) {
        super(apellido, horasExtras, id, nombre, salarioBase);
        this.bono = bono;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }
    
    @Override
    public double calcularSalarioBruto(){
        double salarioBruto;
        salarioBruto = (double) (horasExtras + salarioBase);
        return salarioBruto;     
    }    
    
    @Override
    public float calcularSalarioNeto(){   
        float salarioNeto;
        salarioNeto = (float) (((calcularSalarioBruto() - calcularSeguro())) + bono);
        return salarioNeto;
    }
    
    @Override
    public String toString() {
        return "Empleado{" + "apellido=" + apellido + ", horasExtras=" +
                horasExtras + ", id=" + id + ", nombre=" + nombre + 
                ", salarioBase=" + salarioBase + ", bono=" + bono + " Salario Bruto: " +
                calcularSalarioBruto() + " Seguro Social: " + calcularSeguro() +
                " Salario Neto: "+ calcularSalarioNeto() + '}';
    }

    
    
    
    
 
  
    
    
}
