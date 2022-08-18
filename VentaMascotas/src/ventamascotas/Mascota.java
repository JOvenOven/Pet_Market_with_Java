/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventamascotas;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import java.io.File;
import java.io.Serializable;

/**
 *
 * @author Owen
 */
public class Mascota implements Serializable {
    
    private String Raza;
    private String PromedioVida;
    private String [] Cuidados;
    private int precio;

    public Mascota(){
    }
    
    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public String getPromedioVida() {
        return PromedioVida;
    }

    public void setPromedioVida(String PromedioVida) {
        this.PromedioVida = PromedioVida;
    }

    public String[] getCuidados() {
        return Cuidados;
    }

    public void setCuidados(String[] Cuidados) {
        this.Cuidados = Cuidados;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
