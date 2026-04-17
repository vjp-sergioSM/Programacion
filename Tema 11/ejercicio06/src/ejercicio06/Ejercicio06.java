/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06;

import java.util.Collections;
import java.util.Scanner;

public class Ejercicio06 {

    // Scanner global para leer datos
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // Crear campaña
        Campania campania = new Campania();
        campania.setNombre("Campaña COVID");

        int opcion;

        // Bucle del menú
        do {
            opcion = mostrarMenu();

            switch (opcion) {
                case 1 -> anadirDonacion(campania);
                case 2 -> mostrarDonaciones(campania);
                case 3 -> buscarPorNombre(campania);
                case 4 -> mostrarNumeroDonaciones(campania);
                case 5 -> mostrarTotal(campania);
                case 6 -> ordenarDonaciones(campania);
                case 7 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida.");
            }

        } while (opcion != 7);
    }

    // Muestra el menú y devuelve opción
    public static int mostrarMenu() {
        System.out.println("\n--- MENÚ ---");
        System.out.println("1. Añadir donación");
        System.out.println("2. Mostrar donaciones");
        System.out.println("3. Buscar por nombre");
        System.out.println("4. Número de donaciones");
        System.out.println("5. Total recaudado");
        System.out.println("6. Ordenar donaciones");
        System.out.println("7. Salir");
        System.out.print("Elige opción: ");

        int op = sc.nextInt();
        sc.nextLine(); // limpiar buffer
        return op;
    }

    // Añade una nueva donación
    public static void anadirDonacion(Campania campania) {
        System.out.print("Nombre del donante: ");
        String nombre = sc.nextLine();

        System.out.print("Cantidad: ");
        int cantidad = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        Donacion d = new Donacion(cantidad, nombre);
        campania.getDonaciones().add(d);

        System.out.println("Donación añadida.");
    }

    // Muestra todas las donaciones
    public static void mostrarDonaciones(Campania campania) {
        if (campania.getDonaciones().isEmpty()) {
            System.out.println("No hay donaciones.");
        } else {
            for (Donacion d : campania.getDonaciones()) {
                System.out.println(d);
            }
        }
    }

    // Busca donaciones por nombre
    public static void buscarPorNombre(Campania campania) {
        System.out.print("Introduce nombre a buscar: ");
        String nombre = sc.nextLine();

        boolean encontrado = false;

        for (Donacion d : campania.getDonaciones()) {
            if (d.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(d);
                encontrado = true;
            }
        }

        // Si no encuentra nada
        if (!encontrado) {
            System.out.println("No se encontraron donaciones.");
        }
    }

    // Muestra el número total de donaciones
    public static void mostrarNumeroDonaciones(Campania campania) {
        System.out.println("Número de donaciones: " + campania.getDonaciones().size());
    }

    // Calcula el dinero total recaudado
    public static void mostrarTotal(Campania campania) {
        int total = 0;

        for (Donacion d : campania.getDonaciones()) {
            total += d.getCantidad();
        }

        System.out.println("Total recaudado: " + total);
    }

    // Ordena donaciones de mayor a menor
    public static void ordenarDonaciones(Campania campania) {
        Collections.sort(
            campania.getDonaciones(),
            (Donacion d1, Donacion d2) -> d2.getCantidad() - d1.getCantidad()
        );

        System.out.println("Donaciones ordenadas de mayor a menor.");
    }
}