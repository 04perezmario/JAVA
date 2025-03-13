/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mario
 */
public class VerificadorIp {
    
     private String ip;

    // 🔹 1. Dividir la IP en 4 parts i validar el format
    public static String[] dividirIpEn4(String ip) throws IPErroniaException {
        String[] parts = ip.split("\\."); // Separa la IP en parts
        
        if (parts.length != 4) {
            throw new IPErroniaException("LA IP ES INCOMPLETA NO TE 4 PARTS"); // Llança excepció si no té 4 parts
        }

        return parts;
    }

    // 🔹 2. Comprovar si una cadena és un número enter
    public static boolean stringToInt(String ipPart) {
        try {
            Integer.parseInt(ipPart); // Intentem convertir-lo a enter
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // 🔹 3. Comprovar si un número està entre 0 i 255
    public static boolean inRangIp(int valor) {
        return valor >= 0 && valor <= 255;
    }

    // 🔹 4. Validar si una IP és correcta
    public static boolean validarIp(String ip) {
        try {
            String[] parts = dividirIpEn4(ip); // Divideix la IP
            
            for (String part : parts) {
                if (!stringToInt(part)) {
                    System.out.println("❌ Error: '" + part + "' no és un número vàlid.");
                    return false;
                }

                int valor = Integer.parseInt(part);
                if (!inRangIp(valor)) {
                    System.out.println("❌ Error: '" + part + "' està fora del rang permès (0-255).");
                    return false;
                }
            }
            
            return true; // La IP és correcta si arriba aquí
        } catch (IPErroniaException e) {
            System.out.println(e.getMessage()); // Mostra el missatge d'error
            return false;
        }
    }


}