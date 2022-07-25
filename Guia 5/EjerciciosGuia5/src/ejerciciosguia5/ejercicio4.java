/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package ejerciciosguia5;

import java.util.Scanner;

/**
 *
 * @author Dylan
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner read = new Scanner(System.in);
        double gradosF;
        
        System.out.println("Ingrese los C°: ");
        double gradosC = read.nextDouble();
        
        gradosF = 32 + (9 * gradosC / 5);
        
        System.out.println("El equivalente en F° es: " + gradosF + " F°");
    }
    
}
