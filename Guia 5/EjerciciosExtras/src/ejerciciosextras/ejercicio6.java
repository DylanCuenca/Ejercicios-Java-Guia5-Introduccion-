/*
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general
 */
package ejerciciosextras;

import java.util.Scanner;
/**
 *
 * @author Dylan
 */
public class ejercicio6 {

    public static void main(String[] args) {
        
        promedios();
        
    }
    
    public static void promedios() {
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de personas a medir:");
        int personas = read.nextInt();
        
        double promGeneral = 0;
        double promDebajo = 0;
        double estatura;
        int cont = 0;
        
        
        for (int i = 0; i < personas; i++) 
        {
            System.out.println("Ingrese la estatura la persona "+(i+1));
            estatura = read.nextDouble();
            
            promGeneral += estatura;
            
            if (estatura < 1.60) {
                promDebajo += estatura;
                cont ++;
            }
        }
        
        promGeneral = promGeneral/personas;
        promDebajo = promDebajo/cont;
        
        System.out.println("El promedio general de estaturas es: " + promGeneral + " mts");
        if (cont >= 1) {
            System.out.println("El promedio de personas por debajo de 1.60 mts es: " + promDebajo + " mts");
        }
        
    }
}
