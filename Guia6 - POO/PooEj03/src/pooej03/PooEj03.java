/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en
los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si
no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 */
package pooej03;

import Entidad.Operacion;

/**
 *
 * @author Dylan
 */
public class PooEj03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Operacion op1 = new Operacion();
        
        op1.crearOperacion();
        
        System.out.println("Operacion 1:");
        System.out.println("Suma = " + op1.sumar());
        System.out.println("Resta = " + op1.restar());
        
        System.out.println();
        Operacion op2 = new Operacion(2, 0);
        
        System.out.println("Operacion 2:");
        System.out.println("Multiplicacion: " + op2.multiplicar());
        System.out.println("Division: " + op2.dividir());
        
        
    }
    
}
