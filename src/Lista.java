/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Creacion de la lista por medio de nodos
 * @author jhonson
 */
public class Lista {
    Nodo primer = null;
    Nodo ultimo = null;
    int Contador = 0;
    String [] Arreglo;
    int Tamaño = 0; 
    /**
     * Se agrega un elemento a la lista de nodos
     * @param Dato 
     */
    public void agregar(String Dato){
        Nodo dato= new Nodo(Dato);
        if (primer==null){
            primer = dato;
            ultimo = dato; 
        }
        else{
            ultimo.establecersiguiente(dato);
            ultimo = dato;
        }
        Tamaño ++;
    }
    /**
     * Recorre la lista de nodos 
     * @return Duvuelve un arreglo de los datos recorridos
     */
    public String [] recorrer(){
        Contador = 0;
        Arreglo = new String [Tamaño];
        Nodo nodoactual = primer;
        while(nodoactual!= null){
            Arreglo[Contador]= nodoactual.obtenerDato();
            System.out.println(nodoactual.obtenerDato());
            nodoactual = nodoactual.siguiente();
            Contador ++;
        }
        return Arreglo;
    }      
    
}
