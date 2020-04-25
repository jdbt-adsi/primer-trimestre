/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_objetos;

/**
 *
 * @author grasp
 */
public class objetos_java {
    // atributos
    private String marca;
    private int motor;
    private String color;
    private double precio;
    
    // constructores
    public objetos_java(){
        
    
}

    public objetos_java(String marca, int motor, String color, double precio) {
        this.marca = marca;
        this.motor = motor;
        this.color = color;
        this.precio = precio;
    }
    //metodos

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}


  
    


