/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio20;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio20 {

    public static String capitalEsp= "Madrid";
    public static String descubrioAme= "Colon";
    //generamos las estaticas que representan las soluciones
    public static void examen(String[] args) {
        boolean nota1,nota2;
        int notaexamen=0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("EXAMEN DE CULTURA GENERAL");
        System.out.println("1ª PREGUNTA: ¿Cuál es la capital de España?:");
        String respuesta1=entrada.nextLine();
        if (respuesta1.equals(capitalEsp)) {
            nota1=true;
            System.out.println("Muy bien, respuesta correcta");
        } else {
            nota1=false;
            System.out.println("No es correcto. La respuesta correcta seria " + capitalEsp);
        }
        //guardamos si la respuesta es correcta o no en la pregunta 1
        System.out.println("2ª PREGUNTA: ¿Quién descubrió América?:");
        String respuesta2=entrada.nextLine();
        if (respuesta2.equals(descubrioAme)) {
            nota2=true;
            System.out.println("Muy bien, respuesta correcta");
        } else {
            nota2=false;
            System.out.println("No es correcto. La respuesta correcta seria " + descubrioAme);
        }
        //hacemos lo mismo con la pregunta 2
        if (nota1) {
            notaexamen+=5;
        }
        if (nota2) {
            notaexamen+=5;
        }
        //si las notas son "true" entonces se le sumara 5 a la nota final de examen
        System.out.println("NOTA DEL EXAMEN: "+ notaexamen);
    }
    public static void main(String[] args) {
        examen(args);
    }
    
}
