package listasduplas;

public class No {
    
    private int info;
    private No anterior;
    private No prox;

    public No(int info){
        this.info = info;
        this.anterior = null;
        this.prox = null;
    }
    
    public No(int info, No anterior, No prox) {
        this.info = info;
        this.anterior = anterior;
        this.prox = prox;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
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
