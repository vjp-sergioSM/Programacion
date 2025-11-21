/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entradaLetras = new Scanner(System.in);
        Scanner entradaNumeros = new Scanner(System.in);
        //tuve que generar 2 secaners, uno para String y otro para int
        String nombreEmpleado;
        int horasEmpleado, tarifaEmpleado;
        Empleados empleados1 = new Empleados();
        Empleados empleados2 = new Empleados();
        Empleados empleados3 = new Empleados();
        
        System.out.println("Introduzca los datos del primer usuario:");
        System.out.println("Introduce su nombre: ");
        nombreEmpleado=entradaLetras.nextLine();
        empleados1.setNombre(nombreEmpleado);
        System.out.println("Introduce sus horas de trabajo: ");
        horasEmpleado=entradaNumeros.nextInt();
        empleados1.setHorasTrabajadas(horasEmpleado);
        System.out.println("Introduce su sueldo: ");
        tarifaEmpleado = entradaNumeros.nextInt();
        empleados1.setTarifaPorHora(tarifaEmpleado);
        empleados1.dineroPorHora(horasEmpleado, tarifaEmpleado);
        System.out.println(empleados1.toString());
        //solicitamos al usuario los datos necesarios y los entregamos a los metodos necesarios
        
        
        System.out.println("Introduzca los datos del Segundo usuario:");
        System.out.println("Introduce su nombre: ");
        nombreEmpleado=entradaLetras.nextLine();
        empleados2.setNombre(nombreEmpleado);
        System.out.println("Introduce sus horas de trabajo: ");
        horasEmpleado=entradaNumeros.nextInt();
        empleados2.setHorasTrabajadas(horasEmpleado);
        System.out.println("Introduce su sueldo: ");
        tarifaEmpleado = entradaNumeros.nextInt();
        empleados2.setTarifaPorHora(tarifaEmpleado);
        empleados2.dineroPorHora(horasEmpleado, tarifaEmpleado);
        System.out.println(empleados2.toString());
        //solicitamos al usuario los datos necesarios y los entregamos a los metodos necesarios
        
        
        System.out.println("Introduzca los datos del tercer usuario:");
        System.out.println("Introduce su nombre: ");
        nombreEmpleado=entradaLetras.nextLine();
        empleados3.setNombre(nombreEmpleado);
        System.out.println("Introduce sus horas de trabajo: ");
        horasEmpleado=entradaNumeros.nextInt();
        empleados3.setHorasTrabajadas(horasEmpleado);
        System.out.println("Introduce su sueldo: ");
        tarifaEmpleado = entradaNumeros.nextInt();
        empleados3.setTarifaPorHora(tarifaEmpleado);
        empleados3.dineroPorHora(horasEmpleado, tarifaEmpleado);
        System.out.println(empleados3.toString());
        //solicitamos al usuario los datos necesarios y los entregamos a los metodos necesarios
    }
    
}
