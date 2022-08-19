/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Dylan
 */
public class SopaDeLetras {
    
    private String[][] matriz;
    private String palabraAEncontrar;

    //---CONSTRUCTOR
    public SopaDeLetras() {
        String[][] palabras = {{"D","Y","L","A","N","*","*","*","*","*"}, {"C","O","M","P","A","*","*","*","*","*"}, {"L","E","T","R","A","*","*","*","*","*"}, {"C","A","S","A","S","*","*","*","*","*"}, {"J","U","E","G","O","*","*","*","*","*"}, {"P","I","L","A","S","*","*","*","*","*"}, {"C","A","R","T","A","*","*","*","*","*"}, {"L","E","J","O","S","*","*","*","*","*"}, {"C","A","M","P","O","*","*","*","*","*"}, {"F","U","E","G","O","*","*","*","*","*"} };
        
        matriz = palabras; 
    }
    
    //---GETTERS & SETTERS
    public String[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(String[][] matriz) {
        this.matriz = matriz;
    }

    public String getPalabraAEncontrar() {
        return palabraAEncontrar;
    }

    public void setPalabraAEncontrar(String palabraAEncontrar) {
        this.palabraAEncontrar = palabraAEncontrar;
    }
    
    
}
