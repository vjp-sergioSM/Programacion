/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *Realiza un programa en JAVA en el que muestres un
menú que te permita 3 opciones:
1. Añadir un contacto a un fichero de texto (“agenda.txt”) en el que
indiques en cada línea:
• Un Nombre.
• Una Edad.
• Un número de teléfono.
2. Mostrar por pantalla el contenido del fichero de texto creado.
3. Salir del Programa.
• Captura las excepciones que veas necesarias.

 */
public class Ejercicio05 {

    // Nombre del fichero donde se guardan los contactos
    public static final String FICHERO = "Ejemplo.txt";

    public static void main(String[] args) {
        int opcion = 0;
        FileWriter fw = null;

        // Se abre el fichero en modo "append" (añadir al final)
        try {
            fw = new FileWriter(FICHERO, true);
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio05.class.getName()).log(Level.SEVERE, null, ex);
        }

        PrintWriter pw = null;

        // Menú principal
        do {
            try {
                mostrarMenu();
                opcion = scannerInt();

                switch (opcion) {
                    case 1 -> añadirContacto(pw, fw);   // Añadir contacto al fichero
                    case 2 -> mostrarContactos();       // Mostrar contactos
                    case 3 -> System.out.println("Saliendo...");
                    default -> System.out.println("Opción no válida.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (opcion != 3);
    }

    // Muestra el menú por pantalla
    public static void mostrarMenu() {
        System.out.println("\n--- MENÚ ---");
        System.out.println("1. Añadir contacto");
        System.out.println("2. Visualizar lista de contactos");
        System.out.println("3. Salir");
        System.out.print("Elige opción: ");
    }

    // Lee un String por teclado
    public static String scannerString() {
        return new Scanner(System.in).nextLine();
    }

    // Lee un entero por teclado
    public static int scannerInt() {
        return new Scanner(System.in).nextInt();
    }

    // Añade un contacto al fichero
    public static void añadirContacto(PrintWriter pw, FileWriter fw) throws IOException {

        // Se crea el PrintWriter para escribir en el fichero
        pw = new PrintWriter(fw);

        // Se piden los datos del contacto
        System.out.println("Introduzca el nombre del contacto:");
        String nom = scannerString();

        System.out.println("Introduzca la edad del contacto:");
        int eda = scannerInt();

        System.out.println("Introduzca el numero de movil del contacto:");
        String num = scannerString();

        // Se escriben los datos en el fichero
        pw.println("nombre=" + nom + ", edad=" + eda + ", numeroMovil=" + num);

        // Se cierra el flujo
        pw.close();
    }

    // Lee y muestra los contactos del fichero
    public static void mostrarContactos() throws IOException {
        try (
            FileReader fr = new FileReader(FICHERO);
            BufferedReader br = new BufferedReader(fr);
        ) {
            String linea = br.readLine();

            // Se leen todas las líneas del fichero
            while (linea != null) {
                linea = linea.replace("=", ":"); // Formato más legible
                System.out.println(linea);
                linea = br.readLine();
            }
        }
    }
}