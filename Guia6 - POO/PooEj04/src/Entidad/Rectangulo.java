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
public class Rectangulo {
    
    private int base;
    private int altura;

    public Rectangulo() {
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
    //--Metodos
    
    public void crearRectangulo() {
        Scanner read = new Scanner(System.in);
       
        System.out.println("Ingrese la base para el rectángulo: ");
        base = read.nextInt();
        
        System.out.println("Ingrese la altura para el rectángulo: ");
        altura = read.nextInt();
        
    }
    
    public int superficie() {
        
        int sup = base * altura;
        return sup;
    }
    
    public int perimetro() {
        
        int per = (base + altura) * 2;
        return per;
    }
    
    public void dibujarRectangulo () {
        
        for (int i = 0; i < altura; i++)
        {
            for (int j = 0; j < base; j++)
            {
                System.out.print(" *");
            }
            System.out.println("");
        }
        
    }
    
}
