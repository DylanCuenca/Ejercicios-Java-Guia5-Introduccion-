/*
Crear un programa que dado un numero determine si es par o impar
 */
package ejerciciosguia5;

import java.util.Scanner;

/**
 *
 * @author Dylan
 */
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese un numero para evaluar: ");
        int num = read.nextInt();
        
        if(parOimpar(num)){
            System.out.println("El numero es par");
        }
        else{
            System.out.println("El numero es impar");
        }
    }
    
    public static boolean parOimpar(int num){
       
        boolean logic = num % 2 == 0;
    
        return logic;
    }
    
    
}
