
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Dylan
 */
public class Circunferencia {

    private double radio;

    //---Constructores
    public Circunferencia(double radio) {
        this.radio = radio;
    }
    public Circunferencia(){
    }

    //---Setters y getters
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    //---Métodos
    public void crearCircunferencia () {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese el valor del radio: ");
        radio = read.nextInt();
        
    }
    public void area() {
        double area;
        
        area = 2 * Math.PI * Math.pow(radio, 2);
        System.out.println("Area: " + area);
    }
    
    public void perimetro() {
        
        double perimetro = 2 * Math.PI * radio;
        System.out.println("Perimetro" + perimetro);;
    }
    
}
