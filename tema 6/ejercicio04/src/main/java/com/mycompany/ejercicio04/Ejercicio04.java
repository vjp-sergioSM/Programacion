/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio04;

/**
 *
 * @author alumno
 */
public class Ejercicio04 {

    public static void main(String[] args) {
        Perros p = new Perros("Yakira", 7, 15);
        Lobos lo = new Lobos("kiko", 3, (float) 11.2);
        Leones le = new Leones("Richard Parker", 1, 10);
        Gatos g = new Gatos("Perro", 10, 8);
        //generamos los animales desde su propia clase
        System.out.println(p.toString());
        System.out.println(lo.toString());
        System.out.println(le.toString());
        System.out.println(g.toString());
        //los imprimimos por pantalla

        Animal p2 = new Perros("Yakira", 7, 15);
        Animal lo2 = new Lobos("kiko", 3, (float) 11.2);
        Animal le2 = new Leones("Richard Parker", 1, 10);
        Animal g2 = new Gatos("Perro", 10, 8);
        //generamos los animales desde la clase Animales 

        System.out.println(p2.toString());
        System.out.println(lo2.toString());
        System.out.println(le2.toString());
        System.out.println(g2.toString());
        //los imprimimos por pantalla
    }
}
