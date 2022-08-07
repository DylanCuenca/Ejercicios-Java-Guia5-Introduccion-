/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (���� = � ∗ ������).
e) Método perimetro(): para calcular el perímetro (��������� = � ∗ � ∗ �����).
 */
package pooej02;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Dylan
 */
public class PooEj02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner read = new Scanner(System.in);
            
            System.out.println("Circunferencia 1: ");
            Circunferencia circun1 = new Circunferencia(2); //Instanciamos
            
            circun1.area();
            circun1.perimetro();
            System.out.println();
            
            System.out.println("Circunferencia 2: ");
            Circunferencia circun2 = new Circunferencia(); //Instanciamos
            
            circun2.crearCircunferencia();
            
            circun2.area();
            circun2.perimetro();
    }
    
}
