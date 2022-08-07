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
public class Cadena {
    
    private String frase;
    private int longitud;

    public Cadena() {
    }

    //--Getters & Setters
    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    
    //--METODOS
    public void mostrarVocales() {
        
        int cont = 0;
        for (int i = 0; i < frase.length(); i++) {
            String caracter = frase.substring(i, i+1);
            
            if (caracter.equals("a") || caracter.equals("e") || caracter.equals("i") || caracter.equals("o") || caracter.equals("u")) {
                
                cont ++;
            }
        }
        
        System.out.println("La frase tiene "+cont+ " vocales");
    }
    
    public void invertirFrase() {
        
        for (int i = frase.length(); i > 0; i--) {
            
            System.out.print(frase.substring(i-1, i));
        }
        System.out.println();
    }
    
    public void vecesRepetido(String caract) {
        
        int cont = 0;
        
        for (int i = 0; i < frase.length(); i++) {
            
            if (caract.equals(frase.substring(i, i+1))) {
                
                cont ++;
                
            }
        }
        System.out.println("El caracter se repite: "+cont+" veces");
    }
    
    public void compararLongitu(String frase2) {
        
        System.out.println("Longitud de frase principal: "+ frase.length());
        System.out.println("Longitud de frase secundaria: "+ frase2.length());
        
    }
    
    public void unirFrase(String frase) {
        
        this.frase = this.frase.concat(frase);
        System.out.println(this.frase);
    }
    
    public void reemplazar(String letra) {
        
        for (int i = 0; i < frase.length(); i++) {
            
            if ("a".equals(frase.substring(i, i+1))) {
                
                System.out.print(letra);
            }
            else {
                System.out.print(frase.substring(i, i+1));
            }
        }
        System.out.println();
    }
    
    public boolean  contiene(String letra) {
        
        int aux = 0;
        
        for (int i = 0; i < frase.length(); i++) {
            
            if (frase.substring(i, i+1).equals(letra)) {
                aux ++;
            }
        }
        return aux >= 1;
        
    }
}
