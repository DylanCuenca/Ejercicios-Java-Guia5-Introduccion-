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
public class Operacion {
    
    private int numero1;
    private int numero2;

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }
    
    //---Getters y setters
    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    //--- Metodos
    public void crearOperacion() {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese numero 1: ");
        numero1 = read.nextInt();
        
        System.out.println("Ingrese numero 2: ");
        numero2 = read.nextInt();
    }
    
    public int sumar() {
        return numero1 + numero2;
    }
    
    public int restar() {
        return numero1 - numero2;
    }
    
    public int multiplicar() {
        if (numero1 == 0 || numero2 == 0) {
            
            System.out.println("Error, multiplicacion por cero");
            return 0;
        }
        else {
            return numero1 * numero2;
        }
        
    }
    
    public int dividir() {
        if (numero1 == 0 || numero2 == 0) {
            
            System.out.println("Error, division por cero");
            return 0;
        }
        else {
            return numero1 * numero2;
        }
        
    }
        
}
