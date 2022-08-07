/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Dylan
 */
public class Libro {

    public int ISBN;
    public String titulo;
    public String autor;
    public int numeroPaginas;

    public Libro(int ISBN, String titulo, String autor, int numeroPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public Libro() {
    }
    
    public void cargarDatos() {
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese el titulo");
        titulo = read.nextLine();
        
        System.out.println("Ingrese el autor");
        autor = read.nextLine();
        
        System.out.println("Ingrese el ISBN");
        ISBN = read.nextInt();
        
        System.out.println("Ingrese numero de paginas");
        numeroPaginas = read.nextInt();
        
    }
    
    public void mostrarDatos() {
        
        System.out.println("ISNB: "+ISBN+ ", Titulo: "+titulo+ ", Autor: "+autor+ ", Numero de Paginas: " +numeroPaginas);
    }
            

}
