/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scaperuun;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class Scaperuun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantidadDeEmpleados=0;
        ArrayList<Character> letras = new ArrayList<>();
        try (
                FileReader fr1 = new FileReader("datos_empleados.txt"); 
                BufferedReader br1 = new BufferedReader(fr1);) {
                FileWriter fw1 = new FileWriter("sospechosos_zona_cero.txt");
                PrintWriter pw1 = new PrintWriter(fw1);
            String linea = br1.readLine();
            while (linea != null) {
                if (linea.contains("Zona Cero")) {
                    cantidadDeEmpleados++;
                    pw1.println(linea);
                }
                linea = br1.readLine();
            }
            pw1.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Scaperuun.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Scaperuun.class.getName()).log(Level.SEVERE, null, ex);
        }
        try (
                FileReader fr2 = new FileReader("04dedf8afeb8a4177a009f41bb78018af601e341ed4322d4073911c9ac879726.txt"); 
                BufferedReader br2 = new BufferedReader(fr2);) {
                FileWriter fw2 = new FileWriter("claves_sospechosas.txt");
                PrintWriter pw2 = new PrintWriter(fw2);
            String linea = br2.readLine();
            while (linea != null) {
                for (int i = 65; i < 122; i++) {
                    letras.add((char)i);
                    if (i==90) {
                        i+=6;
                    }
                }
                for (Character letra : letras) {
                    linea=linea.replace(letra, ' ');
                    System.out.println(letra);
                }
                    cantidadDeEmpleados++;
                    pw2.println(linea);
                linea = br2.readLine();
            }
            pw2.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Scaperuun.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Scaperuun.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
