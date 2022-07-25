/*
    Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
    0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
    Ejemplo:
    0-0-0
    0-0-1
    0-0-2
    0-0-E
    0-0-4
    0-1-2
    0-1-E
    Nota: investigar función equals() y como convertir números a String.
 */
package ejerciciosextras;

/**
 *
 * @author Dylan
 */
public class ejercicio12 {

    public static void main(String[] args) {
        
        contador();
        
    }
    
    public static void contador() {
        
        int cont1 = 0, cont2 = 0, cont3 = 0;
        
        do {
            if (cont3 !=9) {
                cont3 ++;
            }
            
            else if (cont3 == 9 && cont2 != 9) {
                cont2 ++;
            }
            else if (cont2 == 9 && cont1 != 9) {
                cont1 ++;
            }
            
            // --Cada vez que aparece el n°3, lo cambiamos por una "E"
            if (cont3 == 3) {
                String cont33 = Integer.toString(cont3);
                if (cont33.equals("3")) {
                    cont33 = "E";
                    System.out.println(cont1 +" - "+ cont2 +" - "+ cont33);
                }
            }
            else if (cont2 == 3) {
                String cont22 = Integer.toString(cont2);
                if (cont22.equals("3")) {
                    cont22 = "E";
                    System.out.println(cont1 +" - "+ cont22 +" - "+ cont3);
                }
            }
            else if (cont1 == 3) {
                String cont11 = Integer.toString(cont1);
                if (cont11.equals("3")) {
                    cont11 = "E";
                    System.out.println(cont11 +" - "+ cont2 +" - "+ cont3);
                }
            }
            else {
                System.out.println(cont1 +" - "+ cont2 +" - "+ cont3);
            }
            
        } while (cont1 != 9);
        
        
    }
}
