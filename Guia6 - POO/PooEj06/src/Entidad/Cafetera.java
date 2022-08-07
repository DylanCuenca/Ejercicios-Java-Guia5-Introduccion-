package Entidad;

/**
 *
 * @author Dylan
 */
public class Cafetera {

        private int capacidadMaxima;
        private int cantidadActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    //---Metodos
    public void llenarCafetera() {
        cantidadActual = capacidadMaxima;
    }
        
    public void servirTaza(int tamaño) {
        
        if (tamaño > cantidadActual) {
            tamaño = cantidadActual;
            System.out.println("La taza no se llenó, pero quedó en: " + tamaño);
            cantidadActual = 0;
        }
        else {
            cantidadActual -=tamaño;
            System.out.println("Se llenó la taza!");
        }
        
    }
    
    public void vaciarCafetera() {
        cantidadActual = 0;
    }
    
    public void agregarCafe( int cafe) {
        
        cantidadActual += cafe;
        
    }
}
