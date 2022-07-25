/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package ejerciciosguia5;

import java.util.Scanner;

/**
 *
 * @author Dylan
 */
public class ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del cubo");
        int num = 0;
        do {
            num = read.nextInt();
            if (num >10 || num == 0) 
                System.out.println("N° fuera de limite(1-10)");
            
        } while (num >10 || num == 0);
        
        int[][] cubo = new int[num][num]; //Creamos Matriz
        
        
        int sumaDiagP = 0, sumaDiagS = 0;
        int[] filas = new int[num], columnas = new int[num]; //Vectores aux para guardar las sumas(filas y columnas)
        
        System.out.println("Ingrese los numeros del cubo");
        rellenoMatriz(cubo, num);
        
        mostrarMatriz(cubo, num);
        
        sumaDiagP = sumaDiagP(sumaDiagP, cubo, num);//Asignamos los valores de las sumas de diagonales
        sumaDiagS = sumaDiagS(sumaDiagS, cubo, num);
        
        sumaFilas(filas, cubo, num);
        
        sumaColumnas(columnas, cubo, num);
        
        comprobar(filas, columnas, num, sumaDiagP, sumaDiagS); //Verificamos si el cubo es magico o no
    }
    
    
    public static void rellenoMatriz(int cubo[][], int num) {
        Scanner read = new Scanner(System.in);
        
        for (int i = 0; i < num; i++) 
        {
            for (int j = 0; j < num; j++)
            {
                do {
                    cubo[i][j] = read.nextInt();
                    
                    if (cubo[i][j] > 9 || cubo[i][j] < 1) {
                        
                        System.out.println("N° fuera de rango(1-9)");
                    }
                            
                } while (cubo[i][j] > 9 || cubo[i][j] < 1);
            }
        }
        
    }
    
    
    public static void mostrarMatriz(int cubo[][], int num) {
        
        for (int i = 0; i < num; i++) 
        {
            for (int j = 0; j < num; j++)
            {
                System.out.print("[ " + cubo[i][j] + "] ");
            }
            System.out.println();
        }
    }
    
    
    public  static int sumaDiagP(int sumaDiagP, int cubo[][], int num) { //Diagonal principal
        
        for (int i = 0; i < num; i++) {
            sumaDiagP += cubo[i][i];
        }
        
        return sumaDiagP;
    }
    
    
    public static int sumaDiagS(int sumaDiagS, int cubo[][], int num) { //Diagonal Secundaria
        int aux = num-1;
        
        for (int i = 0; i < num; i++) {
            sumaDiagS += cubo[i][aux];
            aux --;
        }
        return sumaDiagS;
    }
    
    
    public static void sumaFilas(int filas[], int cubo [][], int num) { //sumamos las filas
        
        for (int i = 0; i < num; i++) 
        {
            for (int j = 0; j < num; j++) 
            {
                filas[i] += cubo[i][j];
            }
        }
    }
    
    
    public static void sumaColumnas(int columnas[], int cubo [][], int num) { //sumamos las columnas
        
        for (int i = 0; i < num; i++) 
        {
            for (int j = 0; j < num; j++) 
            {
                columnas[i] += cubo[j][i];
            }
        }
    }
    
    
    public static void comprobar(int filas[], int columnas[], int num, int sumaDiagP, int sumaDiagS) {
        
        int cont = 0;
        
        for (int i = 0; i < num; i++) {
            
            if (filas[i] == columnas[i]) {
                cont++;
            }
        }
        
        if(cont == num && sumaDiagP == sumaDiagS) {
            System.out.println("FELICIDADES PERRI, ES UN CUBO MÁGICO :D");
        }
        else {
            System.out.println("Faa, no es un cubo mágico..");
        }
    }
    
}
