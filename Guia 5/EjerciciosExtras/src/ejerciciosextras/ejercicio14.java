/*
 Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
de hijos para averiguar la media de edad de los hijos de todas las familias.
 */
package ejerciciosextras;

import java.util.Scanner;
/**
 *
 * @author Dylan
 */
public class ejercicio14 {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de familias: ");
        int familias = read.nextInt();
        
        System.out.println("Ingrese la cantidad de hijos por familia: ");
        int hijos = read.nextInt();
        
        int[][] matriz = new int[familias][hijos];
        
        
        cargarEdades(familias, hijos, matriz);
        
        edadesMedias(familias, hijos, matriz);
        
    }

    public static void cargarEdades (int familias, int hijos, int matriz[][]) {
        
        Scanner read = new Scanner(System.in);
        
        for (int i = 0; i < familias; i++) 
        {
            System.out.println("Familia "+(i+1) );
            for (int j = 0; j < hijos; j++) 
            {
                System.out.println("Ingrese edad del hijo n° "+(j+1)+ ": ");
                matriz[i][j] = read.nextInt();
            }
        }
    }
    
    public static void edadesMedias(int familias, int hijos, int matriz[][]) {
        
        int prom;
        
        for (int i = 0; i < familias; i++)
        {
            int aux = 0;
            for (int j = 0; j < hijos; j++)
            {
                aux += matriz[i][j];
            }
            
            prom = aux / hijos;
            System.out.println("La edad media de los hijos de la familia n° "+(i+1)+ " es: " + prom);
        }
    }
}
