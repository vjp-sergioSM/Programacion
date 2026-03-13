/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Integer> lista= new ArrayList<>();
        System.out.println("Introduce una lista de numeros");
        do {            
            lista.add(solicitarNumero());
        } while (solicitarSegir());
        System.out.println("El numero par mas grande es: " + verMayorPar(lista));
        System.out.println("El numero inpar mas pequeño es: " + verMenorInpar(lista));
        
    }
    public static boolean solicitarSegir() {
        Scanner entradaSolicitar =new Scanner(System.in);
        System.out.println();
        boolean volver;
        System.out.println("""
                           Desea seguir?
                           si o no?""");
        String respuesta= entradaSolicitar.nextLine();
        volver = respuesta.equals("si");
        return volver;
    }
    public static int solicitarNumero() {
        Scanner entradaNumero = new Scanner(System.in);
        return entradaNumero.nextInt();
    }
    public static int verMayorPar(ArrayList<Integer> lista) {
        int mayor = lista.get(0);
        for (int i = 0; i < lista.size(); i++) {
            if (mayor < lista.get(i) && i%2==0) {
                mayor = lista.get(i);
            }
        }
        return mayor;
    }
    public static int verMenorInpar(ArrayList<Integer> lista) {
        int menor = lista.get(0);
        for (int i = 0; i < lista.size(); i++) {
            if (menor > lista.get(i) && i%2!=0) {
                menor = lista.get(i);
            }
        }
        return menor;
    }


}
