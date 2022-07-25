/*
Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
 */
package ejerciciosextras;

import java.util.Scanner;
/**
 *
 * @author Dylan
 */
public class ejercicio13 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese la altura de la escalera: ");
        int altura = read.nextInt();
        
        escalera(altura);
        
    }
    
    public static void escalera(int altura) {
        
        for (int i = 0; i <= altura; i++) 
        {
            
            for (int j = 0; j < i; j++) 
            {
                System.out.print(j+1);
            }
            System.out.println();
            
        }
    }
}
