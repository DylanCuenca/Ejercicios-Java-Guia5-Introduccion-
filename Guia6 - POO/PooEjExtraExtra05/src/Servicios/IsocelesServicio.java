
package Servicios;

import Entidad.Isoceles;
import java.util.Scanner;

public class IsocelesServicio {
    
    public Isoceles crearIsoceles(){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Isoceles t = new Isoceles();
        
        System.out.println("Ingrese el valor de los lados iguales:");
        t.setLadosIguales(leer.nextInt());
        
        System.out.println("Ingrese el valor de la base:");
        t.setBase(leer.nextInt());
        
        return t;
        
    }
    
    public Isoceles[] crearArreglo(){
        
        Isoceles[] arreglo = new Isoceles[4];
        
        for (int i = 0; i < 4; i++) {
            
            arreglo[i] = crearIsoceles();
            
        }
        
        return arreglo;
        
    }
    
    public double area(Isoceles t){
        
        double area = Math.sqrt(Math.pow(t.getLadosIguales(), 2) - (Math.pow(t.getBase(), 2)) / 4);
        
        return area;
        
    }
    
    public void perimetro(Isoceles t){
        
        int perimetro = t.getLadosIguales() * 2 + t.getBase();
        
        System.out.println("El perimetro del triangulo es: " + perimetro);
        
    }
    
    public void areaMayor(Isoceles[] tA){
        
        double mayor = 0;
        
        int base = 0, lados = 0;
        
        for (Isoceles isoceles : tA) {
            
            if(area(isoceles) > mayor){
                
                mayor = area(isoceles);
                base = isoceles.getBase();
                lados = isoceles.getLadosIguales();
                
            }
            
        }
        
        System.out.println("Los datos del triangulo con el mayor area son:\n-Base: " + base + "\n-Lados iguales: " + lados);
        
    }

}
