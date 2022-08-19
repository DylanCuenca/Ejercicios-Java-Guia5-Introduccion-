
package Servicios;

import Entidad.Fecha;
import java.util.Scanner;

public class FechaServicio {
    
    public Fecha crearFecha(){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Fecha f = new Fecha();
        
        int anio_aux;
        
        System.out.println("Ingrese el dia:");
        f.setDia(leer.nextInt());
        
        System.out.println("Ingrese el mes:");
        f.setMes(leer.nextInt());
        
        System.out.println("Ingrese el año (que sea entre el año 1900 y el 2021):");
        anio_aux = leer.nextInt();
        
        if(comprobarAnio(anio_aux)){
            
            f.setAnio(anio_aux);
            
        }
        
        return f;
        
    }
    
    public boolean comprobarAnio(int anio){
        
        if(anio < 1900 || anio > 2021){
        
            System.out.println("Año no valido");
            
            return false;
        
        }
        
        return true;
        
    }
    
    public void cantDias(Fecha f){
        
        int[] cant_dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] nom_meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        
        System.out.println("La cantidad de dias del mes " + nom_meses[f.getMes() - 1] + " ingresado es de: " + cant_dias[f.getMes() - 1]);
        
    }
    
    public void diaAnterior(Fecha f){
        
        int[] cant_dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        if(f.getDia() == 1){
            
            f.setMes(f.getMes() - 1);
            
            if(f.getMes() == 0){
                
                f.setDia(cant_dias[f.getMes()]);
                
            }else{
                
                f.setDia(cant_dias[f.getMes() - 1]);
                
            }
            
            if(f.getMes() == 0){
                
                f.setMes(12);
                f.setAnio(f.getAnio() - 1);
                
            }
            
        }else{
            
            f.setDia(f.getDia() - 1);
            
        }
        
        System.out.println("La fecha anterior a la ingresada es: ");
        System.out.println("Dia: " + f.getDia());
        System.out.println("Mes: " + f.getMes());
        System.out.println("Anio: " + f.getAnio());
        
    }
    
    public void diaPosterior(Fecha f){
        
        if(f.getDia() == 31 || f.getDia() == 30 || f.getDia() == 28){
            
            f.setDia(1);
            f.setMes(f.getMes() + 1);
            
            if(f.getMes() == 13){
                
                f.setMes(1);
                f.setAnio(f.getAnio() + 1);
                
            }
            
        }else{
            
            f.setDia(f.getDia() + 1);
            
        }
        
        System.out.println("La fecha anterior a la ingresada es: ");
        System.out.println("Dia: " + f.getDia());
        System.out.println("Mes: " + f.getMes());
        System.out.println("Anio: " + f.getAnio());
        
    }
    
    public boolean anioBisiesto(Fecha f){
        
        if((f.getAnio() % 4 == 0) && ((f.getAnio() % 100 != 0) || (f.getAnio() % 400 == 0))){
            
            System.out.println("El año ES BISIESTO");
            return true;
            
        }else{
           
            System.out.println("El año NO ES BISIESTO");
            return false;
        
        }
        
    }
    
}
