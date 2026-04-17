/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio06;

/**
 *
 * @author alumno
 */
public class Donacion {
    private String nombre;
    private int cantidad;
    
    public Donacion(){
        nombre="";
        cantidad=0;
    }
    public Donacion(int ca, String no){
        nombre=no;
        cantidad=ca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Donacion{" + "nombre=" + nombre + ", cantidad=" + cantidad + '}';
    }
    
    
}
