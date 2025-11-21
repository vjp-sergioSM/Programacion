/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio19;

/**
 *
 * @author alumno
 */
public class Empleados {
    private String nombre;
    private int horasTrabajadas;
    private int tarifaPorHora;
    private int sueldo;
    //las variables privadas que necesitamos para el ejercicio
    public Empleados (){
        nombre="";
        horasTrabajadas=0;
        tarifaPorHora=0;
    }
    
    public Empleados (String nom,int horasTra,int tarifaPorHo){
        nombre=nom;
        horasTrabajadas=horasTra;
        tarifaPorHora=tarifaPorHo;
    }
    //los metodos base
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nom) {
        nombre = nom;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTra) {
        horasTrabajadas = horasTra;
    }

    public int getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(int tarifaPorHo) {
        tarifaPorHora = tarifaPorHo;
    }
    //los seter y geter
    public void dineroPorHora(int horasTra,int tarifaPorHo){
        boolean mayor40=false;
        int num1, num2;
        if (horasTra>40) {
            horasTra-=40;
            mayor40=true;
        }
        if (mayor40) {
            num1=40*tarifaPorHo;
            num2=(int) (horasTra*(tarifaPorHo*1.5));
            num1+=num2;
        }else{
        num1=tarifaPorHo*horasTra;
        }
        
        sueldo=num1;
    }
    //el metodo para que a partir de las 40 horas trabajadas se cobre tarifa y media
    @Override
    public String toString() {
        return nombre + "Trabajo " + horasTrabajadas + " horas, cobra" + tarifaPorHora + " la hora por lo que le corresponde " + sueldo;
    }
    
    
}
