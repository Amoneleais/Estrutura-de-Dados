package listas;
/**
 * ListaEncadeada
 */
public class ListaEncadeada {

    private No ref;
    private int tamanho;

    public ListaEncadeada(){
        
    }

    // * Verifica se a lista está vazia
    public boolean listaVazia(){    
        return this.ref == null;
    }

    // * Insere Elemento na Lista Encadeada
    public void inserir(int info){
        No novo = new No(info, this.ref);
        //referência se tornará o novo nó.
        this.ref = novo;
        this.tamanho++;
    }

    // * Remove Elemento na Lista Encadeada
    public void remover(int info){
        No anterior = null;
        //retorna mensagem para o usuário, em caso de lista vazia.
        if(listaVazia()){
            try {
                throw new Exception("[ LISTA VAZIA! ]");
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        //percorre os nós, por meio de uma variável auxiliar do tipo No até encontrar o nulo
        for(No auxiliar = this.ref; auxiliar != null; auxiliar = auxiliar.getProx()){
            //condicional, caso a info do nó atual ser igual ao elemento a ser removido.
            if(auxiliar.getInfo() == info){
                //caso o elemento seja a referência e haja sucessor.    
                if(auxiliar == this.ref){
                    this.ref = auxiliar.getProx();
                    this.tamanho--;
                    System.out.println(" \n"+info+" removido com sucesso!\n");
                    break;
                } 
                //caso não seja a referência.
                else {
                    anterior.setProx(auxiliar.getProx());
                    System.out.println(" \n"+info+" removido com sucesso!\n");
                    this.tamanho--;
                    break;
                }
            }
            //em caso de lista vazia ou elemento inexistente.
            else if(auxiliar.getProx() == null & auxiliar.getInfo() != info){
                try {
                    throw new Exception("[ REMOVER: ELEMENTO INEXISTENTE! ]");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            anterior = auxiliar;
        }
    }

    // * Esvazia a Lista |
    public void esvaziar(){
        //transforma a referência em nulo, apagando os nós sucessores.
        this.ref = null;
        this.tamanho = 0;
        System.out.println("\n - A Lista foi Esvaziada\n");
    }

    // * Buscar Elemento na Lista Encadeada
    public void buscar(int info){
        //retorna mensagem para o usuário, em caso de lista vazia.
        if(listaVazia()){
            try {
                throw new Exception("[ LISTA VAZIA! ]");
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        //percorre os nós, por meio de uma variável auxiliar do tipo No até encontrar o nulo.
        for(No auxiliar = this.ref; auxiliar != null; auxiliar = auxiliar.getProx()){
            if(auxiliar.getInfo() == info){
                //caso a informação do No seja igual ao elemento, retorna que o elemento existe na lista.
                System.out.println("\n "+info+" existente na lista!\n");
                break;
            }
            //caso o elemento não esteja inserido na lista, retorna mensagem para o usuário.
            else if(auxiliar.getProx() == null & auxiliar.getInfo() != info){
                try {
                    throw new Exception("[ BUSCAR: ELEMENTO INEXISTENTE! ]");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // * Imprime os Elementos da Lista Encadeada
    public void imprimir(){
        String lista = " ";
        //retorna mensagem para o usuário, em caso de lista vazia.
        if(listaVazia()){
            try {
                throw new Exception("[ LISTA VAZIA! ]");
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        //percorre os nós, por meio de uma variável auxiliar do tipo No até encontrar o nulo.
        for(No auxiliar = this.ref; auxiliar != null; auxiliar = auxiliar.getProx()){
            lista += "["+auxiliar.getInfo()+"] ";
        }
        //impressão da variável lista.
        System.out.println("\n"+lista);
        System.out.println(" Tamanho da Lista: "+this.tamanho+"\n");
    }
    
}
