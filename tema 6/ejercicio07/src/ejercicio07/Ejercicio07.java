/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07;

/**
 *
 * @author alumno
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Televisor t =new Televisor();
        Radio r =new Radio();
        //generamos los objetos
        
        t.encender();
        System.out.println(t.toString());
        for (int i = 0; i < 3; i++) {
            t.subirVolumen();
        }
        System.out.println(t.getVolumen());
        t.cambiarCanal(6);
        t.bajarVolumen();
        t.apagar();
        System.out.println(t.toString());
        //todos los comandos necesarios de la televisión
        
        r.encender();
        System.out.println(r.toString());
        for (int i = 0; i < 3; i++) {
            r.subirVolumen();
        }
        System.out.println(r.getVolumen());
        r.cambiarCanal(6);
        r.bajarVolumen();
        r.apagar();
        System.out.println(r.toString());
        //todos los comandos necesarios de la radio

    }
    
}
