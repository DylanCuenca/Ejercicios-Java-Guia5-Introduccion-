/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial
 */
package ejerciciosguia5;

import java.util.Scanner;

/**
 *
 * @author Dylan
 */
public class ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

            Scanner read = new Scanner (System.in);
        
        System.out.println("Ingrese un valor limite");
        int limit = read.nextInt();
        int acum = 0;
       
        do {
            System.out.println("Ingrese un numero para sumar");
            int num = read.nextInt();
            
            acum += num;
            System.out.println("acum = " + acum);
        } while (acum < limit);
        
    }
    
}
