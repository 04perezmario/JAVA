/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2.entradadatos_2025;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class ENTRADADATOS_2025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // ✅ Creamos un objeto Scanner para leer la entrada del usuario
        Scanner teclado = new Scanner(System.in);

        // ✅ Declaramos las variables
        int edad;        // Almacena un número entero
        String nombre;   // Almacena texto
        float altura;    // Almacena un número decimal (menos preciso que double)

        // ✅ Pedimos y leemos la edad del usuario
        System.out.print("Digite su edad: ");
        edad = teclado.nextInt(); // nextInt() captura un número entero

        // ✅ Pedimos y leemos el nombre del usuario
        System.out.print("Digite su nombre: ");
        nombre = teclado.next(); // next() captura una palabra (sin espacios)

        // ✅ Pedimos y leemos la altura del usuario
        System.out.print("Digite su altura en metros: ");
        altura = teclado.nextFloat(); // nextFloat() captura un número decimal

        // ✅ Mostramos los datos ingresados
        System.out.println("\n--- Datos ingresados ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Altura: " + altura + " metros");

        // ✅ Cerramos el Scanner para liberar recursos
        teclado.close();
    }
}

    }
    
}
