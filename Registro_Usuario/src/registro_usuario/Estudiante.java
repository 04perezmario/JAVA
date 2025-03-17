/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registro_usuario;

/**
 *
 * @author mario
 */
public class Estudiante {
    private String nombre;
    private int edad;

    public Estudiante(String nombre, int edad) {
        if (nombre == null || nombre.trim().isEmpty() || edad < 0) {
            throw new EstudianteInvalidoException("Nombre vacío o edad negativa no permitidos.");
        }
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + " años)";
    }
}
