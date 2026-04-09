/*
 * Plantilla generada por el IDE
 */
package ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {
    
    // Array de 6 posiciones que representa las dársenas (aparcamientos)
    static ej3_t11.Autobus[] darsenas = new ej3_t11.Autobus[6];

    public static void main(String[] args) {
        int opcion;
        do {
            opcion = scannerInt();
            // Ejecuta la opción elegida
            switch (opcion) {
                case 1 -> aparcarAutobus();
                case 2 -> mostrarLibres();
                case 3 -> buscarAutobus();
                case 4 -> buscarConductor();
                case 5 -> autobusConMasConductores();
                case 6 -> System.out.println("Saliendo");
                default -> System.out.println("Opcion no valida");
            }
        } while (opcion != 6);
    }
    // Menú principal que se repite hasta elegir salir
    public static void menu() {
        System.out.println("Menu de la estacion");
        System.out.println("1. Aparcar autobus");
        System.out.println("2. Mostrar darsenas libres");
        System.out.println("3. Buscar autobus por matricula");
        System.out.println("4. Buscar conductor por DNI");
        System.out.println("5. Autobus con mas conductores");
        System.out.println("6. Salir");
        System.out.println("Elige una opcion");
    }
    // Scanners para leer datos por teclado
    public static String scannerString() {
        Scanner scString = new Scanner(System.in);
        return scString.nextLine();
    }
    public static int scannerInt() {
        Scanner scInt = new Scanner(System.in);
        return scInt.nextInt();
    }

    // Permite aparcar un autobús en una dársena libre
    public static void aparcarAutobus() {
        int aparcamiento;

        // Pedir una posición válida y que esté libre
        do {
            System.out.println("Introduce un aparcamiento del 0 al 5");
            aparcamiento = scannerInt();
        } while (aparcamiento < 0 || aparcamiento > 5 || darsenas[aparcamiento] != null);

        // Crear autobús con matrícula
        System.out.println("Matricula del autobus: ");
        String matricula = scannerString();
        ej3_t11.Autobus a = new ej3_t11.Autobus(matricula);

        // Añadir conductores al autobús
        System.out.println("Cuantos conductores quieres anadir?");
        int n = scannerInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("DNI del conductor: ");
            String dni = scannerString();
            System.out.println("Nombre del conductor: ");
            String nombre = scannerString();
            
            // Se añade cada conductor al autobús
            a.addConductor(new ej3_t11.Conductor(dni, nombre));
        }

        // Guardar el autobús en la dársena
        darsenas[aparcamiento] = a;
        System.out.println("Autobus aparcado correctamente.");
    }

    // Muestra las posiciones libres del array
    public static void mostrarLibres() {
        System.out.println("Darsenas libres: ");
        for (int i = 0; i < darsenas.length; i++) {
            if (darsenas[i] == null) {
                System.out.println(" - Posicion " + i);
            }
        }
    }

    // Busca un autobús por su matrícula
    public static void buscarAutobus() {
        System.out.println("Introduce matricula: ");
        String mat = scannerString();

        for (ej3_t11.Autobus a : darsenas) {
            if (a != null && a.getMatricula().equalsIgnoreCase(mat)) {
                System.out.println(a);
                return; // termina al encontrarlo
            }
        }
        System.out.println("No se ha encontrado.");
    }

    // Busca en qué autobús está un conductor por su DNI
    public static void buscarConductor() {
        System.out.println("Introduce el DNI del conductor: ");
        String dni = scannerString();

        for (ej3_t11.Autobus a : darsenas) {
            if (a != null && a.getConductores().containsKey(dni)) {
                System.out.println("El conductor esta en el autobus con matricula: " + a.getMatricula());
                return;
            }
        }
        System.out.println("No se ha encontrado.");
    }

    // Encuentra el autobús con mayor número de conductores
    public static void autobusConMasConductores() {
        int max = -1;
        int posmax = -1;

        for (int i = 0; i < darsenas.length; i++) {
            if (darsenas[i] != null) {
                int num = darsenas[i].getConductores().size();
                
                // Actualiza el máximo si encuentra uno mayor
                if (num > max) {
                    max = num;
                    posmax = i;
                }
            }
        }

        // Mostrar resultado
        if (posmax == -1) {
            System.out.println("No hay autobuses aparcados");
        } else {
            System.out.println("El autobus con mas conductores esta en la posicion " + posmax);
            System.out.println(darsenas[posmax]);
        }
    }
}