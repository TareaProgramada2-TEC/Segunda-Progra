/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alfonso
 */
public class ColaCajas {
    private String [] colaCaja;
    private int maxSize;
    private int size;
    private int last;
    private int first;
    
    /**
     * 
     * @param tamaño tamaño del arreglo
     */
    public ColaCajas (int tamaño){
        this.maxSize=tamaño;
        this.colaCaja=new String [maxSize];
    }
    
    /**
     * 
     * @return la cantidad de clientes en la cola
     */
    public int getSize(){
        return this.size;
    }
    /**
     * Agrega un cliente a la cola
     * @param nombre nombre del cliente
     * @return 1 si hay campo para agregar al cliente, 0 si no hay campo
     */
    public int agregarCliente(String nombre){
        if (this.size<this.maxSize){
            if (this.size==0){
                this.colaCaja[0]=nombre;
                first=last=0;
            }
            else{
                last=(last+1)%maxSize;
                this.colaCaja[last]=nombre;
            }
            size++;
            return 1;
        }
        return 0;
    }
    /**
     * Saca un cliente de la cola
     * @return "0" si la lista esta vacia, resp si hay algun cliente en la lista
     */
    public String sacarCliente(){
        if (size==0){
            return "0";
        }
        this.size--;
        String resp=this.colaCaja[this.first];
        this.first=(this.first+1)%this.maxSize;
        return resp;
    } 
}

