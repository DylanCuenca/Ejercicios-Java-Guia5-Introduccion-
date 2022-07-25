/*
 Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar
 */
package ejerciciosextras;

/**
 *
 * @author Dylan
 */
public class ejercicio2 {

    public static void main(String[] args) {
        
        int A = 22;
        int B = 11;
        int C = 2;
        int D = 53;

        System.out.println("Valor A: "+A+"\n" +
                           "Valor B: "+B+"\n" +
                           "Valor C: "+C+"\n" +
                           "Valor D: "+D);
        
        System.out.println("Cambio de valores"+"\n"+
                            "///-------------------///");
        
        cambioValores(A, B, C, D);
    }
    
    public static void cambioValores(int A, int B, int C, int D) {
        
        int aux;
        
        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        
        System.out.println("Valor A: "+A+"\n" +
                           "Valor B: "+B+"\n" +
                           "Valor C: "+C+"\n" +
                           "Valor D: "+D);
    }
}
