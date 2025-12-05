/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio04;

/**
 *
 * @author alumno
 */
public class Gatos extends Felinos {
    
    public Gatos(){
    super();
    }
    public Gatos(String n, int e, float p){
    super(n, e, p);
    }

    @Override
    public String setSonido(){
        return "Su sonido es: Un maullido.";
    }
    @Override
    public String setAlimentacion(){
        return "Su alimentacion es: Ratones.";
    }
    @Override
    public String setHabitat(){
        return "Su habitad es: Domestico.";
    }
    @Override
    public String setNombreCientifico(){
        return "Su nombre cientifico es: Felis silvestris catus.";
    }

    public String toString() {
        return super.toString() +"\n"+ setSonido() +"\n"+ setAlimentacion() +"\n"+ setHabitat() +"\n"+setNombreCientifico();
    }
    
}
