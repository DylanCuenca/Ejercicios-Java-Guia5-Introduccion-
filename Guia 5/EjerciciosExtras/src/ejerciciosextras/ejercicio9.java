/*
 Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas
 */
package ejerciciosextras;

import java.util.Scanner;
/**
 *
 * @author Dylan
 */
public class ejercicio9 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingresar números para dividir ");
        int num1 = read.nextInt();
        int num2 = read.nextInt();
        
        System.out.println(num1 + " / " + num2);
        
        divisionConRestas(num1, num2);
        
    }
    
    public static void divisionConRestas (int num1, int num2) {
        
        int cont = 0;
        do {
            num1 = num1 - num2;
            
            cont ++;
            
        } while (num1 >= num2);
        
        System.out.println("Residuo = " + num1);
        System.out.println("Cociente = " + cont);
    }
}
