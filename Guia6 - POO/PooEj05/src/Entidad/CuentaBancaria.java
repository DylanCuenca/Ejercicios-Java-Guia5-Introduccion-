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
public class CuentaBancaria {
    
    private int numeroDeCuenta;
    private int DNI;
    private int saldoActual;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numeroDeCuenta, int DNI, int saldoActual) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    //--Metodos
    
    public void crearCuenta() {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese n° de cuenta: ");
        numeroDeCuenta = read.nextInt();
        
        System.out.println("Ingrese DNI: ");
        DNI = read.nextInt();
        
        System.out.println("Ingrese su saldo actual: ");
        saldoActual = read.nextInt();
        
    }
    
    public void ingresarDinero(double ingreso) {
        saldoActual += ingreso;
    }
    
    public void retiroDinero(double retiro) {
        
        saldoActual -= retiro;
        
        if (retiro > saldoActual) {
            saldoActual = 0;
        }
    }
    
    public void extraccionRapida(int extraccion) {
        
        double porcentaje = (20 * saldoActual)/100;
        if (porcentaje == extraccion) {
            saldoActual -= porcentaje;
        }
        else {
            System.out.println("No puede retirar menos, ni más que el 20%");
        }
    }
    
    public void consultarSaldo() {
        
        System.out.println("Saldo = " + saldoActual);
    }
    
    public void consultarDatos() {
        
        System.out.println("//---Datos de la Cuenta---//");
        
        System.out.println("N° deCuenta: " + numeroDeCuenta);
        System.out.println("DNI: " + DNI);
    }
}
