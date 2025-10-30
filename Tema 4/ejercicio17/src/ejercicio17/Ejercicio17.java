/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

        
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio17 {
    public static boolean comprobarLetras(double valorAleatorio, int numUsuario) {
        //al poner "numUsuario" como "int" me ahorro el tener que convertirlo de antemano
        boolean comprobante=false;
        if (valorAleatorio == numUsuario) {
            comprobante = true;
        } else if (valorAleatorio<numUsuario) {
            System.out.println("Es una letra anterior");
        } else {
            System.out.println("Es una letra posterior");
        }
        return comprobante;
    }
    public static double letraAleatoria(double valorAleatorio) {
        valorAleatorio = (int) (Math.random() * (122 - 97 + 1) + 97);
        //generamos un numero entre el 97 y el 122 para que represente los numeros ascii de la "a" a la "z"
        return valorAleatorio;
    }
    public static char adivinarLetras(char numUsuario) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Pon una letra minuscula");
        numUsuario = entrada.nextLine().charAt(0);
        //solicito al usuario una letra
        return numUsuario;
    }
    public static void main(String[] args) {
        char numUsuario = 0;
        double valorAleatorio = 0;
        boolean comprobante;
        System.out.println("Vamos a adivinar una letra");
        valorAleatorio=letraAleatoria(valorAleatorio);
        //guardamos la variable con un numero para que represente la letra
        do {
            comprobante=comprobarLetras(valorAleatorio, adivinarLetras(numUsuario));
        } while (comprobante==false);
        //ponemos el bucle en el main por si en algun momento deseamos utilizar el propio comprobante con un numero limitado de ususos
        System.out.println("Felicidades, lo averiguaste");
    }
    
}
