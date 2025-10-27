/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio07 {

    public static void comprueba(int num1,int num2,int num3,int num4) {
        int vaso;
        for (int i = 0; i < 3; i++) {
            if (num1>num2) {
                vaso=num2;
                num2=num1;
                num1=vaso;
            }
            if (num2>num3) {
                vaso = num3;
                num3 = num2;
                num2 = vaso;
            } 
            if (num3>num4) {
                vaso = num4;
                num4 = num3;
                num3 = vaso;
            }
            //cambiamos de orden los numeros n-1 veces para que esten de menor a mayor
        }
        System.out.println("el orden de los numero introducudios es el " + num1 + " - " + num2 + " - " + num3 + " - " + num4);

    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca un numero:");
        int num1=entrada.nextInt();
        System.out.println("Ahora, introduzca un segundo numero:");
        int num2=entrada.nextInt();
        System.out.println("Introduzca un cuarto numero:");
        int num3=entrada.nextInt();
        System.out.println("Por ultimo, introduzca un cuarto numero:");
        int num4=entrada.nextInt();
        //solicitamos los numeros al usuario y se los mandamos al metodo para calcular el menos
        comprueba(num1, num2, num3, num4);
    }
    
}
