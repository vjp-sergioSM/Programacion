/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada1 = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        Scanner entrada3 = new Scanner(System.in);
        System.out.println("Por favor, introduzca un numero:");
        int numero1 = entrada1.nextInt();
        System.out.println("Ahora, introduzca un segundo numero:");
        int numero2 = entrada2.nextInt();
        System.out.println("Por último, introduzca un tercer numero:");
        int numero3 = entrada3.nextInt();
        if (numero1 > numero2) {
            if (numero1>numero3) {
                System.out.println("El número mayor de los introducidos es el " + numero1);

            } else {
                System.out.println("El número mayor de los introducidos es el " + numero3);
            }
        } else {
            if (numero2>numero3) {
                System.out.println("El número mayor de los introducidos es el " + numero2);

            } else {
                System.out.println("El número mayor de los introducidos es el " + numero3);

            }
        }

    }
    
}
