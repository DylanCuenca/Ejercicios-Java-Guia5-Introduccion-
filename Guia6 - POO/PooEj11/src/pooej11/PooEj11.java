/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
puede conseguir instanciando un objeto Date con constructor vacío.

Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package pooej11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Dylan
 */
public class PooEj11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese el año: ");
        int anio = read.nextInt();
        
        System.out.println("Ingrese el mes: ");
        int mes = read.nextInt();
        
        System.out.println("Ingrese el dia: ");
        int dia = read.nextInt();
        
        Date fecha = new Date(anio, mes, dia);
        Date fechaActual = new Date();
        
        System.out.println("Fecha cargada: " + fecha.getDate() +" "+ fecha.getMonth() +" "+fecha.getYear());
        
        System.out.println("Diferencia entre Fecha actual y fecha cargada: " + ((fechaActual.getYear() + 1900) - fecha.getYear()));
    }
    
}
