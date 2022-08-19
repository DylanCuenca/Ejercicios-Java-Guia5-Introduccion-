/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Tiempo;
import java.util.Scanner;

/**
 *
 * @author Dylan
 */
public class TiempoService {
    
    public Tiempo crearTiempo() {
        Scanner read = new Scanner(System.in);
        
        Tiempo t1 = new Tiempo();
        
        System.out.println("Ingrese Horas: ");
        int horas = 0;
        do{
            horas = read.nextInt();
        
            if (horas < 0 || horas > 23 ) {
                System.out.println("Valores invalidos, recuerdas que las horas van de (0 - 23)");
            }
            else {
                t1.setHoras(horas);
            }
        }while(horas < 0 || horas > 23);
        
        System.out.println("Ingrese Minutos: ");
        int minutos = 0;
        do{
            minutos = read.nextInt();
        
            if (minutos < 0 || minutos > 59 ) {
                System.out.println("Valores invalidos, recuerdas que las minutos van de (0 - 59)");
            }
            else {
                t1.setMinutos(minutos);
            }
        }while(minutos < 0 || minutos > 59);
        
        System.out.println("Ingrese Segundos: ");
        int segundos = 0;
        do{
            segundos = read.nextInt();
        
            if (segundos < 0 || segundos > 59 ) {
                System.out.println("Valores invalidos, recuerdas que las segundos van de (0 - 59)");
            }
            else {
                t1.setSegundos(segundos);
            }
        }while(segundos < 0 || segundos > 59);

        return t1;
    }
    
    public void esperar(int seg) {
        
        try {
                Thread.sleep(seg * 1000);
            }
            catch (Exception e){
                System.out.println(e);
            }
    }
    
    public void imprimirTiempo() {
        
        Tiempo tiempo = crearTiempo();
        
        System.out.println("//--SIMULACION DE TIEMPO EN CONSOLA--//");
        for (int i = tiempo.getHoras() ; i < 24; i++) //horas
        {
            for (int j = tiempo.getMinutos(); j < 60; j++) //minutos
            {
                for (int k = tiempo.getSegundos(); k < 60; k++) //segundos 
                {
                    if(k == tiempo.getSegundos()){
                        
                        System.out.println(tiempo.getHoras() +" hs, " + tiempo.getMinutos() + " min, " + k + " seg.");
                    }
                    else { 
                        
                        esperar(1);
                        System.out.println(tiempo.getHoras() +" hs, " + tiempo.getMinutos() + " min, " + k + " seg.");
                    }
                }
                tiempo.setMinutos(tiempo.getMinutos() + 1);
                tiempo.setSegundos(0);
            }
            
            tiempo.setHoras(tiempo.getHoras() + 1);
            tiempo.setMinutos(0);
        }
    }
}
