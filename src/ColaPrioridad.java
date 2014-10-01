/**
 *
 * @author Alfonso
 */
public class ColaPrioridad {
    private final int tamañoMaximo;
    private String [] discapacidad;
    private int sizeDis;
    private int firstDis;
    private int lastDis;
    private String [] mayor;
    private int sizeMayor;
    private int firstMayor;
    private int lastMayor;
    private String [] embarazada;
    private int sizeEmba;
    private int firstEmba;
    private int lastEmba;
    private String [] corporativo;
    private int sizeCor;
    private int firstCor;
    private int lastCor;
    private String [] regular;
    private int sizeReg;
    private int firstReg;
    private int lastReg;
    
    /**
     * 
     * @param tamaño tamaño de los arreglos 
     */
    
    public ColaPrioridad (int tamaño){
        this.tamañoMaximo=tamaño;
        this.discapacidad=new String [this.tamañoMaximo];
        sizeDis=0;
        this.mayor=new String [this.tamañoMaximo];
        sizeMayor=0;
        this.embarazada=new String [this.tamañoMaximo];
        sizeEmba=0;
        this.corporativo=new String [this.tamañoMaximo];
        sizeCor=0;
        this.regular=new String [this.tamañoMaximo];
        sizeReg=0;
    }
    
    /**
     * 
     * @param nombre nombre de la persona
     * @return 1 si se agrego bien, 0 si la lista esta llena
     */
    
    public int agregarDiscapacidad(String nombre){
        if (this.sizeDis<this.tamañoMaximo){
            if (this.sizeDis==0){
                this.discapacidad[0]=nombre;
                firstDis=lastDis=0;
            }
            else{
                lastDis=(lastDis+1)%tamañoMaximo;
                this.discapacidad[lastDis]=nombre;
            }
            sizeDis++;
            return 1;
        }
        return 0;
    }
    
    /**
     * 
     * @return "0" si esta vacia, resp si hay alguien en la cola
     */
    
    public String sacarDiscapacidad(){
        if (sizeDis==0){
            return "0";
        }
        this.sizeDis--;
        String resp=this.discapacidad[this.firstDis];
        this.firstDis=(this.firstDis+1)%this.tamañoMaximo;
        return resp;
    }
    
    /**
     * 
     * @param nombre nombre de la persona
     * @return 1 si se agrego bien, 0 si la lista esta llena
     */
    
    public int agregarMayor(String nombre){
        if (this.sizeMayor<this.tamañoMaximo){
            if (this.sizeMayor==0){
                this.mayor[0]=nombre;
                firstMayor=lastMayor=0;
            }
            else{
                lastMayor=(lastMayor+1)%tamañoMaximo;
                this.mayor[lastMayor]=nombre;
            }
            sizeMayor++;
            return 1;
        }
        return 0;
    }
    
    /**
     * 
     * @return "0" si esta vacia, resp si hay alguien en la cola
     */
    
    public String sacarMayor(){
        if (sizeMayor==0){
            return "0";
        }
        this.sizeMayor--;
        String resp=this.mayor[this.firstMayor];
        this.firstMayor=(this.firstMayor+1)%this.tamañoMaximo;
        return resp;
    }
    
    /**
     * 
     * @param nombre nombre de la persona
     * @return 1 si se agrego bien, 0 si la lista esta llena
     */
    
    public int agregarEmbarazada(String nombre){
        if (this.sizeEmba<this.tamañoMaximo){
            if (this.sizeEmba==0){
                this.embarazada[0]=nombre;
                firstEmba=lastEmba=0;
            }
            else{
                lastEmba=(lastEmba+1)%tamañoMaximo;
                this.embarazada[lastEmba]=nombre;
            }
            sizeEmba++;
            return 1;
        }
        return 0;
    }
    
    /**
     * 
     * @return "0" si esta vacia, resp si hay alguien en la cola
     */
    
    public String sacarEmbarazada(){
        if (sizeEmba==0){
            return "0";
        }
        this.sizeEmba--;
        String resp=this.embarazada[this.firstEmba];
        this.firstEmba=(this.firstEmba+1)%this.tamañoMaximo;
        return resp;
    }
    
    /**
     * 
     * @param nombre nombre de la persona
     * @return 1 si se agrego bien, 0 si la lista esta llena
     */
    
    public int agregarCorporativo(String nombre){
        if (this.sizeCor<this.tamañoMaximo){
            if (this.sizeCor==0){
                this.corporativo[0]=nombre;
                firstCor=lastCor=0;
            }
            else{
                lastCor=(lastCor+1)%tamañoMaximo;
                this.corporativo[lastCor]=nombre;
            }
            sizeCor++;
            return 1;
        }
        return 0;
    }
    
    /**
     * 
     * @return "0" si esta vacia, resp si hay alguien en la cola
     */
    
    public String sacarCorporativo(){
        if (sizeCor==0){
            return "0";
        }
        this.sizeCor--;
        String resp=this.corporativo[this.firstCor];
        this.firstCor=(this.firstCor+1)%this.tamañoMaximo;
        return resp;
    }
    
    /**
     * 
     * @param nombre nombre de la persona
     * @return 1 si se agrego bien, 0 si la lista esta llena
     */
    
    public int agregarRegular(String nombre){
        if (this.sizeReg<this.tamañoMaximo){
            if (this.sizeReg==0){
                this.regular[0]=nombre;
                firstReg=lastReg=0;
            }
            else{
                lastReg=(lastReg+1)%tamañoMaximo;
                this.regular[lastReg]=nombre;
            }
            sizeReg++;
            return 1;
        }
        return 0;
    }
    
    /**
     * 
     * @return "0" si esta vacia, resp si hay alguien en la cola
     */
    
    public String sacarRegular(){
        if (sizeReg==0){
            return "0";
        }
        this.sizeReg--;
        String resp=this.regular[this.firstReg];
        this.firstReg=(this.firstReg+1)%this.tamañoMaximo;
        return resp;
    }  
}

