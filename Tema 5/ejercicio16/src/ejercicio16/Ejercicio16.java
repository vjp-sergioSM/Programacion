/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada1 = new Scanner(System.in);
        String nombre;
        int nota;
        Alumno alumno1 = new Alumno();
        Alumno alumno2 = new Alumno();
        Alumno alumno3 = new Alumno();
        //creamos los objetos y les añadimos la información directamente
        
        System.out.println("Introduzca nombre alumno: ");
        nombre=entrada1.nextLine();
        alumno1.setNombre(nombre);
        System.out.println("");
        System.out.println("Introduzca la nota: ");
        nota=entrada1.nextInt();
        alumno1.setNota(nota);
        System.out.println("");
        alumno1.mostrarCalificacion(alumno1.getNota());
        entrada1.nextLine();

        
        System.out.println("");
        System.out.println("Introduzca nombre alumno: ");
        nombre=entrada1.nextLine();
        alumno2.setNombre(nombre);
        System.out.println("");
        System.out.println("Introduzca la nota: ");
        nota=entrada1.nextInt();
        alumno2.setNota(nota);
        System.out.println("");
        alumno2.mostrarCalificacion(alumno2.getNota());
        System.out.println("");
        entrada1.nextLine();
        
        
        System.out.println("Introduzca nombre alumno: ");
        nombre=entrada1.nextLine();
        alumno3.setNombre(nombre);
        System.out.println("");
        System.out.println("Introduzca la nota: ");
        nota=entrada1.nextInt();
        alumno3.setNota(nota);
        System.out.println("");
        alumno3.mostrarCalificacion(alumno3.getNota());
        System.out.println("");
        //los imprimimos por pantalla
    }
    
        
}
