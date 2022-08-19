
package ejercicio05_extraextra;

import Entidad.Isoceles;
import Servicios.IsocelesServicio;

public class Ejercicio05_ExtraExtra {

    public static void main(String[] args) {
        
        IsocelesServicio ts1 = new IsocelesServicio();
        
        Isoceles[] t1 = ts1.crearArreglo();
        
        for (Isoceles isoceles : t1) {
            
            System.out.println("El area del triangulo es de: " + ts1.area(isoceles));
            ts1.perimetro(isoceles);
            
        }
        
        ts1.areaMayor(t1);
        
    }
    
}
