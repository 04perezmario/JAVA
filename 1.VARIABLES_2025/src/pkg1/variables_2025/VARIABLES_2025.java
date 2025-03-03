/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1.variables_2025;

/**
 * Clase que demuestra los diferentes tipos de variables en Java.
 * @author Mario
 */
public class VARIABLES_2025 {

    public static void main(String[] args) {
        // TIPOS DE VARIABLES EN JAVA
        
        // 1. int (números enteros, positivos o negativos, sin decimales)
        int numeroEntero = 25;
        
        // 2. float (números decimales de precisión simple, deben terminar en 'f')
        float numeroFlotante = 3.14f;
        
        // 3. double (números decimales de mayor precisión)
        double numeroDecimal = 9.87654321;
        
        // 4. String (cadenas de texto, palabras o frases)
        String texto = "Hola, mi nombre es Mario";
        
        // 5. char (almacena un solo carácter, entre comillas simples)
        char letra = 'A';
        
        // 6. boolean (almacena valores verdadero o falso)
        boolean esMayorEdad = true;

        // Imprimir los valores para comprobar su funcionamiento
        System.out.println("Número Entero: " + numeroEntero);
        System.out.println("Número Flotante: " + numeroFlotante);
        System.out.println("Número Decimal: " + numeroDecimal);
        System.out.println("Texto: " + texto);
        System.out.println("Letra: " + letra);
        System.out.println("Es mayor de edad: " + esMayorEdad);
        
        
        String mensaje = "Hola soy mario ";
        mensaje = mensaje + "soy de españa";
        
        System.out.println(mensaje);
    }
}
