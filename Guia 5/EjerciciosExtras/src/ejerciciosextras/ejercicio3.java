/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */
package ejerciciosextras;

import java.util.Scanner;
/**
 *
 * @author Dylan
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese una letra!");
        String letra = read.next();
        
        deteccionVocal(letra);
    }
    
    public static void deteccionVocal(String letra) {
        
        letra = letra.toLowerCase();
                
        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
            
            System.out.println("La letra es una vocal!!");
        }
        else {
            System.out.println("La letra no es una vocal :c");
        }
    }
    
}
