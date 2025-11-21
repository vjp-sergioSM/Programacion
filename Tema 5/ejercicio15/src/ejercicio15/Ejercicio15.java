/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

/**
 *
 * @author alumno
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Direccion direccion1 = new Direccion();
        Direccion direccion2 = new Direccion();
        Direccion direccion3 = new Direccion();
        Empleado empleado1 = new Empleado();
        Empleado empleado2 = new Empleado();
        Empleado empleado3 = new Empleado();
        /**generamos todas las direcicones y los empleados a los que se 
         * las vamos a aplicar
        */
        direccion1.setCalle("calle1");
        direccion1.setNumero(10);
        direccion1.setPiso("piso1");
        direccion1.setCiudad("ciudad1");
        direccion2.setCalle("calle2");
        direccion2.setNumero(12);
        direccion2.setPiso("piso2");
        direccion2.setCiudad("ciudad2");
        direccion3.setCalle("calle3");
        direccion3.setNumero(13);
        direccion3.setPiso("piso3");
        direccion3.setCiudad("ciudad3");
        // añadimos a cada una de las direcciones sus datos necesarios
        empleado1.setNombre("Juan");
        empleado1.setSalario(2500);
        empleado1.setDireccion(direccion1);
        
        System.out.println("EMPLEADO 1:" + "\n" + empleado1.toString());
        empleado2.setNombre("Trebor");
        empleado2.setSalario(2250);
        empleado2.setDireccion(direccion2);
        
        System.out.println("EMPLEADO 2:" + "\n" + empleado2.toString());
        empleado3.setNombre("Pepe");
        empleado3.setSalario(2000);
        empleado3.setDireccion(direccion3);
        
        System.out.println("EMPLEADO 3:" + "\n" + empleado3.toString());
        //añadimos los datos de los empleados y los imprimimos
    }
    
}
