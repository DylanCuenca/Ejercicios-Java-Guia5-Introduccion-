/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random().
 */
package ejerciciosextras;

import java.util.Scanner;
/**
 *
 * @author Dylan
 */
public class ejercicio17 {

    public static void main(String[] args) {
        String[][] sopa = new String[20][20];
        
        System.out.println("//----Sopa de letras para niños----//");
        
        System.out.println("Ingrese palabras de minimo 3 y hasta 5 caracteres:");
        armarSopa(sopa);
        
        rellenoNumeros(sopa);
        
        mostrarSopa(sopa);
        
    }
    
    public static void armarSopa(String sopa[][]) {
        Scanner read = new Scanner(System.in);
        String aa;
        int random;
        
        for (int i = 0; i < 5; i++) 
        {
            aa = read.next();
            random = (int)(Math.random()*20);
            
                for (int j = 1; j <= aa.length(); j++)
                {   
                    if(j == 1) {                            //si se repite la posicion, la cambiamos por otra distinta
                        while (" ".equals(sopa[random][0])) {
                            random = (int)(Math.random()*20); 
                        }
                    }
                    sopa[random][0] = " "; //identificador de palabra para que no se repita
                    sopa[random][j] = aa.substring(j-1, j);
                }
        }
    }
    
    public static void rellenoNumeros (String sopa[][]) {
        
        for (int i = 0; i < 20; i++)
        {
            for (int j = 0; j < 20; j++) 
            {
                if (sopa[i][j] == null || sopa[i][j].equals(" ")) {
                    
                    int aleatorios = (int)(Math.random()*9);
                    String aux = Integer.toString(aleatorios);
                    sopa[i][j] = aux;
                }
            }
        }
    }
    
    public static void mostrarSopa(String sopa[][]) {
        
        for (int i = 0; i < 20; i++)
        {
            for (int j = 0; j < 20; j++)
            {
                System.out.print(" " + sopa[i][j] + " ");
            }
            System.out.println();
        }
    }
}
