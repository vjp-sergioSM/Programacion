/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio04;

/**
 *
 * @author alumno
 */
public abstract class Animal {
    private String nombre;
    private int edad;
    private float peso;
    
    public Animal(){
    nombre="";
    edad=0;
    peso=0;
    }
    public Animal(String n, int e, float p){
    nombre=n;
    edad=e;
    peso=p;
    }
    //creamos las variables y preparamos el que al crear el objeto lo hagan con las variables añadidas o vacias
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        nombre = n;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int e) {
        edad = e;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float p) {
        peso = p;
    }
    //creamos los geter y seter
     public abstract String setSonido();
     public abstract String setAlimentacion();
     public abstract String setHabitat();
     public abstract String setNombreCientifico();
     //creamos los metodos abstractos 
    @Override
    public String toString() {
        return "nombre=" + nombre + ", edad=" + edad + ", peso=" + peso;
    }
    //el toString
}
