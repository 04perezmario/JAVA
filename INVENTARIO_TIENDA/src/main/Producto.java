/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main; // Indica que esta clase pertenece al paquete "main"

/**
 *
 * @author mario
 */
// Producto.java
public class Producto { // Define la clase Producto
    // SIEMPRE SE PONE PRIVATE 
    private String nombre; // Declara un atributo privado "nombre" de tipo String para almacenar el nombre del producto
    private int stock; // Declara un atributo privado "stock" de tipo int para almacenar la cantidad disponible del producto

    
    // SIEMPRE HAY QUE PONER GETTER Y SETTERS 
    
    
    
    // Constructor
    public Producto(String nombre, int stock) { // Define el constructor de la clase Producto
        this.nombre = nombre; // Asigna el valor del parámetro "nombre" al atributo "nombre" de la clase
        this.stock = stock; // Asigna el valor del parámetro "stockInicial" al atributo "stock" de la clase
    }

    // Método para realizar una compra
    public void comprar(int cantidad) throws StockInsuficienteException { // Define el método "comprar" que lanza la excepción StockInsuficienteException
        if (cantidad > stock) { // Verifica si la cantidad solicitada es mayor que el stock disponible
            throw new StockInsuficienteException("No hay suficiente stock de " + nombre + " para realizar la compra."); // Lanza la excepción si no hay suficiente stock
        }
        stock -= cantidad; // Reduce el stock disponible restando la cantidad comprada
        System.out.println("Compra exitosa de " + cantidad + " " + nombre + "(s)."); // Muestra un mensaje indicando que la compra fue exitosa
    }

    // Método para mostrar el stock disponible
    public void mostrarStock() { // Define el método "mostrarStock"
        System.out.println("Stock de " + nombre + ": " + stock); // Muestra el stock disponible del producto
    }
}