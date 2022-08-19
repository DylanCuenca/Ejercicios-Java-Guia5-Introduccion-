/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Fraccion;
import java.util.Scanner;

/**
 *
 * @author Dylan
 */
public class FraccionService {
    
    Scanner read = new Scanner(System.in);
    
    public Fraccion crearFraccion () {
        Fraccion fraccion = new Fraccion();
        
        System.out.println("Fraccion 1 \n");
        System.out.println("Numerador: ");
        fraccion.setNumerador1(read.nextInt());
        
        System.out.println("Denominador: ");
        fraccion.setDenominador1(read.nextInt());
        
        System.out.println("Fraccion 2 \n");
        System.out.println("Numerador: ");
        fraccion.setNumerador2(read.nextInt());
        
        System.out.println("Denominador: ");
        fraccion.setDenominador2(read.nextInt());
        
        return fraccion;
    }
    
    public void sumar(Fraccion fr) {
        
        int suma;
        if (fr.getDenominador1() == fr.getDenominador2()) {
            
            suma = fr.getNumerador1() + fr.getNumerador2();
            System.out.println("Suma = " + suma + "/" + fr.getDenominador1());
        }
        else if (fr.getDenominador1() != fr.getDenominador2()) {
            int mcm = fr.getDenominador1() * fr.getDenominador2();
            int aux1 = (mcm / fr.getDenominador1()) * fr.getNumerador1();
            int aux2 = (mcm / fr.getDenominador2()) * fr.getNumerador2();
            
            suma = aux1 + aux2;
            System.out.println("Suma = " + suma + "/" + mcm);
        }
    }
    
    public void restar(Fraccion fr) {
        
        int resta;
        if (fr.getDenominador1() == fr.getDenominador2()) {
            
            resta = fr.getNumerador1() - fr.getNumerador2();
            System.out.println("Resta = " + resta + "/" + fr.getDenominador1());
        }
        else if (fr.getDenominador1() != fr.getDenominador2()) {
            int mcm = fr.getDenominador1() * fr.getDenominador2();
            int aux1 = (mcm / fr.getDenominador1()) * fr.getNumerador1();
            int aux2 = (mcm / fr.getDenominador2()) * fr.getNumerador2();
            
            resta = aux1 - aux2;
            System.out.println("Resta = " + resta + "/" + resta);
        }
    }
    
    public void multiplicar(Fraccion fr) {
        
        int nume = fr.getNumerador1() * fr.getNumerador2();
        int deno = fr.getDenominador1() * fr.getDenominador2();
        
        System.out.println("Multiplicacion = " + nume + "/" + deno);
    }
    
    public void dividir(Fraccion fr) {
        
        int nume = fr.getNumerador1() * fr.getDenominador2();
        int deno = fr.getDenominador1() * fr.getNumerador2();
        
        System.out.println("Division = " + nume + "/" + deno);
    }
    
    public void menu() {
        
        Fraccion fraccion = crearFraccion();
        String opcion = "";
        do {
            System.out.println("Operaciones: \n" +
                                "A- Sumar \n" +
                                "B- Restar \n" +
                                "C- Multiplicar \n" +
                                "D- Dividir \n" +
                                "E- Salir");
            opcion = read.next().toUpperCase();
            
            switch (opcion) {
                case "A":
                    sumar(fraccion);
                    break;
                case "B":
                    restar(fraccion);
                    break;
                case "C":
                    multiplicar(fraccion);
                    break;
                case "D":
                    dividir(fraccion);
                    break;
                case "E":
                    System.out.println("//--Fin--//");  
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (!opcion.equals("E"));
        
        
    }
}
