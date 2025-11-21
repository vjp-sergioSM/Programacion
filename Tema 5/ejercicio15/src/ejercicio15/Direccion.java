/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15;

/**
 *
 * @author alumno
 */
public class Direccion {
    private String calle;
    private int numero;
    private String piso;
    private String ciudad;
    //generamos las variables privadas
    public  Direccion(){
    calle="";
    numero=0;
    piso="";
    ciudad="";
    } 
    public Direccion(String ca,int nu,String p,String ci){
        calle = ca;
        numero = nu;
        piso = p;
        ciudad = ci;
    }
    /**tenemos 2 metodos, 1 por defecto y otro en caso de que se 
    * den todos los datos directamente
    */
    public String getCalle(){
        return calle;
    }
    public void setCalle(String ca){
        calle=ca;
    }
    public int getNumero(){
        return numero;
    }
    public void setNumero(int nu){
        numero=nu;
    }
    public String getPiso(){
        return piso;
    }
    public void setPiso(String p){
        piso=p;
    }
    public String getCiudad(){
        return ciudad;
    }
    public void setCiudad(String ci){
        ciudad=ci;
    }
    //añadimos los get an set
    @Override
    public String toString() {
        return "Direccion:" +"\n"+ "    calle:" + calle + "\n" 
                + "    numero:" + numero + "\n" 
                + "    piso:" + piso + "\n" 
                + "    ciudad:" + ciudad + "\n" 
                + "";
    }
    //cramos el toString para mostrar los datos
}
