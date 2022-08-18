/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventamascotas;
import java.io.File;
import java.util.ArrayList;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.lang.NullPointerException;
/**
 *
 * @author Owen
 */
public class SerializarObjetos {
    private ArrayList<Usuario> user;
    private ArrayList<Perro> perro;
    private ArrayList<Gato> gato;
    private ArrayList<Venta> venta;
    
    public void serializarArrayUser(File fichero, ArrayList Usuario){
        try{
            ObjectOutputStream seriarObj= new ObjectOutputStream(new FileOutputStream(fichero));
            seriarObj.writeObject(Usuario);
            seriarObj.close();
        }catch(Exception e){
            System.out.println("Error al Serializar");
        }
    }
    
    public ArrayList<Usuario> deserializarArrayUser(File fichero){
        try{
                ObjectInputStream deseriarObj= new ObjectInputStream(new FileInputStream(fichero));
                user=(ArrayList<Usuario>)deseriarObj.readObject();
        }catch(Exception e){
            System.out.println("Error al Deserializar");
        }
        return user;
    }
    
    public void serializarArrayPerro(File fichero, ArrayList Perro){
        try{
            ObjectOutputStream seriarObj= new ObjectOutputStream(new FileOutputStream(fichero));
            seriarObj.writeObject(Perro);
            seriarObj.close();
        }catch(Exception e){
            System.out.println("Error al Serializar");
        }
    }
    
    public ArrayList<Perro> deserializarArrayPerro(File fichero){
        try{
                ObjectInputStream deseriarObj= new ObjectInputStream(new FileInputStream(fichero));
                perro=(ArrayList<Perro>)deseriarObj.readObject();
        }catch(Exception e){
            System.out.println("Error al Deserializar" + e);
        }
        return perro;
    }
    
    public void serializarArrayGato(File fichero, ArrayList Gato){
        try{
            ObjectOutputStream seriarObj= new ObjectOutputStream(new FileOutputStream(fichero));
            seriarObj.writeObject(Gato);
            seriarObj.close();
        }catch(Exception e){
            System.out.println("Error al Serializar");
        }
    }
    
    public ArrayList<Gato> deserializarArrayGato(File fichero){
        try{
                ObjectInputStream deseriarObj= new ObjectInputStream(new FileInputStream(fichero));
                gato=(ArrayList<Gato>)deseriarObj.readObject();
        }catch(Exception e){
            System.out.println("Error al Deserializar"+e);
        }
        return gato;
    }
    
    public void serializarArrayVenta(File fichero, ArrayList Venta){
        try{
            ObjectOutputStream seriarObj= new ObjectOutputStream(new FileOutputStream(fichero));
            seriarObj.writeObject(Venta);
            seriarObj.close();
        }catch(Exception e){
            System.out.println("Error al Serializar");
        }
    }
    
    public ArrayList<Venta> deserializarArrayVenta(File fichero){
        try{
                ObjectInputStream deseriarObj= new ObjectInputStream(new FileInputStream(fichero));
                venta=(ArrayList<Venta>)deseriarObj.readObject();
        }catch(Exception e){
            System.out.println("Error al Deserializar");
        }
        return venta;
    }
}
