/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pass;
import java.util.Scanner;

/**
 *
 * @author Dylan
 */
public class PassService {
    
    Scanner read = new Scanner(System.in);
    
    public Pass datos() {
        
        Pass datos1 = new Pass("Dylan Cuenca", 43489222);
        
        return datos1;
    }
    
    public void crearPass(Pass pass) {
        
        String contraseña = "";
        
        System.out.println("Ingrese contraseña");
        do {
            contraseña = read.next();
            
            if (contraseña.length() < 10) {
                
                System.out.println("Contraseña muy corta, debe ser de 10 caracteres");
            }
            else if (contraseña.length() > 10) {
                
                System.out.println("Contraseña muy larga, debe ser de 10 caracateres");
            }
            
        } while (contraseña.length() != 10);
        
        if (contraseña.length() == 10) {
            pass.setPass(contraseña);
            System.out.println("Contraseña Guardada");
        }
    }
    
    public void analizarPass(Pass pass) {
        
        int cont = 0;
        int cont2 = 0; 
        
        for (int i = 0; i < pass.getPass().length(); i++) {
            
            if (pass.getPass().substring(i, i+1).equalsIgnoreCase("z")) {
                
                cont ++;
            }
            if (pass.getPass().substring(i, i+1).equalsIgnoreCase("a")) {
                cont2 ++;
            }
        }
        
        if (cont >= 1 && cont2 >= 2 ) {
            
            System.out.println("Contraseña de nivel ALTO");
        }
        else if (cont == 1) {
            System.out.println("Contraseña de nivel MEDIO");
        }
        else {
            System.out.println("Contraseña de nivel BAJO");
        }
    }
    
    public void modificarNombre(Pass pass) {
        
        System.out.println("Ingrese contraseña para continuar");
        String passAux = read.next();
        
        if (passAux.equals(pass.getPass())) {
            
            System.out.println("Ingrese nuevo nombre:");
            pass.setNombre(read.next());
            System.out.println("Nuevo nombre guardado");
        }
        else {
            
            System.out.println("Contraseña incorrecta, acceso DENEGADO.");
        }
    }
    
    public void modificarPass(Pass pass) {
        
        System.out.println("Ingrese contraseña para continuar");
        String passAux = read.next();
        
        if (passAux.equals(pass.getPass())) {
            
            System.out.println("Nueva contraseña:");
            crearPass(pass);
        }
        else {
            
            System.out.println("Contraseña incorrecta, acceso DENEGADO.");
        }
    }
    
    public void menu() {
        
        Pass pass1 = datos();
        crearPass(pass1);
        
        String aux = "";
        do {
            
            System.out.println("//--Menú de opciones--// \n" +
                                "A - Nivel de contraseña \n" +
                                "B - Modificar Contraseña \n" +
                                "C - Modificar nombre \n" +
                                "D - Salir");
            aux = read.next().toUpperCase();
            
            switch (aux) {
                case "A":
                        analizarPass(pass1);
                    break;
                case "B":
                        modificarPass(pass1);
                    break;
                case "C":
                        modificarNombre(pass1);
                    break;
                case "D":
                        System.out.println("//--Fin--//");
                    break;
                default:
                        System.out.println("Opción inválida");
                    break;
            }
        } while (!aux.equals("D"));
    }
}
