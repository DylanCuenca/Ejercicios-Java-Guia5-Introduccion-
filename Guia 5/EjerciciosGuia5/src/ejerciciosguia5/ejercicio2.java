/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
 */
package ejerciciosguia5;

import java.util.Scanner;

/**
 *
 * @author Dylan
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Escribe tu nombre: ");
        String name = read.nextLine();
         
        System.out.println("Hola, " + name + " cómo estas?");
    }
    
}
