/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15;

import static ejercicio15.Ejercicio15.scanerInt;
import static ejercicio15.Ejercicio15.scanerString;
import java.util.ArrayList;


/**
 *
 * @author alumno
 */
public class Empresa {
    private String nombreEmpresa;
    private ArrayList<Empleados> empleados;
    public Empresa(){
        nombreEmpresa="";
        empleados=new ArrayList<>();
    }
    public Empresa(String nomb,ArrayList<Empleados> empl){
        nombreEmpresa=nomb;
        empleados=empl;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public ArrayList<Empleados> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleados> empleados) {
        this.empleados = empleados;
    }
    public void rellenarEmpleados(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            empleados.add(new Empleados());
            System.out.println("Introduzca el nombre del empleado "+(1+i)+" de la empresa "+nombreEmpresa);
            empleados.get(i).setNombreEmpleado(scanerString());
            System.out.println("Introduzca el nombre del empleado "+(1+i)+" de la empresa "+nombreEmpresa);
            empleados.get(i).setSueldo(scanerInt());
        }
    }
    public void mostrarEmpleadosA(){
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getNombreEmpleado().startsWith("A")) {
                System.out.println(empleados.get(i).toString());
            }
        }
    }
    @Override
    public String toString() {
        return "Empresa{" + "nombreEmpresa=" + nombreEmpresa + ", empleados=" + empleados + '}';
    }
    
}
