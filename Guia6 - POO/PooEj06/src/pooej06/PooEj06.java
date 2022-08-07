/*
            Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
            (la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
            actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
            • Constructor predeterminado o vacío
            • Constructor con la capacidad máxima y la cantidad actual
            • Métodos getters y setters.
            • Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
            • Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
            tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
            cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
            método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
            cuanto quedó la taza.
            • Método vaciarCafetera(): pone la cantidad de café actual en cero.
            • Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
            recibe y se añade a la cafetera la cantidad de café indicada.
 */
package pooej06;

import Entidad.Cafetera;
import Servicio.CafeteraService;
import java.util.Scanner;

/**
 *
 * @author Dylan
 */
public class PooEj06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        CafeteraService cafeSv = new CafeteraService();
        
        Cafetera cafetera1 = cafeSv.crearCafetera();
        
        cafetera1.llenarCafetera();

        int op = 0;
        
        do {
            System.out.println("Opciones: \n" +
                                "1. Llenar Cafetera \n" +
                                "2. Servir taza \n" +
                                "3. Vaciar Cafetera \n" +
                                "4. Agregar Café \n" +
                                "5. Fin");
            op = read.nextInt();
            
            switch (op) {
                case 1:
                        cafetera1.llenarCafetera();
                    break;
                case 2:
                        System.out.println("Ingrese el tamaño de la taza: ");
                        cafetera1.servirTaza(read.nextInt());
                        
                        System.out.println("Queda " + cafetera1.getCantidadActual() + " de café en la cafetera.");
                    break;
                case 3: 
                        cafetera1.vaciarCafetera();
                    break;
                case 4:
                        System.out.println("Ingrese la cantidad de café: ");
                        cafetera1.agregarCafe(read.nextInt());
                    break;
            }
            
            
        } while (op != 5);
        
    }
    
}
