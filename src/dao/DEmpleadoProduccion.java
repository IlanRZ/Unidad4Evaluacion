/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import unidad4evaluacion.Interfaz.IOperaciones;
import java.util.ArrayList;
import modelos.EmpleadoProduccion;
/**
 *
 * @author MOVIE
 */
public class DEmpleadoProduccion implements IOperaciones {
    public ArrayList<EmpleadoProduccion> lista = new ArrayList ();
    
    @Override
    public void agregarRegistro(Object registro) {
       lista.add((EmpleadoProduccion) registro);
    }
       
    public void agregarRegistro(String apellido, double horasExtras, int id, 
            String nombre, double salarioBase, double bono){
        lista.add(new EmpleadoProduccion(apellido, horasExtras,
                id, nombre, salarioBase, bono));
    }
    
    
    public void mostrarRegistro() {
        lista.forEach(e -> {
            System.out.println(e.toString());
        });
        }


}
