/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package ejerciciosguia5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Dylan
 */
public class ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        int num = read.nextInt();
        int[] vector = new int[num];
        
        rellenoVector(vector, num);
        
        mostrarVector(vector, num);
        
        System.out.println("Escriba un numero que desee buscar: ");
        int nBuscar = read.nextInt();
        
        buscarNumero(nBuscar, num, vector);

    }
    
    public static void rellenoVector(int vector[], int num) {
        Random numero = new Random();
        for (int i = 0; i < num; i++) {
            
            vector[i] = numero.nextInt(1+8 ) ;
        }
    }
    
    public static void buscarNumero(int nBuscar, int num, int vector[]) {

        int repite = 0;
        for (int i = 0; i < num; i++) {
            
            if(vector[i] == nBuscar && repite < 1) {
                
                System.out.println("El numero se encuentra en la posicion: " + i);
                repite += 1;
            }
            else if(vector[i] == nBuscar && repite >= 1) {
                System.out.println("También en la posicion: " + i);
            }
        }
        
        if(repite >= 1) {
                System.out.println("Se repite " + repite + " veces.");
            }
    }
    
    public static void mostrarVector(int vector[], int num) {
        
        for (int i = 0; i < num; i++) {
            if(i < num-1){
                System.out.print(vector[i] + ", ");
            }
            else{
                System.out.print(vector[i] );
            }
        }
        System.out.println();
    }
    
}
