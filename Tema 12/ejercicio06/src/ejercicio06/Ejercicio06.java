/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
 class Ejercicio06 {

    // Ruta del fichero a crear/leer
    private static String ruta; 

    public static void main(String[] args) {
        ArrayList<Integer> pares100 = new ArrayList<>();
        int opcion = 0;
        FileWriter fw = null;
        PrintWriter pw = null;

        // Crear lista con los 100 primeros números pares
        crearArray(pares100);

        // Elegir nombre del fichero
        pw = elegirNombre(fw, pw);

        // Menú principal
        do {
            try {
                mostrarMenu();
                opcion = scannerInt();

                switch (opcion) {
                    case 1 -> volcarArray(pw, pares100); // Guardar en fichero
                    case 2 -> mostrarFichero();           // Leer fichero
                    case 3 -> System.out.println("Saliendo...");
                    default -> System.out.println("Opción no válida.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (opcion != 3);
    }

    // Muestra el menú
    public static void mostrarMenu() {
        System.out.println("\n--- MENÚ ---");
        System.out.println("1. Crear fichero");
        System.out.println("2. Mostrar fichero");
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

    // Pide el nombre del fichero y crea el PrintWriter
    public static PrintWriter elegirNombre(FileWriter fw, PrintWriter pw) {
        try {
            System.out.println("Nombre del fichero:");
            ruta = scannerString() + ".txt";
            fw = new FileWriter(ruta);
            pw = new PrintWriter(fw);
        } catch (IOException e) {
            System.out.println("Error al crear fichero");
        }
        return pw;
    }

    // Genera los 100 primeros números pares
    public static void crearArray(ArrayList<Integer> pares100) {
        int contador = 0;
        while (pares100.size() < 100) {
            contador++;
            if (contador % 2 == 0) {
                pares100.add(contador);
            }
        }
    }

    // Escribe el array en el fichero
    public static void volcarArray(PrintWriter pw, ArrayList<Integer> pares100) throws IOException {
        try (pw) {
            for (Integer n : pares100) {
                pw.println(n);
            }
        }
    }

    // Lee y muestra el contenido del fichero
    public static void mostrarFichero() throws IOException {
        try (
            FileReader fr = new FileReader(ruta);
            BufferedReader br = new BufferedReader(fr)
        ) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        }
    }
}