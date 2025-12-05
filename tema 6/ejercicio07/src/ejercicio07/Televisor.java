/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio07;

/**
 *
 * @author alumno
 */
public class Televisor implements ControlRemoto{
    private boolean encencido;
    private int canal;
    private int volumen;
    public Televisor(){
        encencido=true;
        canal=1;
        volumen=10;
    }
    public Televisor(boolean e,int c,int v){
        encencido=e;
        canal=c;
        volumen=v;
    }
    //los atributos y convertidores por de fecto y explicitos

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
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
            System.out.println("La TV se apagará en 10s");
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
            volumen -=1;
        }   
    }
    @Override
    public void subirVolumen(){
        if (encencido == true) {
            volumen += 1;
        }

    }
    @Override
    public void cambiarCanal(float canal){
        if (encencido == true) {
            this.canal= (int)canal;
            System.out.println("El canal actual es: " + this.canal);
        }

    }
    //los constructores abstractos sobre escritos
    
    @Override
    public String toString() {
        return "Televisor{" + "encencido=" + encencido + ", canal=" + canal + ", volumen=" + volumen + '}';
    }
    //el toString
}
