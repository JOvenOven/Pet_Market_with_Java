/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventamascotas;

import java.io.Serializable;

/**
 *
 * @author Owen
 */
public class Perro extends Mascota implements Serializable{
    
    private String Tamaño;

    public Perro(){}
    
    public String getTamaño() {
        return Tamaño;
    }

    public void setTamaño(String Tamaño) {
        this.Tamaño = Tamaño;
    }
}
