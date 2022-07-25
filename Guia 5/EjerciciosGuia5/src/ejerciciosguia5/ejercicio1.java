/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 */
package ejerciciosguia5;

import java.util.Scanner;

/**
 *
 * @author Dylan
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese 1er numero");
        int num1 = read.nextInt();
        
        System.out.println("Ingrese 2do numero");
        int num2 = read.nextInt();
        
        int suma = num1 + num2;
        
        System.out.println("La suma es: " + suma);
    }
    
}
