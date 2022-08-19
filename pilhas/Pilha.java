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

    //Construtor para definir tamanho da pilha |
    public Pilha(int tamanho_max){
        this.tamanho_max = tamanho_max;
    }

    //Verifica se a pilha está vazia |
    public boolean PilhaVazia(){    
        return this.topo == null;
    }

    //Insere elemento no topo da pilha |
    public void Push(int elemento){
        No novo = new No(elemento, this.topo);
        this.topo = novo;
        //caso haja tamanho definido e a pilha esteja cheia (quantidade de elementos = tamanho máximo).
        if(this.tamanho_max > 0 && this.tamanho_atual == this.tamanho_max){
            No anterior = null;
            //percorre os nós, por meio de uma variável auxiliar do tipo No até encontrar o nulo.
            for(No auxiliar = this.topo; auxiliar != null; auxiliar = auxiliar.getProx()){
                //caso o próximo elemento seja nulo, o auxiliar na posição atual se tornará nulo para inserção do elemento.
                if(auxiliar.getProx()==null){
                    anterior.setProx(auxiliar.getProx());
                    break;
                }
                anterior = auxiliar;
            }
        }
        else{
            this.tamanho_atual++;
        }
    }

    //Remove elemento no topo da pilha | - Método LIFO (Last-in-First-out)
    public void Pop(){
        //em caso de pilha vazia, retorna mensagem para o usuário.
        if(PilhaVazia()){
            System.out.println("[ PILHA VAZIA! ]");
        }
        //remove o elemento no topo da pilha, último inserido.
        else{
            this.topo = this.topo.getProx();
            this.tamanho_atual--;
        }
    }

    //Esvazia a pilha |
    public void Esvaziar(){
        //transforma a referência em nulo, apagando os nós sucessores.
        this.topo = null;
        this.tamanho_atual = 0;
        System.out.println("\n - A Pilha foi Esvaziada");
    }

    //Imprime os elementos na pilha |
    public void Imprimir(){
        String pilha = "";
        //retorna mensagem para o usuário, em caso de pilha vazia.
        if(PilhaVazia()){
            System.out.println("\n [ PILHA VAZIA! ]");
        }
        else{
            //percorre os nós, por meio de uma variável auxiliar do tipo No até encontrar o nulo.
            for(No auxiliar = this.topo; auxiliar != null; auxiliar = auxiliar.getProx()){
                pilha += "| ["+auxiliar.getInfo()+"]\n";
            }
            //impressão da variável pilha.
            System.out.println("\n"+pilha);
            System.out.println(" - Tamanho da Pilha: "+this.tamanho_atual);
        }
    }
    
}
