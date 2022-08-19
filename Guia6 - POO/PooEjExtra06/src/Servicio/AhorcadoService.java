/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author Dylan
 */
public class AhorcadoService {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Ahorcado crearJuego() {

        Ahorcado a = new Ahorcado();

        System.out.println("Ingrese la palabra para jugar");
        String palabra = read.next().toUpperCase();

        System.out.println("Ingrese la cantidad de jugadas máximas");
        a.setJugadasMax(read.nextInt());

        String[] aux = new String[palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {

            aux[i] = palabra.substring(i, i + 1);
        }

        a.setPalabra(aux);
        a.setLetrasEncontradas(0);

        return a;
    }

    public void mostrarLoingitud(Ahorcado a) {

        System.out.println("Palabra de: " + a.getPalabra().length + " letras \n");

    }

    public void buscarLetra(Ahorcado a, String letra) {

        int cont = 0;

        for (int i = 0; i < a.getPalabra().length; i++) {

            if (letra.equalsIgnoreCase(a.getPalabra()[i])) {
                cont++;
            }
        }

        if (cont == 0) {

            System.out.println("--> Uh le erraste fuerte! :(");
            a.setJugadasMax(a.getJugadasMax() - 1);
        } else if (cont > 1) {
            System.out.println("--> Bienn perrii, esa se repite " + cont + " veces ;)");
            a.setLetrasEncontradas(a.getLetrasEncontradas() + cont);
        } else {
            System.out.println("--> Faa, le re pegaste, bien ahí !!");
            a.setLetrasEncontradas(a.getLetrasEncontradas() + cont);
        }

    }

    public boolean encontradas(Ahorcado a, String letra) {

        System.out.println("Encontradas: " + a.getLetrasEncontradas());

        System.out.println("Faltan: " + (a.getPalabra().length - a.getLetrasEncontradas()));

        boolean si = false;
        for (int i = 0; i < a.getPalabra().length; i++) {

            if (letra.equals(a.getPalabra()[i])) {
                si = true;
            }
        }
        return si;
    }

    public void intentos(Ahorcado a) {

        System.out.println("Vidas: " + a.getJugadasMax());

    }
    
    public String letraSinRepetirse(Ahorcado a, String[] rep) {
        
        System.out.println("Ingresa una letra: ");

        boolean seRepite = false;
        String aux = "";
        do {
            aux = read.next().toUpperCase();

            for (String palabra : rep) {
                seRepite = aux.equals(palabra);
                if (seRepite) {
                    System.out.println("Esa ya la usaste wachin, pone otra"); //se verifica que la letra no se repita
                    break;
                }
            }

        } while (seRepite);

        for (int i = 0; i < rep.length; i++) {

            if (aux.equals(a.getPalabra()[i])) {

                rep[i] = aux; //se guarda la "nueva" letra en el array
            }
        }
        return aux;
    }
    
    public void progreso(String[] letras) {
        
        System.out.println("//--Progreso--//");
        
        for (String letra : letras) {
            
            if (letra == null) {
                System.out.print("_ ");
            }
            else {
                System.out.print(letra + " ");
            }
        }
        System.out.println("\n");
    }
    public void juego() {

        Ahorcado a1 = crearJuego();

        String[] repetidas = new String[a1.getPalabra().length];
        
        System.out.println("//---JUEGO DEL AHORCADO---// \n");
        do {

            String letra = letraSinRepetirse(a1, repetidas);
            mostrarLoingitud(a1);
            buscarLetra(a1, letra);
            encontradas(a1, letra);
            intentos(a1);
            progreso(repetidas);

        } while (a1.getJugadasMax() > 0 && a1.getLetrasEncontradas() < a1.getPalabra().length);

        if (a1.getLetrasEncontradas() == a1.getPalabra().length) {

            System.out.println("GANASTE PAPEE, JUJUU!!");
        } else {
            System.out.println("Perdiste papurriii, lo100to");
        }
    }

}
