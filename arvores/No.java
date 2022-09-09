package arvores;
/**
 * No
 */
public class No {

    private long info;
    private No esquerdo;
    private No direito;
    
    public No(long info){
        this.info = info;
        this.esquerdo = null;
        this.direito = null;
    }

    public No(long info, No esquerdo, No direito) {
        this.info = info;
        this.esquerdo = esquerdo;
        this.direito = direito;
    }

    public long getInfo() {
        return info;
    }

    public void setInfo(long info) {
        this.info = info;
    }

    public No getEsquerdo() {
        return esquerdo;
    }

    public void setEsquerdo(No esquerdo) {
        this.esquerdo = esquerdo;
    }

    public No getDireito() {
        return direito;
    }

    public void setDireito(No direito) {
        this.direito = direito;
    }
    
}
