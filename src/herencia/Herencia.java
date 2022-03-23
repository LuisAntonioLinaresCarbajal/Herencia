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
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //valor del modelo del carro
        Carro c1=  new Carro();
        c1.setModelo("Bochito");
        c1.setVelocidad(80);    
        c1.setNombre("Herby");
        c1.mostrarMensaje();
        
        System.out.println("Modelo" + c1.getModelo()+ "que tiene de velocidad " + c1.getVelocidad() + "km por hora y se llama " + c1.getNombre());
    }
    
}
