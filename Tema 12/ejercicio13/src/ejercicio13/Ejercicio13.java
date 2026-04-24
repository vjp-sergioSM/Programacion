/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author alumno
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */

    // Nombre del fichero donde se guardarán los datos
    public static final String FICHERO = "DatosBeca.txt";

    public static void main(String[] args) {
        Set<Becario> becarios = new HashSet<>();
        Becario temp;
        boolean continuar = true;

        // Apertura del fichero en modo añadir
        try (FileWriter fw = new FileWriter(FICHERO, true);
             PrintWriter pw = new PrintWriter(fw)) {

            temp = new Becario();

            System.out.println("Ingrese el nombre y apellido del becario:");
            temp.setNombreApellidos(scannerString());

            System.out.println("""
                               Ingrese el sexo del becario:
                               H=hombre M=mujer""");
            temp.setSexo(scannerString());
            // Validaciones
            temp.setEdad(comprobarEdad());
            temp.setCantidadSuspensos(comprobarSuspensos());
            temp.setResidenciaFamiliar(ingresarResidancia());

            System.out.println("Ingrese los ingresos anuales:");
            temp.setIngresosAnuales(scannerFloat());

            // Se añade al conjunto (evita duplicados)
            becarios.add(temp);
                
            // Escritura en fichero
            for (Becario becario : becarios) {
                pw.println(becario.toString());
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: tipo de dato incorrecto");
        } catch (IOException e) {
            System.out.println("Error al trabajar con el fichero");
        } catch (Exception e) {
            System.out.println("Error inesperado");
        }
    }

    // Lee un String por teclado
    public static String scannerString() {
        return new Scanner(System.in).nextLine();
    }

    // Lee un entero por teclado
    public static int scannerInt() throws InputMismatchException {
        return new Scanner(System.in).nextInt();
    }

    // Lee un float por teclado
    public static float scannerFloat() throws InputMismatchException {
        return new Scanner(System.in).nextFloat();
    }

    // Comprueba que la edad esté entre 20 y 60
    public static int comprobarEdad() throws InputMismatchException {
        int edad;
        boolean correcto = false;

        do {
            System.out.println("Ingrese la edad del becario:");
            edad = scannerInt();

            if (edad >= 20 && edad <= 60) {
                correcto = true;
            } else {
                System.out.println("Debe tener una edad entre 20 y 60");
            }
        } while (!correcto); // CORRECCIÓN: negación

        return edad;
    }

    // Comprueba que los suspensos estén entre 0 y 4
    public static int comprobarSuspensos() throws InputMismatchException {
        int suspensos;
        boolean correcto = false;

        do {
            System.out.println("Ingrese los suspensos del curso pasado:");
            suspensos = scannerInt();

            if (suspensos >= 0 && suspensos <= 4) {
                correcto = true;
            } else {
                System.out.println("Solo entre 0 y 4 asignaturas suspensas");
            }
        } while (!correcto); // CORRECCIÓN

        return suspensos;
    }

    // Indica si vive en residencia familiar
    public static boolean ingresarResidancia() throws InputMismatchException {
        System.out.println("¿Vive en residencia familiar?");
        System.out.println("1. Sí");
        System.out.println("2. No");

        int eleccion = scannerInt();
        return eleccion == 1;
    }
}
