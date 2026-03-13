/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15;

/**
 *
 * @author alumno
 */
public class Empleados {
    private String nombreEmpleado;
    private int sueldo;
    
    public Empleados(){
        nombreEmpleado="";
        sueldo=0;
    }
    
    public Empleados(String nomb,int suel) {
        nombreEmpleado = nomb;
        sueldo = suel;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleados{" + "nombreEmpleado=" + nombreEmpleado + ", sueldo=" + sueldo + '}';
    }

}
