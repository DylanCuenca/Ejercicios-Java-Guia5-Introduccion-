/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €
 */
package ejerciciosguia5;

import java.util.Scanner;

/**
 *
 * @author Dylan
 */
public class ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese el tipo de moneda a convertir: ");
        String moneda = read.nextLine();
        
        System.out.println("Ingrese La cantidad de Euros que desea convertir: ");
        int cant = read.nextInt();
        
        swap(cant, moneda);
    }
    
    public static void swap(int cant, String moneda){
        
        switch (moneda) {
            case "dolares":
                double dolares = cant * 1.28611;
                System.out.println("Dolares = " + dolares);
                break;
            case "libras":
                double libras = cant * 0.86;
                System.out.println("Libras = " + libras);
                break;
            case "yenes":
                double yenes = cant * 129.852;
                System.out.println("Yenes = " + yenes);
                break;
        }    
    }
    
}
