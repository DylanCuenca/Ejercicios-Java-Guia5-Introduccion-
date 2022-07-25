/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.
 */
package ejerciciosextras;

import java.util.Scanner;
/**
 *
 * @author Dylan
 */
public class ejercicio15 {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese el 1er número: ");
        int num1 = read.nextInt();
        
        System.out.println("Ingrese el 2do número: ");
        int num2 = read.nextInt();
        
        System.out.println();
        System.out.println("¿Qué operación desea realizar? \n" + 
                           "1 - Sumar \n" +
                           "2 - Restar \n" +
                           "3 - Multiplicar \n" +
                           "4 - Dividir \n" +
                           "5 - Salir");
        
        menu(num1, num2);
        
    }
    
    public static void menu(int num1, int num2) {
        Scanner read = new Scanner(System.in);
        
        
        int opcion = 0;
        do {
            opcion = read.nextInt();
            switch (opcion) {
                case 1:
                        int suma = suma(num1, num2);
                        System.out.println("Resultado de suma = " + suma);
                    break;
                case 2:
                        int resta = resta(num1, num2);
                        System.out.println("Resultado de resta = " + resta);
                    break;
                case 3:
                        int multip = multiplicar(num1, num2);
                        System.out.println("Resultado de multiplicar = " + multip);
                    break;
                case 4:
                        double dividir = dividir(num1, num2);
                        System.out.println("Resultado de dividir = " + dividir);
                    break;
                case 5:
                        System.out.println("//--- Salida con éxito ---//");
                    break;
                default:
                        System.out.println("Ingrese una opcion valida");
                    break;
            }
            
        } while ( opcion == 0 );
        
    }
    
    //------Operaciones------//
    public static int suma(int num1, int num2) {
        
        int result = num1 + num2;
        return result;
    }
    
    public static int resta(int num1, int num2) {
        
        int result = num1 - num2;
        return result;
    }
    
    public static int multiplicar(int num1, int num2) {
        
        int result = num1 * num2;
        return result;
    }
    
    public static double dividir(int num1, int num2) {
        
        double result = num1 / num2;
        return result;
    }
}
