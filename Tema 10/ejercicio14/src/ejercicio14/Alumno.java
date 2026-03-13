/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14;

import static ejercicio14.Ejercicio14.scanerInt;
import static ejercicio14.Ejercicio14.scanerString;
import java.util.Arrays;

/**
 *
 * @author alumno
 */
public class Alumno {
    private  String nombre;
    private Asignatura[] asignaturas;
    
    public Alumno(){
        nombre="";
        asignaturas=new Asignatura[3];
    }
    public Alumno(String no,Asignatura[] asi){
        nombre=no;
        asignaturas=asi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Asignatura[] getAsignaturas() {
        return asignaturas;
    }
    
    public float getNotaX(int numero) {
        return asignaturas[numero].getNota();
    }
    
    public void setAsignaturas(Asignatura[] asignaturas) {
        this.asignaturas = asignaturas;
    }
    public void rellenarAlumno(){
        System.out.println("Introduzca el nombre del alumno: ");
        nombre=scanerString();
        System.out.println("Introduzca la nota de Lengua: ");
        asignaturas[0].setNombre("Lengua");
        asignaturas[0].setNota(scanerInt());
        System.out.println("Introduzca la nota de Mates: ");
        asignaturas[1].setNombre("Mates");
        asignaturas[1].setNota(scanerInt());
        System.out.println("Introduzca la nota de Fisica: ");
        asignaturas[2].setNombre("Fisica");
        asignaturas[2].setNota(scanerInt());
    }
    public float calcularMayorMedia(){
        float notaL, notaM, notaF;
        notaL=asignaturas[0].getNota();
        notaM=asignaturas[1].getNota();
        notaF=asignaturas[2].getNota();
        return (float) (notaL+notaM+notaF)/3;
    }
    
    
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", asignaturas=" + Arrays.toString(asignaturas) + '}';
    }
   
}
