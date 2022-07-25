/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano
 */
package ejerciciosextras;

import java.util.Scanner;
/**
 *
 * @author Dylan
 */
public class ejercicio4 {

    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        
        System.out.println("Ingrese un número del 1 al 10");
        int num = read.nextInt();
        
        equivalenteRomano(num);
    }
    
    public static void equivalenteRomano(int num) {
        
        switch (num) {
            case 1:
                System.out.println("Su equivalente Romano es: I");
                break;
            case 2:
                System.out.println("Su equivalente Romano es: II");
                break;
            case 3:
                System.out.println("Su equivalente Romano es: III");
                break;
            case 4:
                System.out.println("Su equivalente Romano es: IV");
                break;
            case 5:
                System.out.println("Su equivalente Romano es: V");
                break;
            case 6:
                System.out.println("Su equivalente Romano es: VI");
                break;
            case 7:
                System.out.println("Su equivalente Romano es: VII");
                break;
            case 8:
                System.out.println("Su equivalente Romano es: VIII");
                break;
            case 9:
                System.out.println("Su equivalente Romano es: IX");
                break;
            case 10:
                System.out.println("Su equivalente Romano es: X");
                break;
            default:
                System.out.println("Numero fuera de Rango (1-10)");
                break;
        }
        
    }
}
