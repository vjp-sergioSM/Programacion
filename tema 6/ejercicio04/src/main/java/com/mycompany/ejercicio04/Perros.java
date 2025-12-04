/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio04;

/**
 *
 * @author alumno
 */
public class Perros extends Canidos {
    public Perros(){
    super();
    }
    public Perros(String n, int e, float p){
    super(n, e, p);
    }
    //añadimos las variables diciendo que las hereda de la clase superior
    @Override
    public String setSonido(){
        return "Su sonido es: Un ladrido.";
    }
    @Override
    public String setAlimentacion(){
        return "Su alimentacion es: Carnivora.";
    }
    @Override
    public String setHabitat(){
        return "Su habitad es: Domestico.";
    }
    @Override
    public String setNombreCientifico(){
        return "Su nombre cientifico es: LadridoCanis lupus familiaris.";
    }
    //sobre escibimos los metodos abstractos 
    @Override
    public String toString() {
        return super.toString() + setSonido() + setAlimentacion() + setHabitat() +setNombreCientifico();
    }
    
}
