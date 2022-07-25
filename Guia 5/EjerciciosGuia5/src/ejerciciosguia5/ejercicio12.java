/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
package ejerciciosguia5;

import java.util.Scanner;

/**
 *
 * @author Dylan
 */
public class ejercicio12 {

    public static void main(String[] args) {
        
        //--Simulador de Dispositivo
            RS232();
        
    }
    
    public static void RS232(){
        
        Scanner read = new Scanner(System.in);
        String FDE = "&&&&&";
        String mensaje;
        int correctas = 0;
        int incorrectas = 0;
        
        do {
            String carac1, carac2;
            
            System.out.println("Ingrese Cadena:");
            mensaje = read.nextLine();
            
            carac1 = mensaje.substring(0,1);
            carac2 = mensaje.substring(mensaje.length()-1, mensaje.length());
            
            if(mensaje.equals(FDE)){ 
                System.out.println("Fin Proceso");
                System.out.println("//------------------//");
                System.out.println();
            }
            else if (mensaje.length() == 5 && carac1.equals("X") && carac2.equals("O") ) {
                correctas ++;
            }
            else {
                incorrectas ++;
            }
            
        } while (!mensaje.equals(FDE) );
        
        System.out.println("Informe de Lecturas");
        System.out.println("Correctas: " + correctas);
        System.out.println("Incorrectas: " + incorrectas);
        
    }
    
}
