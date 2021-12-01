/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import modelos.EmpleadoOficina;
import modelos.EmpleadoProduccion;
import unidad4evaluacion.Interfaz.IOperaciones;

/**
 *
 * @author MOVIE
 */
public class DEmpleadoOficina implements IOperaciones {
    public ArrayList <EmpleadoOficina> lista = new ArrayList();
    
    @Override
    public void agregarRegistro(Object registro) {
        lista.add((EmpleadoOficina)registro);     
     }
    
    public void agregarRegistro(String apellido, double horasExtras, int id, 
            String nombre, double salarioBase){
        lista.add(new EmpleadoOficina(apellido, horasExtras,
                id, nombre, salarioBase));
    }
    


    public void mostrarRegistro() {
        lista.forEach(e -> {
            System.out.println(e.toString());
        });
        }
    
}
