/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feria;

import java.util.Date;


public class Atracciones{
    public String nombre; // Nombre de la atracción
    public Date fechaDeCreacion; // Fecha de cuando fue creada la atracción
    public Boolean paraNiños; // Si la atracción es para niños o no
    
    public Atracciones(String, Date, Boolean){
            this.fechaDeCreacion = fechaDeCreacion;
            this.nombre = nombre;
            this.paraNiños = paraNiños;    
}

    Atracciones(String nombreAtracciones, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(Date fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public Boolean getParaNiños() {
        return paraNiños;
    }

    public void setParaNiños(Boolean paraNiños) {
        this.paraNiños = paraNiños;
    }
    
    
}

