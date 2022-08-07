/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Dylan
 */
public class PersonaService {
    
    Scanner read = new Scanner(System.in);
    
    public Persona crearPersona() {
        
        Persona personaSv = new Persona();
        
        System.out.println("Ingrese Nombre: ");
        personaSv.setNombre(read.next());
        
        System.out.println("Ingreso su Sexo: ");
        String sexo = "";
        
        do {
            sexo = read.next();
            if (sexo.equals("h") || sexo.equals("m") || sexo.equals("o")) {
                personaSv.setSexo(sexo);
                break;
            }
            else {
                System.out.println("Ingrese 'h'(hombre), 'm'(mujer), 'o'(otro)");
            }
            
        } while (!sexo.equals("h") || !sexo.equals("m") || !sexo.equals("o"));
        
        System.out.println("Ingrese Edad: ");
        personaSv.setEdad(read.nextInt());
        
        System.out.println("Ingrese su Peso: ");
        personaSv.setPeso(read.nextFloat());
        
        System.out.println("Ingrese su Altura: ");
        personaSv.setAltura(read.nextFloat());
        
        return personaSv;
    }
    
    public int calcularIMC(float peso, float altura) {
        
        float IMC = (float) (peso / (Math.pow(altura, 2)));
        
        if (IMC < 20) {
            return -1;
        }
        else if (IMC > 20 && IMC < 25) {
            return 0;
        }
        else if (IMC > 25) {
            return 1;
        }
        
        return 100;
    }
    
    public boolean esMayorDeEdad(int edad) {
        
        return (edad >18);
    }
}
