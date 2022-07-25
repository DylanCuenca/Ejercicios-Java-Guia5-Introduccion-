/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.
 */
package ejerciciosguia5;

import java.util.Scanner;

/**
 *
 * @author Dylan
 */
public class ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        String clave = "eureka";
        
        System.out.println("Ingrese contraseña: ");
        logic (clave);
       
    }
    
    public static void logic (String clave){
        Scanner read = new Scanner(System.in);
        String frase = read.nextLine();
   
        if(frase.equals(clave)){
            System.out.println("Correcto");
        }
        else {
            System.out.println("Incorrecto");
        }
    }
    
}
