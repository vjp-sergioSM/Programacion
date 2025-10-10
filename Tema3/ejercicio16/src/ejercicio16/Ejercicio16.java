/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

/**
 *
 * @author alumno
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero1 = 20, revisar,numero2=0;
        //generamos las variables y ponemos numero en 20
        System.out.print("Los numero impares existentes entre el numero 20 y 160 son: ");
        do {
            //ponemos la variable "do" para que haga lo de debajo
            revisar = numero1 % 2;
            //revisamos si el numero actual es par o inpar 
            if (revisar != 0) {
                System.out.print(+numero1 + "-");
                numero2++;
            }
            //si el numero es inpar lo ponemos en pantalla
            numero1++;
            //añadimos 1 digito para que no sea siempre el mismo numero
        } while (numero1 <= 160);
        //ponemos que se repita siemopre que numero sea distinto a 160
        System.out.println("\nLa cantidad de numeros impares impresos han sido: " +numero2);

    }
    
}
