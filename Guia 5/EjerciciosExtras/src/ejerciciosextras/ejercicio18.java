/*
Realizar un programa que complete un vector con los N primeros números de la sucesión
de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de los siguientes
números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente…
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una función que reciba
como parámetro el valor de “n” y que calcule la serie hasta llegar a ese valor.
Para conocer más acerca de la serie de Fibonacci consultar el siguiente link:
https://quantdare.com/numeros-de-fibonacci/
 */
package ejerciciosextras;

import java.util.Scanner;
/**
 *
 * @author Dylan
 */
public class ejercicio18 {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("¿Cuantos números de la serie de Fibonacci desea ver?");
        int n = read.nextInt();
        
        int[] vector = new int[n];
        
        cargarVector(n, vector);
        
        mostrarVector(n, vector);
        
    }
    
    public static void cargarVector(int n, int vector[]) {
        int valorActual = 0;
        int sigValor = 1;
        int aux = 0;
        
        for (int i = 0; i < n; i++) {
            
            aux = valorActual;
            valorActual = sigValor;
            sigValor = aux + valorActual;
            
            vector[i] = sigValor;
        }
    }
    
    public static void mostrarVector(int n, int vector[]) {
        
        for (int i = 0; i < n; i++)
        {
            System.out.print("["+vector[i]+"] ");
        }
        System.out.println();
    }
    
}
