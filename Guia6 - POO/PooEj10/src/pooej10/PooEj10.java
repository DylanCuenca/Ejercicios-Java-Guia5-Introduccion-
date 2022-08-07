/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
package pooej10;

import Entidad.Arreglo;
import java.util.Arrays;

/**
 *
 * @author Dylan
 */
public class PooEj10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Arreglo a = new Arreglo();
        Arreglo b = new Arreglo();
        
        
        float[] vec1 = new float[a.getVector1().length];//el de 50 elementos
        float[] vec2 = new float[a.getVector2().length];//el de 20 elementos
        
        for (int i = 0; i < a.getVector1().length; i++) { //inicializamos el vector 1
            
            vec1[i] = (float)Math.random()*10;
        }
        a.setVector1(vec1);
        
        System.out.println(Arrays.toString(a.getVector1()) + "\n"); //mostramos vector 1
        
        Arrays.sort(a.getVector1());//ordenamos vector 1
        
        
        for (int i = 0; i < 10; i++) { //inicializamos el vector 2
            
           vec2[i] = vec1[i];
        }
        
        float aux = (float) 0.5;
        Arrays.fill(vec2, 10,20,aux); //combinamos el arreglo 2
        b.setVector2(vec2);
        
        System.out.println("Arreglo ordenado");
        System.out.println(Arrays.toString(a.getVector1()) + "\n");
        
        System.out.println("Arreglo combinado");
        System.out.println(Arrays.toString(b.getVector2()) + "\n");
    }
    
}
