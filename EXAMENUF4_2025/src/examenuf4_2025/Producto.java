/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenuf4_2025;

/**
 *
 * @author mario
 */
public abstract class Producto {
    protected String nombre;
    
    protected double precio;

    
    //CREAMOS EL CONSTRUCTOR
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }
    
//    No se pone setNombre(String nombre) porque en la mayoría de los casos el nombre
//    de un producto no debería cambiar una vez creado.
    
    
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
   

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    @Override
    public String toString() {
        return "Nombre: " + nombre + " - Precio: " + precio;
    }

 
        public abstract void preparar();

    
    
}
