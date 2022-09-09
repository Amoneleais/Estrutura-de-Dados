package arvores; 
/**
 * Arvore
 */
public class Arvore {

    public No raiz;

    public Arvore(){

    }

    public boolean arvoreVazia(){
        return this.raiz == null;
    }

    public void inserir(long elemento){
        No novo = new No(elemento);
        if(arvoreVazia()){
            this.raiz = novo; 
            return;
        }
        No atual = raiz;
        No anterior;
        while (true) {
            anterior = atual;
            if(elemento <= atual.getInfo()){
                atual = atual.getEsquerdo();
                if(atual == null){
                    anterior.setEsquerdo(novo);
                    return;
                }
            }
            else{
                atual = atual.getDireito();
                if(atual == null){
                    anterior.setDireito(novo);
                    return;
                }
            }
        }
    }

    public void buscar(long elemento){

    }
}
