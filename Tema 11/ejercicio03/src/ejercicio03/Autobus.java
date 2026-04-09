package ejercicio03;

import java.util.HashMap;

public class Autobus {

    // Matrícula del autobús (no se puede modificar)
    private final String matricula;
    
    // Mapa de conductores (clave = DNI, valor = objeto Conductor)
    private final HashMap<String, Conductor> conductores;

    // Constructor: inicializa matrícula y lista de conductores vacía
    public Autobus(String matricula) {
        this.matricula = matricula;
        this.conductores = new HashMap<>();
    }

    // Devuelve la matrícula del autobús
    public String getMatricula() {
        return matricula;
    }

    // Devuelve el mapa de conductores
    public HashMap<String, Conductor> getConductores() {
        return conductores;
    }

    // Añade un conductor al mapa usando su DNI como clave
    public void addConductor(Conductor c) {
        conductores.put(c.getDni(), c);
    }

    // Representación en texto del autobús y sus conductores
    @Override
    public String toString() {
        String info = "Matricula: " + matricula + "\nConductores:\n";
        
        // Recorre todos los conductores y los añade al texto
        for (Conductor c : conductores.values()) {
            info += "   - " + c + "\n";
        }
        
        return info;
    }
}