/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio06;

import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class Campania {
    private String nombre;
    private ArrayList<Donacion> donaciones;
    public Campania(){
        nombre="";
        donaciones=new ArrayList<>();
    }
    public Campania(String no,ArrayList<Donacion> don){
        nombre=no;
        donaciones=don;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Donacion> getDonaciones() {
        return donaciones;
    }

    public void setDonaciones(ArrayList<Donacion> donaciones) {
        this.donaciones = donaciones;
    }

    @Override
    public String toString() {
        return "Campania{" + "nombre=" + nombre + ", donaciones=" + donaciones + '}';
    }
    
}
