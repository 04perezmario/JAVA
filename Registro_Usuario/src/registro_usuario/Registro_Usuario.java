/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registro_usuario;

/**
 *
 * @author mario
 */
public class Registro_Usuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
         // Crear curso con capacidad de 2 estudiantes
        Curso matematicas = new Curso("Matemáticas", 2);

        // Crear estudiantes
        Estudiante mario = new Estudiante("Mario", 20);
        Estudiante lucia = new Estudiante("Lucía", 22);
        Estudiante juan = new Estudiante("Juan", 19);

        try {
            // Inscribir estudiantes
            matematicas.registrarEstudiante(mario);
            matematicas.registrarEstudiante(lucia);
            
            // Intentar inscribir a Juan en un curso lleno
            matematicas.registrarEstudiante(juan); // Lanza CursoLlenoException
        } catch (CursoLlenoException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Listar estudiantes
        matematicas.listarEstudiantes();

        // Eliminar un estudiante
        matematicas.eliminarEstudiante(mario);
        matematicas.listarEstudiantes();
    }
    }
    

