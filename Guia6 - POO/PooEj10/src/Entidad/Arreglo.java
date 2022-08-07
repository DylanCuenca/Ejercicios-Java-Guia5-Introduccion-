/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Dylan
 */
public class Arreglo {
    
 
    private float[] vector1 = new float [50];
    private float[] vector2 = new float[20];

    //---Constructores
    public Arreglo() {
    }

    public Arreglo(float[] vector1, float[] vector2) {
        this.vector1 = vector1;
        this.vector2 = vector2;
    }

    //---Getters & Setters
    public float[] getVector1() {
        return vector1;
    }

    public void setVector1(float[] vector1) {
        this.vector1 = vector1;
    }

    public float[] getVector2() {
        return vector2;
    }

    public void setVector2(float[] vector2) {
        this.vector2 = vector2;
    }

}

