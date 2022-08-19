/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Raices;
import java.util.Scanner;

/**
 *
 * @author Dylan
 */
public class RaicesService {
    
    Scanner read = new Scanner(System.in);
    
    public Raices crearRaiz() {
        
        Raices raiz = new Raices();
        
        System.out.println("Ingrese coeficiente 'a'");
        raiz.setA(read.nextDouble());
        
        System.out.println("Ingrese coeficiente 'b'");
        raiz.setB(read.nextDouble());
        
        System.out.println("Ingrese coeficiente 'c'");
        raiz.setC(read.nextDouble());
        
        return raiz;
    }
    
    public double getDiscriminante(Raices raiz) {
        
//        (b^2)-4*a*c
        return (Math.pow(raiz.getB(), 2)) - 4 * raiz.getA() * raiz.getC();
    }    
    
    public boolean tieneRaices(Raices raiz) {
        
        double aux = getDiscriminante(raiz);
        return aux >= 0;
    }
    
    public boolean tieneRaiz(Raices raiz) {
        
        double aux = getDiscriminante(raiz);
        return aux == 0;
    }
    
    public void obtenerRaices(Raices raiz) {
        
//      (-b±√((b^2)-(4*a*c)))/(2*a)
        
        if (tieneRaices(raiz)) {
            
            double aux = -raiz.getB() + Math.sqrt(Math.pow(raiz.getB(), 2) - (4 * raiz.getA() * raiz.getC()));
            double aux2 = aux /(2 * raiz.getA());
            
            System.out.println("solucion 1: " + aux2);
            
            aux = -raiz.getB() - Math.sqrt(Math.pow(raiz.getB(), 2) - (4 * raiz.getA() * raiz.getC()));
            aux2 = aux /(2 * raiz.getA());
            
            System.out.println("solucion 2: " + aux2);
        }
    }
    
    public void obtenerRaiz(Raices raiz) {
        
//        (-b±√((b^2)-(4*a*c)))/(2*a)
        
        if (tieneRaiz(raiz)) {
            
            double aux = -raiz.getB() + Math.sqrt(Math.pow(raiz.getB(), 2) - (4 * raiz.getA() * raiz.getC()));
            double aux2 = aux /(2 * raiz.getA());
            
            System.out.println("Unica solucion: " + aux2);
        }
    }
    
    public void calcular(Raices raiz) {
        
        if (tieneRaiz(raiz)) {
            obtenerRaiz(raiz);
        }
        else if (tieneRaices(raiz)) {
            obtenerRaices(raiz);
        }
        else {
            System.out.println("No existen soluciones");
        }
    }
}
