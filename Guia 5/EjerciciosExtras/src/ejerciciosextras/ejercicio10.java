/*
            Realice un programa para que el usuario adivine el resultado de una multiplicación entre
            dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
            si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
            al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
            utilizar la función Math.random() de Java.
 */
package ejerciciosextras;

import java.util.Scanner;
/**
 *
 * @author Dylan
 */
public class ejercicio10 {

    public static void main(String[] args) {
        
        System.out.println("Se multiplicaran dos numeros entre el 0 al 10 \n" +
                           "Tienes que adivinar el resultado!!");
        
        System.out.println("//-------------Número listo--------------//");
        System.out.println();
        
        int numAdivinar = generarNumero();
        
        adivinarNum(numAdivinar);
        
    }
    
    public static int generarNumero() {
        
        int num;
        int aa = (int)(Math.random() * 10);
        int bb = (int)(Math.random() * 10);
        num = aa * bb;
        
        return  num;
    }
    
    public static void adivinarNum(int numAdivinar) {
        Scanner read = new Scanner(System.in);
        
        int adiv = 0;
        
            System.out.println("¿Cúal es el resultado de la multiplicación?");
        do {
            adiv = read.nextInt();
            
            if (adiv == numAdivinar) 
                System.out.println("CORRECTO!!");
            else 
                System.out.println("Incorrecto :( ");
            
        } while (adiv != numAdivinar);
        
        
    }
}
