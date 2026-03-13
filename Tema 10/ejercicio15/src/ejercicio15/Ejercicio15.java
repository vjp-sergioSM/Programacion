/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    private static int cantidadEmpresas;
    public static void main(String[] args) {
        int eleccion=0,cantidadEmpresas=0;
        ArrayList<Empresa> listaEmpresas = new ArrayList<>();
        do {
            menu();
            eleccion=scanerInt();
            switch (eleccion) {
                case 1:
                    añadirEmpresasYEmpleados(listaEmpresas);
                    break;
                case 2:
                    mostrarEmpresasYEmpleados(listaEmpresas);
                    break;
                case 3:
                    mostrarEmpleadosPorA(listaEmpresas);
                    break;
                case 4:
                    mostrarEmpleadosPorSueldo(listaEmpresas);
                    break;
                case 5:
                    System.out.println("chao");
                    break;
                default:
                    System.out.println("Pon un numero entre el 1 y el 5");
            }
        } while (eleccion!=5);
    }
    public static void menu() {
        System.out.println("-------------------------------------");
        System.out.println("1. Añadir empresa y empleados");
        System.out.println("-------------------------------------");
        System.out.println("2. Mostrar empresas y empleados");
        System.out.println("-------------------------------------");
        System.out.println("3. Mostrar empleados que empiecen por 'A'");
        System.out.println("-------------------------------------");
        System.out.println("4. Mostrar empleados por sueldo");
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
    public static void añadirEmpresasYEmpleados(ArrayList<Empresa> listaEmpresas) {
        boolean continuar=true;
        do {
            listaEmpresas.add(new Empresa());
            System.out.println("Añade el nombre de la empresa");
            listaEmpresas.get(cantidadEmpresas).setNombreEmpresa(scanerString());
            System.out.println("Indique la cantidad de empleados de la empresa");
            listaEmpresas.get(cantidadEmpresas).rellenarEmpleados(scanerInt());
            System.out.println("""
                               Quiere a\u00f1adir otra empresa? 
                               1.Si 
                               2.No 
                               """);
            if (2==scanerInt()) {
                continuar=false;
            }else{
                cantidadEmpresas++;
            }
            
        } while (continuar);
    }
    
    public static void mostrarEmpresasYEmpleados(ArrayList<Empresa> listaEmpresas) {
        for (int i = 0; i < listaEmpresas.size(); i++) {
            System.out.println(listaEmpresas.get(i).toString());
        }
    }
    public static void mostrarEmpleadosPorA(ArrayList<Empresa> listaEmpresas) {
        for (int i = 0; i < listaEmpresas.size(); i++) {
            System.out.println("Empleados que empiecen por 'A' en la empresa " + listaEmpresas.get(i).getNombreEmpresa());
            listaEmpresas.get(i).mostrarEmpleadosA();
        }
    }
    public static void mostrarEmpleadosPorSueldo(ArrayList<Empresa> listaEmpresas) {
        ArrayList<Empleados> listaEmpleados=new ArrayList<>();
        Empleados burbuja;
        for (int i = 0; i < listaEmpresas.size(); i++) {
            for (int j = 0; j < listaEmpresas.get(i).getEmpleados().size(); j++) {
                listaEmpleados.add(new Empleados(listaEmpresas.get(i).getEmpleados().get(j).getNombreEmpleado(), listaEmpresas.get(i).getEmpleados().get(j).getSueldo()));
            }
        }
        
        for (int i = 0; i < listaEmpleados.size(); i++) {
            if (listaEmpleados.get(i).getSueldo()<listaEmpleados.get(i-1).getSueldo()) {
                burbuja=listaEmpleados.get(i);
                listaEmpleados.set(i, listaEmpleados.get(i-1));
                listaEmpleados.set(i-1, burbuja);
            }
        }
        System.out.println("Los empleados por sueldo de mayor a menor");
        for (Empleados listaEmpleado : listaEmpleados) {
            System.out.println(listaEmpleado.toString());
        }
    }
}
