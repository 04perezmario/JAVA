/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.operadoresaritmeticos_2025;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class OPERADORESARITMETICOS_2025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner entrada = new Scanner(System.in); // Creamos un objeto Scanner para leer la entrada

        // Solicitamos al usuario que ingrese el primer número
        System.out.print("Digite el primer numero: ");
        int numero1 = entrada.nextInt();

        // Solicitamos al usuario que ingrese el segundo número
        System.out.print("Digite el segundo numero: ");
        int numero2 = entrada.nextInt();

        // Realizamos las operaciones básicas
        int suma = numero1 + numero2; // Suma de los dos números
        int resta = numero1 - numero2; // Resta de los dos números
        int multiplicacion = numero1 * numero2; // Multiplicación de los dos números
        int division = numero1 / numero2; // División de los dos números (cuidado con la división por cero)

        // Mostramos los resultados de las operaciones
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La division es: " + division);

        entrada.close(); // Cerramos el objeto Scanner para liberar recursos
    }
    
}
