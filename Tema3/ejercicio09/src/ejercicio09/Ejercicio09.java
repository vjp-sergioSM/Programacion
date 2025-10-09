/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2, num3, num4, numero, vacio;
        System.err.println("Porfavor, introduzca un numero de 4 cifras:");
        //Informamos al usuario que necesitamos y de que forma
        Scanner entrada = new Scanner(System.in);
        //Solicitamos información
        numero = entrada.nextInt();
        //Guardamos la información dada en una variable
        num1 = numero / 1000;
        num2 = (numero / 100) - (num1 * 10);
        num3 = (numero / 10) - ((num1 * 100) + (num2 * 10));
        num4 = numero - ((num1* 1000) + (num2 * 100) + (num3 * 10));
        //los calculos para conocer que numero hay en cada cifra
        System.out.println("La primera cifra es:" + num1);
        System.out.println("La segunda cifra es:" + num2);
        System.out.println("La tercera cifra es:" + num3);
        System.out.println("La cuarta cifra es:" + num4);
        //Informamos que numero esta en cada posición
        if (num1>num2) {
            vacio=num1;
            num1=num2;
            num2=vacio;
        } 
        //revisamos si el numero es mayor al anterior y si es asi los cambiamos de lugar y repetimos con los siguientes numeros
        if (num2>num3) {
            vacio = num2;
            num2 = num3;
            num3 = vacio;
        }
        if (num3>num4) {
            vacio = num3;
            num3 = num4;
            num4 = vacio;  
        }
        //una vez hecho el proceso lo repetimos otras 2 veces para asegurarnos que todos los numeros esten en orden
        if (num1>num2) {
            vacio=num1;
            num1=num2;
            num2=vacio;
        } 
        if (num2>num3) {
            vacio = num2;
            num2 = num3;
            num3 = vacio;
        }
        if (num3>num4) {
            vacio = num3;
            num3 = num4;
            num4 = vacio;  
        }
        if (num1>num2) {
            vacio=num1;
            num1=num2;
            num2=vacio;
        } 
        if (num2>num3) {
            vacio = num2;
            num2 = num3;
            num3 = vacio;
        }
        if (num3>num4) {
            vacio = num3;
            num3 = num4;
            num4 = vacio;  
        }
        System.out.println("El orden de los números introducidos es el " + num1 + " - " + num2 + " - " + num3 + " - " + num4);
        //entregamos los numeros en orden al  usuario
        
    }
    
}
