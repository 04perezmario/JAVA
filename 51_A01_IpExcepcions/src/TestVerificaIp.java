
import java.util.Arrays;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author mario
 */
public class TestVerificaIp {

    /**
     * @param args the command line arguments
     */
    public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdueix una adreça IP: ");
        String ip = scanner.nextLine();  // Llegim la IP de l'usuari

        try {
            // 🔹 Cridem el mètode per dividir la IP
            String[] parts = VerificadorIp.dividirIpEn4(ip);
            
            // 🔹 Mostrem les parts de la IP
            System.out.println("✅ La IP és vàlida i té les següents parts:");
            System.out.println(Arrays.toString(parts));

        } catch (IPErroniaException e) {
            // 🔴 Si llança una excepció, mostrem el missatge d'error
            System.out.println("❌ ERROR: " + e.getMessage());
        }

        scanner.close();  // Tanquem el Scanner
    }
}
    
}
