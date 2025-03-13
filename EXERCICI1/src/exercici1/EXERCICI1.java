/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici1;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class EXERCICI1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        double base;
        double altura;
        double area;
        
        System.out.println("Introduce altura: ");
        altura = sc.nextDouble();
        
        
        System.out.println("Introduce base: ");
        base = sc.nextDouble();
        
        
        area= (base*altura)/2;
        
        System.out.println("La area es "+ area);
    }
    
}
