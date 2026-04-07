/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio08 {

    private static int cantidadCiudades; // contador de ciudades

    public static void main(String[] args) {
        int opcion;
        HashSet<Ciudades> lista = new HashSet<>(); // conjunto de ciudades

        do {            
            mostrarMenu(); // mostrar menú
            opcion = scannerInt(); // leer opción

            switch (opcion) {
                case 1:
                    añadirCiudad(lista); // añadir ciudad
                    break;
                case 2:
                    mostrarCiudades(lista); // mostrar todo
                    break;
                case 3:
                    mostrarSuperiorMedia(lista); // sedes > media
                    break;
                case 4:
                    buscarPorSede(lista); // buscar sede
                    break;
                case 5:
                    añadirSedeCiudad(lista); // añadir sede a ciudad
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 6); // repetir hasta salir
    }

    public static void mostrarMenu() {
        System.out.println("\n--- MENÚ ---");
        System.out.println("1. Añadir ciudad");
        System.out.println("2. Mostrar ciudades/sedes");
        System.out.println("3. Mostrar sedes ingresos mayor a la media");
        System.out.println("4. Buscar por nombre de sede");
        System.out.println("5. Mostrar sedes ordenadas por ingresos");
        System.out.println("6. Salir");
        System.out.print("Elige opción: ");
    }

    // leer String
    public static String scannerString() {
        Scanner scString = new Scanner(System.in);
        return scString.nextLine();
    }

    // leer int
    public static int scannerInt() {
        Scanner scInt = new Scanner(System.in);
        return scInt.nextInt();
    }

    // leer float
    public static float scannerFloat() {
        Scanner scFloat = new Scanner(System.in);
        return scFloat.nextFloat();
    }

    // añadir ciudad con sedes
    public static void añadirCiudad(HashSet<Ciudades> lista) {
        System.out.println("Introduzca el nombre de la ciudad:");
        String cNombre = scannerString();

        boolean continuar;
        int opcion2;

        Ciudades ciudad = new Ciudades(); // crear ciudad
        ciudad.setNombre(cNombre);

        do {            
            ciudad.añadirSede(); // añadir sede

            System.out.println("Desea continuar?");
            System.out.println("1.si");
            System.out.println("2.no");

            opcion2 = scannerInt();
            continuar = opcion2 != 2; // seguir si no es 2

        } while (continuar);

        lista.add(ciudad); // guardar ciudad
        cantidadCiudades += 1;
    }

    // mostrar todas las ciudades
    public static void mostrarCiudades(HashSet<Ciudades> lista) {
        for (Ciudades ciudades : lista) {
            System.out.println(ciudades.toString());
        }
    }

    // mostrar sedes con ingresos superiores a la media
    public static void mostrarSuperiorMedia(HashSet<Ciudades> lista) {
        for (Ciudades ciudades : lista) {
            System.out.println(ciudades.getNombre()); // nombre ciudad
            ciudades.devolverMedia(); // sedes > media
        }
    }

    // buscar sede por nombre
    public static void buscarPorSede(HashSet<Ciudades> lista) {
        System.out.println("Ingrese el nombre de la sede que desea buscar:");
        String nombreBuscar = scannerString();

        boolean encontrado = false;

        // recorrer ciudades
        for (Ciudades ciudad : lista) {
            if (ciudad.buscarSede(nombreBuscar)) {
                System.out.println("Sede encontrada en: " + ciudad.getNombre());
                encontrado = true;
            }
        }

        // si no se encontró
        if (!encontrado) {
            System.out.println("No se encontró la sede");
        }
    }

    // añadir sede a una ciudad existente
    public static void añadirSedeCiudad(HashSet<Ciudades> lista) {
        System.out.println("Nombre de la ciudad:");
        String nombreCiudad = scannerString();

        boolean encontrada = false;

        // buscar ciudad
        for (Ciudades ciudad : lista) {
            if (ciudad.getNombre().equalsIgnoreCase(nombreCiudad)) {
                ciudad.añadirSede(); // añadir sede
                encontrada = true;
            }
        }

        // si no existe la ciudad
        if (!encontrada) {
            System.out.println("Ciudad no encontrada");
        }
    }
}