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
public class Carro extends transporte {
    private String modelo;
    
    public void setModelo(String mod){
        modelo=mod;
    }
    public String getModelo(){
        return modelo;
    }
}
