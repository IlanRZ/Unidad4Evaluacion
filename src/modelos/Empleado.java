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
public class Empleado {
    String apellido;
    double horasExtras;
    int id;
    String nombre;
    double salarioBase;

    public Empleado() {
    }

    public Empleado(String apellido, double horasExtras, int id, String nombre, double salarioBase) {
        this.apellido = apellido;
        this.horasExtras = horasExtras;
        this.id = id;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public double calcularSalarioBruto(){
        double salarioBruto;
        salarioBruto = (double) (horasExtras + salarioBase);
        return salarioBruto;     
    }

    public double calcularSeguro(){
        double seguro;
        seguro = (calcularSalarioBruto()) * 0.07;
        return seguro;
    }
    
    
    public float calcularSalarioNeto(){
        return 0;
   
    };
    
    @Override
    public String toString() {
        return "Empleado{" + "apellido=" + apellido + ", horasExtras=" + horasExtras + ", id=" + id + ", nombre=" + nombre + ", salarioBase=" + salarioBase + '}';
    }


    
    
    
}
