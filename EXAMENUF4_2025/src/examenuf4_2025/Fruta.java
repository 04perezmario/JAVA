/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenuf4_2025;

/**
 *
 * @author mario
 */
public class Fruta extends Producto{
        private int cantidad;
    private boolean lista;

    public Fruta(int cantidad, boolean lista, String nombre, double precio) {
        super(nombre, precio);
        this.cantidad = cantidad;
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Fruta: " + nombre + " - Precio: " + precio + " (Disponibles: " + cantidad + ")";
    }
    
    
    @Override
    public void preparar() {
        this.nombre += " encerada"; // Añade "encerada" al nombre
        this.precio *= 1.21; // Aplica el 21% de IVA
        this.lista = true; // Ahora está lista para venderse
    }

    
    
}
