/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio32;
import java.util.Scanner;
//comando para permitir que el programa pida información
/**
 *
 * @author alumno
 */
public class Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int billete50,billete20,billete10,billete5,moneda2,moneda1,dinero, resto;
        System.err.println("Porfavor, indique una cantidad de dinero:");
        //Informamos al usuario que necesitamos y de que forma
        Scanner entrada = new Scanner(System.in);
        //Solicitamos información
        dinero = entrada.nextInt();
        //Guardamos la información dada en una variable
        billete50 = dinero/50;
        resto = dinero % 50;
        billete20=resto/20;
        resto=resto%20;
        billete10=resto/10;
        resto=resto%10;
        billete5= resto/5;
        resto= resto%5;
        moneda2= resto/2;
        resto= resto%2;
        moneda1=resto;
        //hacemos los calculos con la variable resto para asegurar cuanto dinero queda para el siguiente billete/moneda
        System.out.println(dinero + " Euros se descomponene en " +billete50+" billetes de 50, "+billete20+" billetes de 20, "+billete10+" billetes de 10, "+billete5+" billetes de 5,"+moneda2+" monedas de 2 euros y "+moneda1+" monedas de 1 euro." );


    }
    
}
