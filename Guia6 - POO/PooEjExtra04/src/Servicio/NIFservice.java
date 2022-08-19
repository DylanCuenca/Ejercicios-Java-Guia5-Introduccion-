/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author Dylan
 */
public class NIFservice {
    Scanner read = new Scanner(System.in);
    
    public NIF crearNif() {
        
        NIF n = new NIF();
        String[] vector = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"}; 
        
        
        System.out.println("Ingrese DNI: ");
        String a = "";
        do {
            
            n.setDNI(read.nextLong());
            a = Long.toString(n.getDNI());
            
            if (a.length() != 8) { 
                System.out.println("Solo 8 digitos");
            }
            
        } while (a.length() != 8);
       
        int aux = (int)n.getDNI() % 23;
        n.setLetra(vector[aux]);
        
        return n;
    }
    
    public void mostrar(NIF aa) {
        
        System.out.println(aa.getDNI() + "-"+ aa.getLetra());
    }
}
