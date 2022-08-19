/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Auto;
import java.util.Scanner;

/**
 *
 * @author Dylan
 */
public class AutoService {
    
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        public Auto crearFicha() {
            
            Auto auto = new Auto();
            
            System.out.println("//--Ficha del Auto--// \n");
            
            System.out.println("Nombre del titular: ");
            auto.setNombreDueño(read.next());
            
            System.out.println("Fecha de vencimiento de carnet:");
            auto.setFechaVencimientoCarnet(read.next());
            
            System.out.println("Color:");
            auto.setColor(read.next());
            
            System.out.println("Modelo:");
            auto.setModelo(read.next());
                                  
            return auto;
        }
        
        public void modificarTitularidad(Auto auto) {
            
            System.out.println("Ingrese nombre del nuevo titular:");
            auto.setNombreDueño(read.next());
            
            System.out.println("Nuevo titular: " + auto.getNombreDueño());
            
        }
        
        public void agregarTrayectoRecorrido(Auto auto) {
            
            System.out.println("Indique el trayecto recorrido (en km)");
            int trayecto = read.nextInt();
            
            auto.setKmEnMotor(auto.getKmEnMotor() + trayecto);
            
            System.out.println("Nuevos km en motor: " + auto.getKmEnMotor());
        }
        
        public void indicarService(Auto auto) {
            
            if (auto.getKmEnMotor() >= 10000) {
                
                System.out.println("Se debe realizar el service al vehículo");
            }
        }
        
        public void menuAuto() {
            
            Auto a = crearFicha();
            String opcion = "";
            do {
                
                System.out.println("Elija una opcion: \n" +
                                    "A- Modificar titularidad \n" +
                                    "B- Agregar kms \n" +
                                    "C- Salir");
                opcion = read.next().toUpperCase();
                
                switch (opcion) {
                    case "A":
                        modificarTitularidad(a);
                        break;
                    case "B":
                        agregarTrayectoRecorrido(a);
                        indicarService(a);
                        break;
                    case "C":
                        System.out.println("//--Fin--//");
                        break;
                    default:
                        System.out.println("Opcion invalida");
                        break;
                }
                
                
            } while (!opcion.equals("C"));
            
            
        }
        
}
