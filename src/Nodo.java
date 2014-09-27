/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jhonson
 */
public class Nodo {
    String Dato;
    Nodo siguiente = null;
    
    public Nodo(String Dato){
        this.Dato = Dato;
        siguiente = null;
    }
    public String obtenerDato(){
        return Dato;
    }
    public Nodo siguiente(){
        return siguiente;
    }
    public void establecersiguiente(Nodo siguiente){
        this.siguiente = siguiente;
    }
    public void establecerDato(String Dato){
        this.Dato = Dato;
    }
}
