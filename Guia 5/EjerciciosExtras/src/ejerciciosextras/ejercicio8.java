/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
package ejerciciosextras;

import java.util.Scanner;
/**
 *
 * @author Dylan
 */
public class ejercicio8 {

    public static void main(String[] args) {
    
        lecturaDeNum();
        
    }
    
    public static void lecturaDeNum() {
        
        Scanner read = new Scanner(System.in);
        
        int leidos = 0, pares = 0, impares = 0;
        int num = 0;
        
        do {
            System.out.println("Ingrese un número");
            num = read.nextInt();
            
            if (num > 0) {
                
                leidos ++;
            }
            
            if (num % 2 == 0) { //numeros pares
                pares ++;
            }
            else {          // números impares
                impares ++; 
            }
            
            if (num % 5 == 0) { //multiplos de 5 cortan el bucle
                break;
            }
            
        } while (num != 0);
        
        System.out.println("Cantidad leídos = " + leidos);
        System.out.println("Números Pares = " + pares);
        System.out.println("Números Impares = " + impares);
        
        
        
    }
}
