/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

import java.util.Scanner;

/**
 *
 * Ejercicio 14.- Crea un programa en JAVA que que imprima todos
los números múltiplos de 3 que existen entre el número 1 y otro
número introducido por el usuario.
• Controla que el usuario te meta un número mayor que 0 y, sino,
avísale del error y vuélveselo al pedir las veces que hagan falta.
• Por último infórmale al usuario del total de números mostrados.
• Crea un método para pedir el dato al usuario, otro para comprobar
que es mayor que 0 y otro para hacer los cálculos y mostrar el
resultado.

 */
public class Ejercicio14 {
    public static int solicitud(int num) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Da un numero para ver cuantos multiplos de 3 hay entre el 1 y el numero dado");
        num = entrada.nextInt();
        return num;
        //guardamos el numero dado al usuario y lo devolvemos al main
    }
    public static boolean comprovacion(int num) {
        boolean comprobante=false;
        if (num>=1) {
            comprobante=true;
        } else {
            System.err.println("Debe poner un numero mayor a 0");
        }
        return comprobante;
        //comprobamos que el numero dado este en los parametos deseados
    }
    public static void resultado(int num) {
        System.out.println("Los multiplos del 3 desde el 1 hasta el " + num);
        int cantidad=0;
        for (int i = 1; i <= num; i++) {
            if (i%3==0) {
                //comprobamos si es multiplo de 3
                System.out.println(i);  
                cantidad++;
            }
        }
        System.out.println("Se generaron "+ cantidad + " numeros");
        //generamos el resultado
    }
    public static void main(String[] args) {
        int num=0;
        boolean comprobante;
        do {            
            num=solicitud(num);
            comprobante=comprovacion(num);
        } while (comprobante==false);
        //si el parametro es deseado se saldra del bucle, si no se volvera a solicitar de forma indefinida
        resultado(num);
    }
    
}
