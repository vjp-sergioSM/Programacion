/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio08;

import static ejercicio08.Ejercicio08.scannerString;
import java.util.TreeSet;

/**
 *
 * @author alumno
 */
public class Ciudades{
    private String nombre;
    private TreeSet<Sedes> listaAlumnos;
    
    public Ciudades(){
        nombre="";
        listaAlumnos = new TreeSet<>();
    }
    public Ciudades(String no,TreeSet<Sedes> li){
        nombre=no;
        listaAlumnos = li;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TreeSet<Sedes> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(TreeSet<Sedes> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }
    public void añadirSede(){
        System.out.println("Ingrese el nombre de la sede");
        String sNombre=scannerString();
        System.out.println("Ingrese los ingresos anuales de la sede");
        float sIngresos=Ejercicio08.scannerFloat();
        listaAlumnos.add(new Sedes(sNombre, sIngresos));
    }
    public double calcularMedia() {
        double suma = 0;
        int contador = 0;

        for (Sedes listaAlumno : listaAlumnos) {
            suma += listaAlumno.getIngresosAnuales();
            contador++;
        }

        if (contador == 0) {
            return 0;
        }

        return suma / contador;
    }
    public void devolverMedia(){
        for (Sedes listaAlumno : listaAlumnos) {
            if (listaAlumno.getIngresosAnuales()>= calcularMedia()) {
                System.out.println(listaAlumno.toString());
            }
        }
    }
    public boolean buscarSede(String nombreDado){
        boolean encontrado = false;
        for (Sedes listaAlumno : listaAlumnos) {
            if (listaAlumno.getNombre().equalsIgnoreCase(nombreDado)) {
                encontrado=true;
            }
        }
        return encontrado;
    }
    @Override
    public String toString() {
        return "Ciudades{" + "nombre=" + nombre + ", listaAlumnos=" + listaAlumnos + '}';
    }

}
