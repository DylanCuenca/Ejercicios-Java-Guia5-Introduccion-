/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.SopaDeLetras;
import java.util.Scanner;

/**
 *
 * @author Dylan
 */
public class SopaDeLetrasService {
    
    Scanner read = new Scanner(System.in);
    
    public int buscarPalabra(SopaDeLetras sopa) {
        
        System.out.println("Ingrese la palabra que desea buscar:");
        sopa.setPalabraAEncontrar(read.next().toUpperCase());
        
        int aux = 0;
        
        for (int i = 0; i < sopa.getMatriz().length; i++) {
            int cont1 = 0;
            for (int j = 0; j < 5; j++) {
                
                if (sopa.getPalabraAEncontrar().substring(j, j+1).equals(sopa.getMatriz()[i][j])) {
                    cont1 ++;
                }
                String letra = sopa.getPalabraAEncontrar().substring(0, 1);
                String letraEn =sopa.getMatriz()[i][0];
                if (letra.equals(letraEn)) {
                    aux = 0;
                }
            }
            if (cont1 == 5) {
                System.out.println("La palabra comienza en la posicion: (" + i +", "+ aux+ ")" );
                return  i;
            }
        }
        return 0;
    }
    
    public void imprimirSopa(SopaDeLetras sopa) {
        
        for (String[] strings : sopa.getMatriz()) {
            
            for (String string : strings) {
                
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }
    
    public void reemplazarPalabra(SopaDeLetras sopa, String[][] sop, int posicion) {
        
        for (int i = 0; i < sopa.getMatriz().length; i++) {
            
            if (i == posicion) {
                
                System.out.println("Ingrese palabra a reemplazar");
                String reemplazo = read.next().toUpperCase();
                
                for (int j = 0; j < 5; j++) {

                        sop[i][j] = reemplazo.substring(j, j+1);
                }
            }
        }
        
        sopa.setMatriz(sop);
    }
    
    public void sopaInvertida(SopaDeLetras sopa) {
        
        for (int i = 0; i < sopa.getMatriz().length; i++) {
            
            for (String[] matriz : sopa.getMatriz()) {
                System.out.print(matriz[i] + " ");
            }
          System.out.println();  
        }
    }
     
    public void sopaDeLetras () {
        
        SopaDeLetras sop = new SopaDeLetras();
        String[][] matrixAux = sop.getMatriz();
        
        int posicion = buscarPalabra(sop);
        imprimirSopa(sop);
        reemplazarPalabra(sop, matrixAux, posicion);
        sopaInvertida(sop);
        
    }
    
}
