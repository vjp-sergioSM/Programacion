/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio21;

/**
 *
 * @author alumno
 */
public class Cuenta {
    private float saldo;
    private CuentaClave cuentaClave;
    public Cuenta (){
        saldo=0;
    }
    public Cuenta (float sal){
        saldo=sal;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public void ingresar(float c){
    saldo+=c;
    }
    public void extraer(float c){
    saldo-=c;
    }

    public String mostrar() {
        return "Cuenta{" + "saldo=" + saldo + '}';
    }


    
}
