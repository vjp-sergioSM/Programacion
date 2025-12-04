/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entradaCuenta = new Scanner(System.in);
        int numUsuario;
        Cuenta cuenta = null;
        do {
            menu();
            numUsuario=scaner();
            switch (numUsuario) {
                case 1:
                    System.out.println("cree una clave para la cuenta");
                    String clave1=entradaCuenta.nextLine();
                    cuenta = new CuentaClave(0,clave1);
                    System.out.println("Cuenta creada con 0 de saldo");
                    break;
                case 2:
                    System.out.println("Introduzca un saldo");
                    float saldoInicial= entradaCuenta.nextFloat();
                    entradaCuenta.nextLine();
                    System.out.println("cree una clave para la cuenta");
                    String clave2=entradaCuenta.nextLine();
                    cuenta = new CuentaClave(saldoInicial, clave2);
                    System.out.println("Cuenta creada con saldo");
                    break;
                case 3:
                    if (cuenta==null) {
                        System.err.println("Primero debes crear una cuenta");
                    } else {
                        System.out.println("Introduzca la cantidad a ingresar");
                        float C=entradaCuenta.nextFloat();
                        cuenta.ingresar(C);
                    }
                    break;
                case 4:
                    if (cuenta==null) {
                        System.out.println("Primero debes crear una cuenta");
                    } else {
                        System.out.println("Introduzca la cantidad a retirar");
                        float C = entradaCuenta.nextFloat();
                        cuenta.extraer(C);

                    }
                    break;
                case 5:
                    if (cuenta==null) {
                        System.err.println("Primero debes crear una cuenta");
                    } else {
                        System.out.println(cuenta.toString());
                    }
                    break;
                case 6:
                    break;
                default:
                    System.err.println("Solo aceptamos numeros del 1 al 6");
            }
        } while (numUsuario!=6);
    }
    public static void menu(){
        System.out.println("Seleciona una opcion");
        System.out.println("1.-Crear cuenta vacia.");
        System.out.println("2.-Crear cuenta con saldo inicial.");
        System.out.println("3.-Ingresar dinero.");
        System.out.println("4.-Sacar dinero.");
        System.out.println("5.-Ver saldo.");
        System.out.println("6.-Salir.");
    }
        public static int scaner(){
            Scanner entradaOpcion = new Scanner(System.in);
            return entradaOpcion.nextInt();
        }
}