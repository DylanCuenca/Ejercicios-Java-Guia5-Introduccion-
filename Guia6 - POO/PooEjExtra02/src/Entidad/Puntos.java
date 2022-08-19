/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Dylan
 */
public class Puntos {
    
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    
    Scanner read = new Scanner (System.in);

    public Puntos() {
    }

    public Puntos(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    //---GETTERS & SETTERS
    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
    
    //---METODOS
    
    public void crearPunto() {
        
        System.out.println("Punto 1 \n" + " Ingrese coordenada x1: ");
        x1 = read.nextInt();
        
        System.out.println("Ingrese coordenada y1: ");
        y1 = read.nextInt();
        
        System.out.println("Punto 2 \n" + " Ingrese coordenada x2: ");
        x2 = read.nextInt();
        
        System.out.println("Ingrese coordenada y2: ");
        y2 = read.nextInt();
    }
    
    public int calcularDistancia() {
        
        return (int) Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2-y1, 2)));
    }
    
}
