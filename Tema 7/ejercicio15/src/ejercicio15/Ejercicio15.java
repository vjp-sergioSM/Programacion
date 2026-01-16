/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] ventaCoches=new int[12]; //genera el array con espacio de 12
        int selecion;
        do {            
            tabla();
            selecion=entrada.nextInt();
            switch (selecion) {
                case 1:
                    ventasMensuales(ventaCoches);
                    break;
                case 2:
                    mostrarVentas(ventaCoches);
                    break;
                case 3:
                    ventasMostrar(ventaCoches);
                    break;
                case 4:
                    sumaDelAño(ventaCoches);
                    break;
                case 5:
                    sumaDeAñosPares(ventaCoches);
                    break;
                case 6:
                    comprobarMayorVentas(ventaCoches);
                    break;
                case 7:
                    System.out.println("El programa finalizara ahora \n gracias por su tiempo");
                    break;
                    
                default:
                    System.out.println("debes seleccionar un numero entre el 1 y el 7");
            }
        } while (selecion!=7);
        //un bucle que muestre las opciones al usuario, eliga una y llame a los metodos necesarios
    }
    
    public static void tabla() {
        System.out.println("-----------------------");
        System.out.println("1. Rellenar un array de 12");
        System.out.println("-----------------------");
        System.out.println("2. Mostrar las ventas");
        System.out.println("-----------------------");
        System.out.println("3. Mostrar las ventas al reves");
        System.out.println("-----------------------");
        System.out.println("4. Suma del año");
        System.out.println("-----------------------");
        System.out.println("5. Ventas de los meses pares");
        System.out.println("-----------------------");
        System.out.println("6. Nombre del mes con más ventas");
        System.out.println("-----------------------");
        System.out.println("7. Salir");
        System.out.println("-----------------------");
        //tabla para enseñar al usuario las opciones que tiene
    }
    
    public static void ventasMensuales(int[] ventaCoches) {
        for (int i = 0; i < ventaCoches.length; i++) {
            ventaCoches[i]=(int) ((Math.random()*91)+10);
            //guarda un numero aleatorio entre el 10 y el 90 en cada parte del array
        }
    }
    
    public static void mostrarVentas(int[] ventaCoches) {
        for (int i = 0; i < ventaCoches.length; i++) {
            System.out.println(ventaCoches[i]);
            //muestra cada una de los datos del array generados anteriormente
        }
    }
    public static void ventasMostrar(int[] ventaCoches) {
        for (int i = ventaCoches.length -1; i >= 0; i--) {
            System.out.println(ventaCoches[i]);
            //muestra los datos generados anteriormente desde el ultimo al primero
        }
    }
    
    public static void sumaDelAño(int[] ventaCoches) {
        int suma=0;
        for (int i = 0; i < ventaCoches.length; i++) {
            suma+= ventaCoches[i];
        }
        System.out.println(suma);
        //suma todos los datos dentro del array y lo imprime por pantalla
    }
    public static void sumaDeAñosPares(int[] ventaCoches) {
        int suma=0;
        for (int i = 1; i < ventaCoches.length; i+=2) {
            suma+= ventaCoches[i];
        }
        System.out.println(suma);
        //suma todos los datos en posiciones pares y los imprime por pantalla
    }
    public static void comprobarMayorVentas(int[] ventaCoches) {
        String[] meses= {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Dicciembre"};
        //genera un array tipo String con los meses del año
        int comprobante=0;
        int comprobanteMes=0;
        for (int i = 0; i < ventaCoches.length; i++) {
            if (ventaCoches[i]>comprobante) {
                comprobante=ventaCoches[i];
                comprobanteMes=i;
            }
            //comprueba cual es la posicion con mayor numero de ventas y guarda tanto la posicion como el numero para seguir comprobando
        }
        System.out.println(meses[comprobanteMes]);
        //muestra el mes en la posicion en la cual hubo más ventas
    }
}
