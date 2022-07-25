//Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
//usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.

package ejerciciosextras;

import java.util.Scanner;
/**
 *
 * @author Dylan
 */
public class ejercicio1 {

    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de minutos");
        int tiempo = read.nextInt();
        
        equivalencias(tiempo);
    }
    
    public static void equivalencias(int tiempo) {
        
        int cont = 0;
        int dias = tiempo / 60;
        
        while (dias >= 24) {
        
            if (dias >= 24) {
                cont++;
                dias = dias - 24;
            }
        } 
        
        int horas = dias;
        System.out.println(cont + " dias "+ horas + " horas");
    }
}
