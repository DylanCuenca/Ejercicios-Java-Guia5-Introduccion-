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
public class Secreto {
    
    private String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    private String mesSecreto = meses[9];

    public Secreto() {
    }
    
    public void adivinarMes() {
        Scanner read = new Scanner (System.in);
        
        System.out.println("Ingresa el mes: ");
        
        String aux = "";
        do {
            
            aux = read.nextLine();
            if (!aux.equalsIgnoreCase(mesSecreto)) {
                
                System.out.println("Casi, pero no..");
            }
            
        } while (!aux.equalsIgnoreCase(mesSecreto));
        
        System.out.println("Bien ahi perri, le pegaste");
        }
}
