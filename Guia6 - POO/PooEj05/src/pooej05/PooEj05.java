/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package pooej05;

import Entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Dylan
 */
public class PooEj05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        CuentaBancaria acount1 = new CuentaBancaria();
        
        System.out.println("Ingrese sus datos para crear una cuenta!:");
        acount1.crearCuenta();
        
        int aux, op = 0;
        do {
            System.out.println("Elija una opcion");
        
            System.out.println("1. Ingresar Dinero \n" +
                           "2. Retirar Dinero\n" +
                           "3. Extraccion Rapida\n" +
                           "4. Consultar Saldo\n" +
                           "5. Consultar Datos\n" +
                           "6. Salir \n");
            
            op = read.nextInt();
            
            switch (op) {
                case 1:
                        System.out.println("¿Cuánto dinero desea ingresar?");
                        aux = read.nextInt();
                        acount1.ingresarDinero(aux);
                        
                        System.out.println("Listo! \n12");
                    break;
                case 2:
                        System.out.println("¿Cuánto dinero desea retirar?");
                        aux = read.nextInt();
                        acount1.retiroDinero(aux);
                        
                        System.out.println("Listo! \n12");
                    break;
                case 3:
                        System.out.println("¿Cuánto dinero desea retirar? (Solo 20% del total!)");
                        aux = read.nextInt();
                        acount1.extraccionRapida(aux);
                        
                        System.out.println("Fin! \n12");
                    break;
                case 4:
                        acount1.consultarSaldo();
                        System.out.println("Listo! \n12");
                    break;
                case 5:
                        acount1.consultarDatos();
                        System.out.println("Listo! \n12");

                    break;
                case 6:
                        System.out.println("//--Salida con exito--//");
                    break;
                default:
                        System.out.println("Ingrese una opcion válida");
            }
            
        } while (op != 6);
    }
}
