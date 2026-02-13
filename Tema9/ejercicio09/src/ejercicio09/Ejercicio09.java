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
        boolean correcto,minim,usu,digi;
        System.out.println("introduce un usuario");
        String usuario=solicitarUsuario();
        do {            
            System.out.println("introduce una contraseña");
            String contraseña = solicitarContraseña();
            if (contraseña.length()<6) {
                System.out.println("La contraseña debe ser mayor");
                minim = false;
                //si la contraseña es menor a 6 digitos le informamos al usuario
            }else{
                minim=true;
            }
            if (contraseña.contains(usuario)) {
                System.out.println("La contraseña no debe contener el nombre de usuario");
                usu = false;
                //si la contraseña tiene contiene el nombre de usuario informamos
            }else {
                usu=true;
            }
            if (contraseña.matches(".*\\d.*\\d.*")) {
                digi=true;
                //".*\\d.*\\d.*" con la clase matches toma el \\d como si fuera un digito por lo que busca si hay 2 digitos en la contraseña
            } else {
                System.out.println("La contraseña debe contener 2 digitos");
                digi=false;
                //si no cumple informamos al usuario 
            }
            if (minim && usu && digi ) {
                correcto=true;
                //si los 3 bolean son true entonces terminamos el bucle
            }else {
                System.out.println("Vuelva a intentar poner la contraseña");
                correcto=false;
            }
        } while (!correcto);
        System.out.println("Usuario creado con exito");
    }
    public static String solicitarUsuario() {
        Scanner entradaUsuario = new Scanner(System.in);
        return entradaUsuario.nextLine();
    }
    public static String solicitarContraseña() {
        Scanner entradaContraseña = new Scanner(System.in);
        return entradaContraseña.nextLine();
    }

    
}
