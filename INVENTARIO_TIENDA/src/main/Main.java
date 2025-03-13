/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author mario
 */
// Main.java
public class Main {
    public static void main(String[] args) {
        // Creamos produtos
        Producto producto1 = new Producto("Camiseta", 10);
        Producto producto2 = new Producto("Zapatos", 5);

        // Amosamos o stock inicial
        producto1.mostrarStock();
        producto2.mostrarStock();

        try {
            // Intentamos comprar 12 camisetas, o cal debería lanzar unha excepción
            producto1.comprar(12);
        } catch (StockInsuficienteException e) {
            // Capturamos e amosamos a mensaxe da excepción
            System.out.println("Erro: " + e.getMessage());
        }

        // Intentamos comprar 3 pares de zapatos, o cal debería ser exitoso
        try {
            producto2.comprar(3);
        } catch (StockInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // Amosamos o stock despois das compras
        producto1.mostrarStock();
        producto2.mostrarStock();
    }
}