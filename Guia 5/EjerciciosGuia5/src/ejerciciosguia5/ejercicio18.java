/*
 Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
 */
package ejerciciosguia5;

import java.util.Random;

/**
 *
 * @author Dylan
 */
public class ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][] vector = new int[4][4]; 
        
        rellenoMatriz(vector);
        
        System.out.println("Matriz normal:");
        mostrarMatriz(vector);
        
        System.out.println("Matriz Traspuesta: ");
        matrizTraspuesta(vector);
        
    }
    
    public static void rellenoMatriz(int vector [][]) {
        Random random = new Random();
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                vector[i][j] = random.nextInt(10);
            }
        }
    }
    
    public static void mostrarMatriz(int vector[][]) {
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
            System.out.print(" " + vector[i][j] + " "); 
            }
            System.out.println();
        }
    }
    
    public static void matrizTraspuesta(int vector [][]) {
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
            System.out.print(" " + vector[j][i] + " "); 
            }
            System.out.println();
        }
    }
    
}
