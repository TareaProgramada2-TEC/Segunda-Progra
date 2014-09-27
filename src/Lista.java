/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jhonson
 */
public class Lista {
    Nodo primer = null;
    Nodo ultimo = null;
    int Contador = 0;
    String [] Arreglo;
    int Tamaño = 0; 
    
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
