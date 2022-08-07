/*
 Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package pooej01;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author Dylan
 */
public class PooEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Libro libro1 = new Libro(1234, "no se", "juan", 220);// Objerto con constructor con parametros
        
        Libro libro2 = new Libro();//Objeto 2 con contructor vacío
        libro2.cargarDatos();
        
        libro1.mostrarDatos();
        libro2.mostrarDatos();


    }

}
