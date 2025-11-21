/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio16;

/**
 *
 * @author alumno
 */
public class Alumno {
    private String nombre;
    private int nota;
    //creamos las variables privadas
    public Alumno(){
    nombre="";
    nota=0;
    }
    //creamos el metodo por defecto
    public Alumno(String nom, int not){
    nombre=nom;
    nota=not;
    }
    //creamos el metodo con toda la información añadida
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nom){
        nombre = nom;
    }
    public int getNota(){
        return nota;
    }
    public void setNota(int not){
        nota = not;
    }
    //los geter y seter
    public void mostrarCalificacion (int not){
        switch (not) {
            case 0,1,2,3,4 -> System.out.println("Suspenso");
            case 5,6 -> System.out.println("Bien");
            case 7,8 -> System.out.println("Notable");
            case 9,10 -> System.out.println("Sobresaliente");
            default -> System.out.print("error, nota introducida no esta entre el 0 y 10");
        }
    }
    //un metodo para mostrar la nota

    @Override
    public String toString() {
        return "nombre:" + nombre + "\n" + "nota:" + nota + "";
    }
    //el toString
    
}
