/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Tony
 */

//Super clase
public class transporte {
    
    private double speed ;
    private String nombre;
    
    //metodo
    public void mostrarMensaje(){
        System.out.println("Este es un medio de transporte");
    }
    
    //metodos para atributos de cada objeto
    public void setVelocidad(double v){
        speed=v;
    }
    
    //indica el valor de cada atributo
    public double getVelocidad(){
        return speed;
    }
    
    public void setNombre(String n){
        nombre=n;
    }
    public String getNombre(){
        return nombre;
    }
}
