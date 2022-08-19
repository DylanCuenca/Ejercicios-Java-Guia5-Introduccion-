/*
Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.

 */
package pooejextraextra01;

import Servicio.FraccionService;

/**
 *
 * @author Dylan
 */
public class PooEjExtraExtra01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FraccionService frac = new FraccionService();
        frac.menu();
    }
    
}
