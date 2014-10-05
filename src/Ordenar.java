

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Odena una lista de datos
 * @author jhonson
 */
public class Ordenar {
    /**
     * Ordena al lista
     * @param lista Resive la lista a ordenar
     * @return Devuelve la lista ordenada
     */
    public  static String [] Ordenamiento(String lista[]){
	for(int i=0;i<(lista.length-1);i++){
            for(int j=i+1;j<lista.length;j++){
		if(lista[i].compareToIgnoreCase(lista[j])>0){
                    //Intercambiamos valores
                    String variableauxiliar=lista[i];
                    lista[i]=lista[j];
                    lista[j]=variableauxiliar;
		}
            }
	}
        return lista;
    } 
}
