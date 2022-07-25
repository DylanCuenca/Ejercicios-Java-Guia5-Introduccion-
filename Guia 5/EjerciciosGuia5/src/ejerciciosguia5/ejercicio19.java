/*
 Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package ejerciciosguia5;

/**
 *
 * @author Dylan
 */
public class ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int[][] vector = {{0,-2,4}, {2,0,2}, {-4,-2,0}}; //Vector inicializado
        int[][] vectorT = new int[3][3];
        
        System.out.println("Matriz común");
        mostrarVector(vector);
        
        System.out.println("Matriz Traspuesta");
        vectorTras(vector, vectorT);
        
        verificacion(vector,vectorT);
        		
    }
    
    public static void mostrarVector(int vector[][]) { //Mostramos el vector inicialzado
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) { 
                System.out.print(" " + vector[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static void vectorTras(int vector [][], int vectorT[][]) { //Generamos y mostramos la matatriz traspuesta
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                vectorT[i][j] = vector[j][i];
                System.out.print(" " + vectorT[i][j] + "  ");
            }
            System.out.println();
        }
    }
    
    public static void verificacion(int vector[][], int vectorT[][]) { //Verificamos si la matriz es antisimétrica
        
        int cont = 0;
        
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                vector[i][j] = vector[i][j] * (-1); //multiplicamos nuestra matriz por -1 para transformarla en negativa
                
                if (vector[i][j] == vectorT[i][j]) { //y si la matriz comun(neagtiva) es igual a la matriz Traspuesta, es antisimétrica
                    cont ++;
                }
            }
        }
        
        if (cont == 9) {
            System.out.println("La matriz es antisimétrica");
        }
        else {
            System.out.println("La matriz no es antisimétrica");
        }
    }
    
}
