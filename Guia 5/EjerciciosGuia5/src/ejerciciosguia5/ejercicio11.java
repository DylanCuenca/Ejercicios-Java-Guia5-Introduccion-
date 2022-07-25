/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:
        MENU
        1. Sumar
        2. Restar
        3. Multiplicar
        4. Dividir
        5. Salir
        Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona e
 */
package ejerciciosguia5;

import java.util.Scanner;

/**
 *
 * @author Dylan
 */
public class ejercicio11 {

    public static void main(String[] args) {
        
         Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese 1er número: ");
        int num1 = read.nextInt();
       
        System.out.println("Ingrese 2do número: ");
        int num2 = read.nextInt();
        
        //--Llamamos al menú
            menu(num1, num2);
        
    }
    
    public static void menu(int num1, int num2) {
        Scanner read = new Scanner(System.in);
         String aux = "";
        
         do {
            System.out.println( "MENU\n" +
                                "1. Sumar\n" +
                                "2. Restar\n" +
                                "3. Multiplicar\n" +
                                "4. Dividir\n" +
                                "5. Salir\n" +
                                "Elija opción:");
            aux = read.nextLine();
            
            switch(aux) {
                case "1":
                    double suma = num1 + num2;
                    System.out.println("La suma es: " + suma);
                    break;
                case "2": 
                    double resta = num1 - num2;
                    System.out.println("La resta es: " + resta);
                    break;
                case "3": 
                    double multiplicacion = num1 * num2;
                    System.out.println("La multiplicacion es: " + multiplicacion);
                    break;
                case "4":
                    double division = num1 / num2;
                    System.out.println("La division es: " + division);
                    break;
                case "5": 
                    System.out.println("¿Seguro que desea salir? (S/N)");
                    
                    String confirma = read.nextLine();
                    confirma = confirma.toLowerCase();
                    
                        if(confirma.equals("s")) {
                            aux = "0";
                        }
                    break;
                default:
                    System.out.println("Ingrese una opcion válida.");
                    break;
            }    
        } while (!"0".equals(aux));
        
    }
    
}
