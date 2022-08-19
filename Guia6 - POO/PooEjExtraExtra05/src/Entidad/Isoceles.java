
package Entidad;

public class Isoceles {
    
    private int ladosIguales;
    private int base;

    public Isoceles() {
    }

    public Isoceles(int ladosIguales, int lado) {
        this.ladosIguales = ladosIguales;
        this.base = lado;
    }

    public int getLadosIguales() {
        return ladosIguales;
    }

    public void setLadosIguales(int ladosIguales) {
        this.ladosIguales = ladosIguales;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int lado) {
        this.base = lado;
    }
    
    
    
}
