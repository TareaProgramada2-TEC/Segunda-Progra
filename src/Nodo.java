/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Creacion de nodos
 * @author Jhonson
 */
public class Nodo {
    String Dato;
    Nodo siguiente = null;
    /**
     * Crea un nodo
     * @param Dato Informacion del nodo
     */
    public Nodo(String Dato){
        this.Dato = Dato;
        siguiente = null;
    }
    /**
     * Retorna un dato
     * @return La informacion del nodo
     */
    public String obtenerDato(){
        return Dato;
    }
    /**
     * Metodo para pasar al nodo siguiente
     * @return Devuelve el nodo
     */
    public Nodo siguiente(){
        return siguiente;
    }
    /**
     * Se enlazan los nodos
     * @param siguiente Nodo a enlazar
     */
    public void establecersiguiente(Nodo siguiente){
        this.siguiente = siguiente;
    }
    /**
     * Se establece un dato al nodo
     * @param Dato Informacion
     */
    public void establecerDato(String Dato){
        this.Dato = Dato;
    }
}
