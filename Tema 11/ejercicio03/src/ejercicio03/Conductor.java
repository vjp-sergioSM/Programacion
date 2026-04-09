package ejercicio03;

public class Conductor {

    // DNI del conductor (no modificable)
    private final String dni;
    
    // Nombre del conductor (no modificable)
    private final String nombre;

    // Constructor: inicializa los datos del conductor
    public Conductor(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    // Devuelve el DNI del conductor
    public String getDni() {
        return dni;
    }

    // Devuelve el nombre del conductor
    public String getNombre() {
        return nombre;
    }

    // Representación en texto del conductor
    @Override
    public String toString() {
        return "DNI: " + dni + ", Nombre: " + nombre;
    }
}