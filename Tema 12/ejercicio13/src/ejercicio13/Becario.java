package ejercicio13;

// Clase que representa un becario con sus datos personales y académicos
public class Becario {

    // Atributos de la clase
    private String nombreApellidos;
    private String sexo;
    private int edad;
    private int cantidadSuspensos;
    private boolean residenciaFamiliar;
    private float ingresosAnuales;

    // Constructor por defecto (inicializa valores vacíos o por defecto)
    public Becario() {
        nombreApellidos = "";
        sexo = "";
        edad = 0;
        cantidadSuspensos = 0;
        residenciaFamiliar = true;
        ingresosAnuales = 0f;
    }

    // Constructor con parámetros (permite crear el objeto con valores)
    public Becario(String nom, String sex, int eda, int can, boolean res, float ing) {
        nombreApellidos = nom;
        sexo = sex;
        edad = eda;
        cantidadSuspensos = can;
        residenciaFamiliar = res;
        ingresosAnuales = ing;
    }

    // Getters y setters (acceso y modificación de atributos)

    public String getNombreApellidos() {
        return nombreApellidos;
    }

    public void setNombreApellidos(String nombreApellidos) {
        this.nombreApellidos = nombreApellidos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCantidadSuspensos() {
        return cantidadSuspensos;
    }

    public void setCantidadSuspensos(int cantidadSuspensos) {
        this.cantidadSuspensos = cantidadSuspensos;
    }

    public boolean isResidenciaFamiliar() {
        return residenciaFamiliar;
    }

    public void setResidenciaFamiliar(boolean residenciaFamiliar) {
        this.residenciaFamiliar = residenciaFamiliar;
    }

    public float getIngresosAnuales() {
        return ingresosAnuales;
    }

    public void setIngresosAnuales(float ingresosAnuales) {
        this.ingresosAnuales = ingresosAnuales;
    }

    // Método que devuelve una representación en texto del objeto
    @Override
    public String toString() {
        return "Becario{" +
                "nombreApellidos=" + nombreApellidos +
                ", sexo=" + sexo +
                ", edad=" + edad +
                ", cantidadSuspensos=" + cantidadSuspensos +
                ", residenciaFamiliar=" + residenciaFamiliar +
                ", ingresosAnuales=" + ingresosAnuales +
                '}';
    }
}