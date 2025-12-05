/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio04;

/**
 *
 * @author alumno
 */
public class Leones extends Felinos {
    public Leones(){
    super();
    }
    public Leones(String n, int e, float p){
    super(n, e, p);
    }

    @Override
    public String setSonido(){
        return "Su sonido es: Un rugido.";
    }
    @Override
    public String setAlimentacion(){
        return "Su alimentacion es: Carnivora.";
    }
    @Override
    public String setHabitat(){
        return "Su habitad es: Sabana.";
    }
    @Override
    public String setNombreCientifico(){
        return "Su nombre cientifico es: Panthera leo.";
    }

    @Override
    public String toString() {
        return super.toString() +"\n"+ setSonido() +"\n"+ setAlimentacion() +"\n"+ setHabitat() +"\n"+setNombreCientifico();
    }
    
}
