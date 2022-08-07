
package Entidad;

import static java.lang.Math.abs;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.sqrt;

/**
 *
 * @author Dylan
 */
public class Matematica {
    
    private double num1;
    private double num2;
    

    //---CONSTRUCTORES
    public Matematica() {
    }

    public Matematica(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    //---GETTERS & SETTERS
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    //---METODOS
        public double devolverMayor() {
        if (num1 < num2) {
            return num2;   
        }
        else {
            return num1;
        }
    }
    
    public void calcularPotencia () {
        
        double max = max(num1, num2);
        double min = min(num1, num2);
        
        int potencia = (int)Math.pow(max, min);
        System.out.println("La potencia es: " + potencia);
    }
    
    public void calcularRaiz() {
        double valorAb = abs(min(num1, num2)); 
        
        System.out.println("La raiz cuadrada es: " + sqrt(valorAb));
    }
    
    
    
}
