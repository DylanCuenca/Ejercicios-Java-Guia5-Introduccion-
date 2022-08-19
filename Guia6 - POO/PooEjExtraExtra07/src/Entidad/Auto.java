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
public class Auto {
    
    private String nombreDueño;
    private String fechaVencimientoCarnet;
    private String color;
    private String modelo;
    private int kmEnMotor;
    
    //---CONSTRUCTORES
    public Auto() {
       kmEnMotor = 7500;
    }

    public Auto(String nombreDueño, String fechaVencimientoCarnet, String color, String modelo) {
        this.nombreDueño = nombreDueño;
        this.fechaVencimientoCarnet = fechaVencimientoCarnet;
        this.color = color;
        this.modelo = modelo;
        this.kmEnMotor = 7500;
    }
    
    //---GETTERS & SETTERS
    public String getNombreDueño() {
        return nombreDueño;
    }

    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }

    public String getFechaVencimientoCarnet() {
        return fechaVencimientoCarnet;
    }

    public void setFechaVencimientoCarnet(String fechaVencimientoCarnet) {
        this.fechaVencimientoCarnet = fechaVencimientoCarnet;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKmEnMotor() {
        return kmEnMotor;
    }

    public void setKmEnMotor(int kmEnMotor) {
        this.kmEnMotor = kmEnMotor;
    }
    
    
    
    
}
