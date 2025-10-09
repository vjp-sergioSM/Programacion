/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        //ponemos el escaner
        System.out.println("Por favor, introduzca su nota entre el 0 y el 10:");
        int nota = entrada.nextInt();
        //solicitamos su nota al usuario y se lo aplicamos a la variable
        if (nota <0) {
            System.out.println("Nota no valida.");
        } else {
            if (nota <=4) {
                System.out.println("Suspenso.");
            } else {
                if (nota<6) {
                    System.out.println("Bien.");                    
                } else {
                    if (nota<8) {
                        System.out.println("Notable.");
                    } else {
                        if (nota<10) {
                            System.out.println("Sobresaliente.");
                        } else {
                            System.out.println("Nota no valida.");
                        }
                    }
                }
            }
        }
        //añadimos todos estos if para asegurarnos de que el dato que demos tenga sentido con el numero recibido


    }
    
}
