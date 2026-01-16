/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author alumno
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[10];
        rellenar(vector);
        imprimir(vector);
        sustituir(vector);
        System.out.println("------------");
        imprimir(vector);
        //crea el array unidimensional y llama a los metodos necesarios 
    }
    public static void rellenar(int [] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i]=(int) ((Math.random()*8)+1);
        }
        //genera numeros aleatorios entre el 1 y el 9 para guardarols en cada espacio del array hasta rellenar el array
    }
    
    public static void imprimir (int [] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);  
      }
        //imprime por pantalla todos los numeros del vector
    }
    public static void sustituir(int []vector){
        int j;
        boolean encontrado=false;
        for (int i = 0; i < vector.length; i++) {
            j=0;
            encontrado=false;
            //reinicia las variables j y encontrado para pasar al siguiente numero del array
            while (j < vector.length && !encontrado) {
                if (vector [i]== vector[j] && i!=j) {
                    vector[i]=0;
                    vector[j]=0;
                    encontrado=true;
                }
                j++;
            }
        }
        //comprueba los numeros guardados y en cuanto encuentre 2 numeros iguales que no esten en la misma posición los vuelve 0
    }
}
