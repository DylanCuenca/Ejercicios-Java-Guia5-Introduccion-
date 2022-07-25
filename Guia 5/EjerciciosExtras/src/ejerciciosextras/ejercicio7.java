/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
 */
package ejerciciosextras;

import java.util.Scanner;
/**
 *
 * @author Dylan
 */
public class ejercicio7 {

    public static void main(String[] args) {
        
        //---primero con While
            usandoWhile();

        //---Segundo con Do While
            usandoDoWhile();
        
    }
    
    public static void usandoWhile() {
        
        Scanner read = new Scanner(System.in);
        int cont = 0;
        double aux = 0;
        double prom;
        
        System.out.println("¿Cuántos números desea ingresar?");
        int num = read.nextInt();
        
        int max = 0;
        int min = 999999999;
        
        while (num > cont ) {
            cont ++;
            System.out.println("ingrese un número: ");
            int n = read.nextInt();
            
            if (n > max) {
                max = n; //determinamos el valor maximo
            }
            if (n < min) {
                min = n; //determinamos el valor minimo
            }
            
            aux += n;
        }
        
        prom = aux / num;
        
        System.out.println("Promedio = " + prom);
        System.out.println("Valor Máximo = " + max);
        System.out.println("Valor Mínimo = " + min);
    }
    
    public static void usandoDoWhile() {
        
        Scanner read = new Scanner(System.in);
        
        int cont = 0;
        double aux = 0;
        double prom;
        
        System.out.println("¿Cuántos números desea ingresar?");
        int num = read.nextInt();
        
        int max = 0;
        int min = 999999999;
        
        do {
            cont ++;
            System.out.println("ingrese un número: ");
            int n = read.nextInt();
            
            if (n > max) {
                max = n; //determinamos el valor maximo
            }
            if (n < min) {
                min = n; //determinamos el valor minimo
            }
            
            aux += n;
        } while (num > cont );
        
        prom = aux / num;
        
        System.out.println("Promedio = " + prom);
        System.out.println("Valor Máximo = " + max);
        System.out.println("Valor Mínimo = " + min);
        
    }
}
