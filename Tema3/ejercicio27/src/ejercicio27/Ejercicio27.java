/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2, num3;
        float num4;
        //añadimos las variables
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, un numero:");
        num1=entrada.nextInt();
        System.out.println("Por favor, un segundo numero:");
        num2=entrada.nextInt();
        //solicitamos al usuario 2 numeros
        do {
            //generamos un do wile para que se repita los calculos hasta que se salga
            System.out.println("Elija una opcion:\n"
                + "1.- Sumar los numeros\n"
                + "2.- Restar los numeros\n"
                + "3.- Multiplicar los numeros\n"
                + "4.- Dividir los numeros\n"
                + "5.- Salir del programa");
            num3 = entrada.nextInt();
            //solicitamos el que quiere hace con los numeros dados
            switch (num3) {
                case 1:
                    System.out.println((num1 + num2));
                    //en caso de que sea 1 los sumamos
                    break;
                case 2:
                    System.out.println((num1 - num2));
                    //en caso de que sea 2 los restamos
                    break;
                case 3:
                    System.out.println((num1 * num2));
                    //en caso de que sea 3 los multiplicamos
                    break;
                case 4:
                    try {
                        num4=num1/num2;
                        //en caso 4 los intentaremos dividir
                    } catch (ArithmeticException e) {
                        System.err.println("No se puede dividir entre 0");
                        num4=0;
                        //si no es posible entonces informaremos que no es posible y pondremos el numero en 0
                    }
                    System.out.println(num4);
                    break;
                case 5:
                    System.out.println("Decidio salirse");
                    //en caso de que sea 5 informaremos que nos salimos y se terminara el programa
                    break;
                default:
                    System.err.println("Opción no valida");
                    //si se da un numero que no este en alguno de los solicitados infromaremos que la opción no es valida
            }
        } while (num3!=5);
    }
}
