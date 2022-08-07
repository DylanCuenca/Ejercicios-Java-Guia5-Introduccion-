/*
                    Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo
                    ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
                    atributo, puede hacerlo. Los métodos que se implementarán son:
                    • Un constructor por defecto.
                    • Un constructor con todos los atributos como parámetro.
                    • Métodos getters y setters de cada atributo.
                    • Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
                    usuario y después se le asignan a sus respectivos atributos para llenar el objeto
                    Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
                    Si no es correcto se deberá mostrar un mensaje
                    • Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
                    kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
                    que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
                    fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
                    está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
                    fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
                    función devuelve un 1.
                    • Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
                    un booleano.
                    A continuación, en la clase main hacer lo siguiente:
                    Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
                    los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
                    sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
                    mayor de edad.
                    Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
                    distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
                    cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
                    también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
 */
package pooej07;

import Entidad.Persona;
import Servicio.PersonaService;

/**
 *
 * @author Dylan
 */
public class PooEj07 {

    public static void main(String[] args) {
        
        PersonaService perSer = new PersonaService();
        
        Persona[] personas = new Persona[4]; 
        
        for (int i = 0; i < 4; i++) {      //--Se crean 4 objetos(persona)
            
            System.out.println("Persona " + (i+1));
            personas[i] = perSer.crearPersona();
        }
        
        
        float cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;
        
        for (Persona persona : personas) {    //--Usamos los metodos para cada persona
            
            System.out.println("Resultados(IMC) de "+ persona.getNombre() +"---//");
            
            int aux = perSer.calcularIMC(persona.getPeso(), persona.getAltura());
            
            switch (aux) {
                case -1:
                    System.out.println("Bajo peso");
                    cont1 ++;
                    break;
                case 0:
                    System.out.println("Peso ideal");
                    cont2 ++;
                    break;
                case 1:
                    System.out.println("Sobre peso");
                    cont3 ++;
                    break;
            }
            
            boolean mayor = perSer.esMayorDeEdad(persona.getEdad());
            if (mayor) {
                System.out.println("Es mayor de Edad \n");
                cont4 ++;
            }
            else {
                System.out.println("No es Mayor de Edad \n");
                cont5 ++;
            }
        }
        
        float bajoPeso = (cont1 * 100) / 4 ;
        float pesoIdeal = (cont2 * 100) / 4 ;
        float sobrePeso = (cont3 * 100) / 4;
        float mayor = (cont4 * 100) / 4;
        float menor = (cont5 * 100) / 4;
        
        System.out.println("Personas con bajo peso: %" + bajoPeso);
        System.out.println("Personas con peso ideal: %" + pesoIdeal);
        System.out.println("Personas con sobre peso: %" + sobrePeso);
        System.out.println("Personas mayores: %" + mayor);
        System.out.println("Personas menores: %" + menor);
    }
    
}
