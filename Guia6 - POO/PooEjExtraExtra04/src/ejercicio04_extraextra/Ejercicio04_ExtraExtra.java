
package ejercicio04_extraextra;

import Entidad.Fecha;
import Servicios.FechaServicio;

public class Ejercicio04_ExtraExtra {

    public static void main(String[] args) {
        
        FechaServicio fs1 = new FechaServicio();
        
        Fecha f1 = fs1.crearFecha();
        
        fs1.cantDias(f1);
        fs1.diaAnterior(f1);
        fs1.anioBisiesto(f1);
    }
    
}