/*
 . Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división. Nota: recordar que las variables de tipo entero truncan los números o
resultados
 */
package ejerciciosextras;

import java.util.Scanner;
/**
 *
 * @author Dylan
 */
public class ejercicio11 {

    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        
        System.out.println("Ingrese el número(entero) a analizar: ");
        int num = read.nextInt();
        
        int cantDigitos = digitos(num);
        
        System.out.println("El número se compone con: " + cantDigitos + " digitos.");
        
    }
    
    public static int digitos(int num) {
        
        int cont = 0;
        
        do {
            num = num /10;
            cont ++;            //Por c/division es un digito que se cuenta
            
        } while (num != 0);
        
        return cont;
    }
    
}
