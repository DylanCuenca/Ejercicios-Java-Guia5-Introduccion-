/*
 Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
altura. Se deberán además definir los métodos getters, setters y constructores
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.

 */
package pooej04;

import Entidad.Rectangulo;

/**
 *
 * @author Dylan
 */
public class PooEj04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Rectangulo rec1 = new Rectangulo();
        rec1.crearRectangulo();
        
        System.out.println("Superficie = " + rec1.superficie());
        System.out.println("Perimetro = " + rec1.perimetro());
        
        System.out.println("Dibujamos el rectángulo");
        System.out.println();
        
        rec1.dibujarRectangulo();
                
    }
    
}
