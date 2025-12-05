/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio07;

/**
 *
 * @author alumno
 */
public class Radio implements ControlRemoto{
    
    private boolean encencido;
    private float emisora;
    private int volumen;
    public Radio(){
        encencido=true;
        emisora=80.0F;
        volumen=15;
    }
    public Radio(boolean e,int c,int v){
        encencido=e;
        emisora=c;
        volumen=v;
    }
    //los atributos y convertidores por de fecto y explicitos

    public float getCanal() {
        return emisora;
    }

    public void setCanal(float emisora) {
        this.emisora = emisora;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    @Override
    public void apagar(){
        if (encencido==true) {
            encencido=false;
        }
    }
    @Override
    public void encender(){
        if (encencido == false) {
            encencido = true;
        }
    }
    @Override
    public void bajarVolumen(){
        if (encencido == true) {
            volumen -=5;
        }   
    }
    @Override
    public void subirVolumen(){
        if (encencido == true) {
            volumen +=5;
        }

    }
    @Override
    public void cambiarCanal(float emisora){
        if (encencido == true) {
            this.emisora=emisora;
            System.out.println("El canal actual es: " + this.emisora);
        }

    }
    //los constructores abstractos sobre escritos
    
    @Override
    public String toString() {
        return "Radio{" + "encencido=" + encencido + ", emisora=" + emisora + ", volumen=" + volumen + '}';
    }
    //el toString
}
