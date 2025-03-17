/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registro_usuario;

/**
 *
 * @author mario
 */
import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private int capacidadMaxima;
    private List<Estudiante> estudiantes;

    public Curso(String nombre, int capacidadMaxima) {
        this.nombre = nombre;
        this.capacidadMaxima = capacidadMaxima;
        this.estudiantes = new ArrayList<>();
    }

    public void registrarEstudiante(Estudiante estudiante) throws CursoLlenoException {
        if (estudiantes.size() >= capacidadMaxima) {
            throw new CursoLlenoException("El curso '" + nombre + "' ya está lleno.");
        }
        estudiantes.add(estudiante);
        System.out.println("Estudiante " + estudiante.getNombre() + " registrado en " + nombre);
    }

    public void eliminarEstudiante(Estudiante estudiante) {
        if (estudiantes.remove(estudiante)) {
            System.out.println("Estudiante " + estudiante.getNombre() + " eliminado de " + nombre);
        } else {
            System.out.println("El estudiante no estaba registrado en " + nombre);
        }
    }

    public int getNumeroEstudiantes() {
        return estudiantes.size();
    }

    public String getNombre() {
        return nombre;
    }

    public void listarEstudiantes() {
        System.out.print("Estudiantes en el curso " + nombre + ": ");
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes inscritos.");
        } else {
            for (Estudiante e : estudiantes) {
                System.out.print(e.getNombre() + " ");
            }
            System.out.println();
        }
    }
}