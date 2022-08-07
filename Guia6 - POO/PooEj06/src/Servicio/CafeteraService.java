package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Dylan
 */
public class CafeteraService {
    
    Scanner read = new Scanner(System.in);
    
    public Cafetera crearCafetera() {
        
        Cafetera cafeteraSv = new Cafetera();
        
        System.out.println("Ingrese la capacidad max. de la cafetera");
        cafeteraSv.setCapacidadMaxima(read.nextInt());
        
        System.out.println("Ingrese la cantidad actual de café");
        cafeteraSv.setCantidadActual(read.nextInt());
        
        return cafeteraSv;
    }
}
