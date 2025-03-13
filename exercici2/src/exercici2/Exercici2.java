/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici2;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Exercici2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int fechaActual;
        int fechaNacimiento;
        int edad;
        
        System.out.println("Que año es actualmente");
        fechaActual=sc.nextInt();
        
        System.out.println("Que año naciste");
        fechaNacimiento=sc.nextInt();
        
        
        edad=fechaActual-fechaNacimiento;

        System.out.println(edad);
    }
    
}
