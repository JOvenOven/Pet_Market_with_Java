/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventamascotas;

/**
 *
 * @author Owen
 */
public class Impuestos {
    
    private int subtotal;
    private int total;
    private int iva;
    
    public int iva(int precio){
        iva=precio*4/29;
        return iva;
    }
    
    public int subtotal(int precio){
        subtotal=precio*25/29;
        return subtotal;
    }
    
    public int total(int precio){
        total=precio;
        return total;
    }
}
