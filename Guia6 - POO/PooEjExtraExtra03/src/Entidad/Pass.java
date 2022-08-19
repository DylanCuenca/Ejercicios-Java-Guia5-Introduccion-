/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Dylan
 */
public class Pass {
    
    private String pass, nombre;
    private int dni;
    
    //--CONSTRUCTORES
    public Pass() {
    }

    public Pass(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    //--GETTERS & SETTERS
    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    
    
    
}
