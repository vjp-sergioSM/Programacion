/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15;

/**
 *
 * @author alumno
 */
public class Empleado {
    private String nombre;
    private int salario;
    private Direccion direccion;
    //generamos las variables privadas 
    public Empleado(){
        nombre="";
        salario=0;
        direccion= new Direccion();
    }
    public Empleado(String no, int s, String ca, int nu, String p, String ci){
        nombre=no;
        salario=s;
        direccion= new Direccion(ca, nu, p, ci);
    }
    /**
     * tenemos 2 metodos, 1 por defecto y otro en caso de que se den todos los
     * datos directamente
     */

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String no){
    nombre=no;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    //generamos los get y set añadiendo "this." a la variable setDireccion
    @Override
    public String toString() {
        return "nombre:" + nombre +"\n"
                + "salario:" + salario + "\n"
                + direccion.toString()
                + "";
    }
    //cramos el toString para mostrar los datos cuando sean llamados
}
