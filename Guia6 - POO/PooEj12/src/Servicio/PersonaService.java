/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Dylan
 */
public class PersonaService {
    
    Scanner read = new Scanner(System.in);
    
//      Persona personaReal = new Persona();
    
    public Persona crearPErsona() {
        
        Persona persona1 = new Persona();
        
        System.out.println("Ingrese el nombre:");
        persona1.setNombre(read.nextLine());
        
        System.out.println("Ingrese fecha de nacimiento: ");
        System.out.println("Año: ");
        int anio = read.nextInt();
        
        System.out.println("Mes: ");
        int mes = read.nextInt();
        
        System.out.println("Dia: ");
        int dia = read.nextInt();
        
        Date fechaNacimiento = new Date(anio, mes, dia);
        persona1.setFechaNAcimiento(fechaNacimiento);
        
        return persona1;
    }
    
    public void calcularEdad(Persona personaReal) {
        
        Date fechaActual = new Date();
        
        System.out.println("La edad es: " + ((fechaActual.getYear() + 1900) - personaReal.getFechaNAcimiento().getYear()));
        
    }
    
    public boolean menorQue(Persona personaReal, int edad) {
        
         Date fechaActual = new Date();
         
         int edadPersona = (fechaActual.getYear() + 1900) - personaReal.getFechaNAcimiento().getYear();
         
         return edadPersona < edad;
    }
    
    public void mostrarPersona(Persona personaReal) {
        
        System.out.println("Nombre: " + personaReal.getNombre());
        System.out.println("Fecha de nacimiento: " + (personaReal.getFechaNAcimiento().getDay()) +" "+ (personaReal.getFechaNAcimiento().getMonth()) +" "+(personaReal.getFechaNAcimiento().getYear()));
    }

}
