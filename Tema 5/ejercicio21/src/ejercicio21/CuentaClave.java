/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio21;

/**
 *
 * @author alumno
 */
public class CuentaClave extends Cuenta{
    private String clave;
    
    public CuentaClave(){
        super();
        clave="";
    }
    public CuentaClave(float sal,String cla){
        super(sal);
        clave=cla;
    }


    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    
    @Override
    public void extraer(float c){
        float saldo = getSaldo();
        if (saldo>c) {
            this.setSaldo(saldo-c);
        } 
    }

    @Override
    public String toString() {
        return "CuentaClave{clave=" + clave + ", saldo=" + getSaldo() + "}";
}

    
}
