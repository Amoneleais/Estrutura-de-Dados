package pilhas;
/**
 * No
 */
public class No {

    private long info;
    private No prox;

    public No(long info) {
        this.info = info;
        this.prox = null;
    }
    
    public No(long info, No prox) {
        this.info = info;
        this.prox = prox;
    }

    public long getInfo() {
        return info;
    }
    
    public void setInfo(long info) {
        this.info = info;
    }
    public No getProx() {
        return prox;
    }
    public void setProx(No prox) {
        this.prox = prox;
    }

}