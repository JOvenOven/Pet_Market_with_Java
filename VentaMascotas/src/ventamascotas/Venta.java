/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventamascotas;

import java.io.Serializable;
import java.util.GregorianCalendar;
        
/**
 *
 * @author Owen
 */
public class Venta implements Serializable{
    
    private String Venta;
    private String comprador;
    private int Precio;
    private int IVA;
    private int Subtotal;
    private int Total;
    private int [] fecha;
    private int folio;

    public Venta() {
        this.fecha = new int[3];
    }

    public String getVenta() {
        return Venta;
    }

    public void setVenta(String Venta) {
        this.Venta = Venta;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public float getIVA() {
        return IVA;
    }

    public void setIVA(int IVA) {
        this.IVA = IVA;
    }

    public float getSubtotal() {
        return Subtotal;
    }

    public void setSubtotal(int Subtotal) {
        this.Subtotal = Subtotal;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int Total) {
        this.Total = Total;
    }

    public int[] getFecha() {
        return fecha;
    }

    public void setFecha(int dia, int mes, int año) {
        this.fecha [0] = dia;
        this.fecha [1] = mes;
        this.fecha [2] = año;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public String getComprador() {
        return comprador;
    }

    public void setComprador(String comprador) {
        this.comprador = comprador;
    }
    
    
}
