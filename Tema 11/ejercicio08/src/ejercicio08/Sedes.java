/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio08;

/**
 *
 * @author alumno
 */
public class Sedes implements Comparable<Sedes>{
    private String nombre;
    private float ingresosAnuales;
    
    public Sedes(){
        nombre="";
        ingresosAnuales=0;
    }
    public Sedes(String no,float in){
        nombre=no;
        ingresosAnuales=in;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getIngresosAnuales() {
        return ingresosAnuales;
    }

    public void setIngresosAnuales(float ingresosAnuales) {
        this.ingresosAnuales = ingresosAnuales;
    }

    @Override
    public String toString() {
        return "Sedes{" + "nombre=" + nombre + ", ingresosAnuales=" + ingresosAnuales + '}';
    }
    //compareTo
@Override
    public int compareTo(Sedes a) {
        return Float.compare(a.getIngresosAnuales(), this.ingresosAnuales);
    }
}
