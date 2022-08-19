package listasduplas;
/**
 * No
 */
public class No {
    
    private long info;
    private No anterior;
    private No prox;

    public No(long info){
        this.info = info;
        this.anterior = null;
        this.prox = null;
    }
    
    public No(long info, No anterior, No prox) {
        this.info = info;
        this.anterior = anterior;
        this.prox = prox;
    }

    public long getInfo() {
        return info;
    }

    public void setInfo(long info) {
        this.info = info;
    }
    
    public No getAnterior() {
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }

}
