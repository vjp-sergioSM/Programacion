/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author alumno
 */
public class Ejercicio14 {

    public static final String FICHERO = "DatosBeca.txt";

    public static void main(String[] args) {

        try (
            FileReader fr = new FileReader(FICHERO);
            BufferedReader br = new BufferedReader(fr);
        ) {

            String linea;

            // Leer cada línea del fichero
            while ((linea = br.readLine()) != null) {

                Becario b = parsearBecario(linea);

                double beca = calcularBeca(b);

                // Mostrar solo si tiene beca
                if (beca > 0) {
                    System.out.println(b.getNombreApellidos() + " → Beca: " + beca + "€");
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: fichero no encontrado");
        } catch (IOException e) {
            System.out.println("Error de lectura");
        } catch (Exception e) {
            System.out.println("Error inesperado");
        }
    }

    // 🔹 Convierte una línea del fichero en objeto Becario
    public static Becario parsearBecario(String linea) {

        Becario b = new Becario();

        try {
            linea = linea.replace("Becario{", "").replace("}", "");
            String[] partes = linea.split(", ");

            for (String p : partes) {
                String[] campo = p.split("=");

                switch (campo[0]) {
                    case "nombreApellidos" -> b.setNombreApellidos(campo[1]);
                    case "sexo" -> b.setSexo(campo[1]);
                    case "edad" -> b.setEdad(Integer.parseInt(campo[1]));
                    case "cantidadSuspensos" -> b.setCantidadSuspensos(Integer.parseInt(campo[1]));
                    case "residenciaFamiliar" -> b.setResidenciaFamiliar(Boolean.parseBoolean(campo[1]));
                    case "ingresosAnuales" -> b.setIngresosAnuales(Float.parseFloat(campo[1]));
                }
            }

        } catch (Exception e) {
            System.out.println("Error al parsear línea");
        }

        return b;
    }

    // 🔹 Calcula la beca según las reglas del enunciado
    public static double calcularBeca(Becario b) {
        boolean sinBeca=false;
        double beca = 1500; // base

        // Ingresos
        if (b.getIngresosAnuales() <= 12000) {
            beca += 500;
        }

        // Edad
        if (b.getEdad() < 23) {
            beca += 200;
        }

        // Suspensos
        switch (b.getCantidadSuspensos()) {
            case 0:
                beca += 500;
                break;
            case 1:
                beca += 200;
                break;
            default:
                sinBeca=true; // 2 o más → sin beca
        }

        // Residencia
        if (!b.isResidenciaFamiliar()) {
            beca += 1000;
        }
        if (sinBeca) {
            beca=0;
        }
        return beca;
    }
}