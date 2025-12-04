/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio04;

/**
 *
 * @author alumno
 */
public class Lobos extends Canidos {
    public Lobos(){
    super();
    }
    public Lobos(String n, int e, float p){
    super(n, e, p);
    }

    @Override
    public String setSonido(){
        return "Su sonido es: Un aullido.";
    }
    @Override
    public String setAlimentacion(){
        return "Su alimentacion es: Carnivora.";
    }
    @Override
    public String setHabitat(){
        return "Su habitad es: Bosque.";
    }
    @Override
    public String setNombreCientifico(){
        return "Su nombre cientifico es: Canis lupus.";
    }

    @Override
    public String toString() {
        return super.toString() + setSonido() + setAlimentacion() + setHabitat() +setNombreCientifico();
    }
    
}
