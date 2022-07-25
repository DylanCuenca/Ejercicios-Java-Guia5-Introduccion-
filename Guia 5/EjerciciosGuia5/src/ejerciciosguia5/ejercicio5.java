/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
package ejerciciosguia5;

import java.util.Scanner;

/**
 *
 * @author Dylan
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner read = new Scanner(System.in);
        
        int doble;
        int triple;
        double raiz;
        
        System.out.println("Ingrese un n° entero: ");
        int num = read.nextInt();
        
        doble = num * 2;
        triple = num * 3;
        raiz = Math.sqrt(num);
        
        System.out.println("El doble es: " + doble + ", el triple es: " + triple + ", la raiz cuadrada es: " + raiz);
    }
    
}
