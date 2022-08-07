/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Date;

/**
 *
 * @author Dylan
 */
public class Persona {
    
    private String nombre;
    private Date fechaNAcimiento;

    //---CONSTRUCTORES
    public Persona() {
    }

    public Persona(String nombre, Date fechaNAcimiento) {
        this.nombre = nombre;
        this.fechaNAcimiento = fechaNAcimiento;
    }
    
    //---SETTER & GETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNAcimiento() {
        return fechaNAcimiento;
    }

    public void setFechaNAcimiento(Date fechaNAcimiento) {
        this.fechaNAcimiento = fechaNAcimiento;
    }
    
    
}


