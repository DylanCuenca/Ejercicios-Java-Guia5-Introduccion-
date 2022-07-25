/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package ejerciciosguia5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Dylan
 */
public class ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector: ");
        int tamaño = read.nextInt();
        int[] vector = new int [tamaño];
        
        crearVector(vector, tamaño);
        
        contabilizarNumeros(vector, tamaño);
        
    }
    
    public static void crearVector(int vector[],  int tamaño) {
        Random ran = new Random();
        
        for (int i = 0; i < tamaño; i++) {
            vector[i] = ran.nextInt((90000 - 1) + 1 );
            
        }
    }
    
    public static void contabilizarNumeros(int vector[], int tamaño) {
        
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        
        for (int i = 0; i < tamaño; i++) {
            
            String digitos = Integer.toString(vector[i]);
            
            switch (digitos.length()) {
                case 1:
                    cont1 ++;
                    break;
                case 2:
                    cont2 ++;
                    break;
                case 3:
                    cont3 ++;
                    break;
                case 4:
                    cont4 ++;
                    break;
                case 5:
                    cont5 ++;
                    break;
            }
        }
        
        System.out.println("N° con 1 digito: " + cont1 +
                        "\n N° con 2 digitos: " + cont2 + 
                        "\n N° con 3 digitos: " + cont3 + 
                        "\n N° con 4 digitos: " + cont4 + 
                        "\n N° con 5 digitos: " + cont5);
    }
    
}
