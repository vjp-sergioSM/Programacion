/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    private static int cantidadAlumnos;
    public static void main(String[] args) {
        cantidadAlumnos=0;
        ArrayList<Alumno> estudiantes = new ArrayList<>();
        int seleccion;
        do {
            menu();
            seleccion=scanerInt();
            switch (seleccion) {
                case 1 -> introducirNuevoAlumno(estudiantes);
                case 2 -> mostrarAlumnos(estudiantes);
                case 3 -> mostrarAlumnoMayorMedia(estudiantes);
                case 4 -> mostarAsignaturaMasDificil(estudiantes);
                case 5 -> System.out.println("Adios");
                default -> System.out.println("Pon un numero entre el 1 y el 5");
            }
        } while (seleccion!=5);
    }
    public static void menu() {
        System.out.println("-------------------------------------");
        System.out.println("1. Rellenar 1 alumno nuevo");
        System.out.println("-------------------------------------");
        System.out.println("2. Mostrar los alumnos");
        System.out.println("-------------------------------------");
        System.out.println("3. Mostrar alumno/s con mejor media");
        System.out.println("-------------------------------------");
        System.out.println("4. Mostrar asignatura mas dificil");
        System.out.println("-------------------------------------");
        System.out.println("5. Salir");
        System.out.println("-------------------------------------");
    }
    public static int scanerInt() {
        Scanner entradaSolicitar = new Scanner(System.in);
        return entradaSolicitar.nextInt();
    }
    public static String scanerString() {
        Scanner entradaSolicitar = new Scanner(System.in);
        return entradaSolicitar.nextLine();
    }
    public static void introducirNuevoAlumno(ArrayList<Alumno> estudiantes) {
        estudiantes.add(new Alumno());
        estudiantes.get(cantidadAlumnos).rellenarAlumno();
        cantidadAlumnos++;
    }
    
    public static void mostrarAlumnos(ArrayList<Alumno> estudiantes) {
        for (Alumno estudiante : estudiantes) {
            System.out.println(estudiante.toString());
        }
    }
    public static void mostrarAlumnoMayorMedia(ArrayList<Alumno> estudiantes) {
        float mayor=estudiantes.get(0).calcularMayorMedia();
        for (Alumno estudiante : estudiantes) {
            if (mayor<estudiante.calcularMayorMedia()) {
                mayor=estudiante.calcularMayorMedia();
            }
        }
        for (Alumno estudiante : estudiantes) {
            if (mayor==estudiante.calcularMayorMedia()) {
                System.out.println(estudiante.getNombre()+" tiene una media de "+ estudiante.calcularMayorMedia());
            }
        }
    }
    public static void mostarAsignaturaMasDificil(ArrayList<Alumno> estudiantes) {
        float suspensosL=0, suspensosM=0, suspensosF=0;
        for (Alumno estudiante : estudiantes) {
            if (estudiante.getNotaX(0)<5) {
                suspensosL++;
            }
            if (estudiante.getNotaX(1)<5) {
                suspensosM++;
            }
            if (estudiante.getNotaX(2)<5) {
                suspensosF++;
            }
        }
        if (suspensosL>suspensosM && suspensosL>suspensosF) {
            System.out.println("La asignatura más dificil es Lengua con "+suspensosL+" suspensos");
        }
        if (suspensosM>suspensosL && suspensosM>suspensosF) {
            System.out.println("La asignatura más dificil es Matematicas con "+suspensosL+" suspensos");
        }
        if (suspensosF>suspensosM && suspensosF>suspensosL) {
            System.out.println("La asignatura más dificil es Fisica con "+suspensosL+" suspensos");
        }
    }
}
