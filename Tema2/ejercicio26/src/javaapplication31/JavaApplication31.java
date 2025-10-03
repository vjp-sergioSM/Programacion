/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication31;
import java.util.Scanner;
//comando para permitir que el programa pida información
/**
 *
 * @author alumno
 */
public class JavaApplication31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, y, z, w, xyzw; 
        System.err.println("Porfavor, introduzca un numero de 4 cifras:");
        //Informamos al usuario que necesitamos y de que forma
        Scanner entrada = new Scanner(System.in);
        //Solicitamos información
        xyzw = entrada.nextInt();
        //Guardamos la información dada en una variable
        x= xyzw / 1000;
        y= (xyzw/100)-(x*10);
        z= (xyzw /10)-((x*100)+(y*10));
        w= xyzw-((x*1000)+(y*100)+(z*10));
        //los calculos para conocer que numero hay en cada cifra
        System.out.println("La primera cifra es:" + x);
        System.out.println("La segunda cifra es:"+ y);
        System.out.println("La tercera cifra es:"+ z);
        System.out.println("La cuarta cifra es:"+ w);
        //Informamos que numero esta en cada posición
    }
    
}
