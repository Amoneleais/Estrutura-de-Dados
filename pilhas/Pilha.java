package pilhas;
/**
 * Pilha
 */
public class Pilha {
    
    private No topo;
    private int tamanho_atual;
    private int tamanho_max;

    public Pilha(){
        
    }
    
    // * Construtor para definir tamanho da pilha |
    public Pilha(int tamanho_max){
        this.tamanho_max = tamanho_max;
    }
    
    // * Verifica se a pilha está vazia |
    public boolean pilhaVazia(){    
        return this.topo == null;
    }
    
    // * Insere elemento no topo da pilha |
    public void push(long elemento){
        //caso haja tamanho definido e a pilha esteja cheia (quantidade de elementos = tamanho máximo).
        if(this.tamanho_atual == this.tamanho_max && tamanho_max != 0){
            try {
                throw new Exception("[ PILHA CHEIA! ]");
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        this.tamanho_atual++;
        No novo = new No(elemento, this.topo);
        this.topo = novo;
    }

    // * Remove elemento no topo da pilha | - Método LIFO (Last-in-First-out)
    public void pop(){
        //em caso de pilha vazia, retorna mensagem para o usuário.
        if(pilhaVazia()){
            try {
                throw new Exception("[ PILHA VAZIA! ]");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return;
        }
        //remove o elemento no topo da pilha, último inserido.
        this.topo = this.topo.getProx();
        this.tamanho_atual--;
    }

    // * Esvazia a pilha |
    public void esvaziar(){
        //transforma a referência em nulo, apagando os nós sucessores.
        this.topo = null;
        this.tamanho_atual = 0;
        System.out.println("\n - A Pilha foi Esvaziada");
    }

    // * Imprime os elementos na pilha |
    public void imprimir(){
        String pilha = "";
        //retorna mensagem para o usuário, em caso de pilha vazia.
        if(pilhaVazia()){
            try {
                throw new Exception("[ PILHA VAZIA! ]");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return;
        }
        //percorre os nós, por meio de uma variável auxiliar do tipo No até encontrar o nulo.
        for(No auxiliar = this.topo; auxiliar != null; auxiliar = auxiliar.getProx()){
            if(auxiliar == this.topo){
                pilha += "| ["+auxiliar.getInfo()+"] <- TOPO\n";
            }
            else{
                pilha += "| ["+auxiliar.getInfo()+"]\n";
            }
        }
        //impressão da variável pilha.
        System.out.println("\n"+pilha);
        System.out.println(" - Tamanho da Pilha: "+this.tamanho_atual+"\n");
    }
    
}
