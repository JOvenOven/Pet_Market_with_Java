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
public class Usuario implements Serializable {
    private String cuenta;
    private String contraseña;
    private boolean tipoUser;
    private int saldo;

    public Usuario(){}
    
    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getTipoUser() {
        if(this.tipoUser==true)
            return "administrador";
        else
            return "usuario";
    }

    public void setTipoUser(String TipoUser) {
        if(TipoUser== "Administrador" || TipoUser=="administrador")
            this.tipoUser = true;
        else{
            if(TipoUser == "Usuario" || TipoUser== "usuario")
                this.tipoUser = false;
        }
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    
}
