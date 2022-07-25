/*
Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
 */
package ejerciciosextras;

import java.util.Scanner;
/**
 *
 * @author Dylan
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese su tipo de Socio (A, B, C)");
        String tipo = read.next();
        
        System.out.println("Ingrese el valor del tratamiento a pagar: ");        
        int valor = read.nextInt();
        
        descuentos(tipo, valor);
        
    }
    
    public static void descuentos(String tipo, int valor) {
        int precio;
        switch (tipo) {
            case "A":
                precio = valor - ((valor * 50) / 100);
                System.out.println("El precio con descuento, para socio de tipo A es: " + precio);
                break;
            case "B":
                precio = valor - ((valor * 35) / 100);
                System.out.println("El precio con descuento, para socio de tipo B es: " + precio);
                break;
            case "C":
                precio = valor;
                System.out.println("El precio para socio de tipo B es: " + precio);
                break;
            default:
                System.out.println("Ingrese una opcion válida.");
                break;
        }
    }
}
